package com.digital.bricklayer.springcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEstadoService {

    private final EstadoRepository estadoRepository;

    public UsuarioEstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Cacheable(cacheNames = "USUARIOESTADO", key = "#estado")
    public UsuarioEstado pegaPorEstado(String estado) {
        System.out.println("Estou indo buscar no bd");
        return estadoRepository.findByEstado(Estado.valueOf(estado.toUpperCase()));
    }

    @CacheEvict(value = "USUARIOESTADO", key = "#estado")
    public UsuarioEstado atualiza(String estado) {
        UsuarioEstado u = estadoRepository.findByEstado(Estado.valueOf(estado.toUpperCase()));
        u.setQtAcessos(u.getQtAcessos() * 2);
        return estadoRepository.save(u);
    }

    @CachePut(value = "USUARIOESTADO", key = "#estado")
    public UsuarioEstado atualizaV2(String estado) {
        UsuarioEstado u = estadoRepository.findByEstado(Estado.valueOf(estado.toUpperCase()));
        u.setQtAcessos(u.getQtAcessos() * 2);
        return estadoRepository.save(u);
    }
}
