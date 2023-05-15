package com.digital.bricklayer.springcache;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<UsuarioEstado, Long> {

    UsuarioEstado findByEstado(Estado estado);
}
