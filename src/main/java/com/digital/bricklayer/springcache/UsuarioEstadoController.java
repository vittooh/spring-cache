package com.digital.bricklayer.springcache;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/usuario-estado")
@RestController
public class UsuarioEstadoController {

    private final UsuarioEstadoService estadoService;

    public UsuarioEstadoController(UsuarioEstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping("/por-estado/{estado}")
    public UsuarioEstado pegaUsuarioEstado(@PathVariable("estado") String estado) {
        return estadoService.pegaPorEstado(estado);
    }

    @PutMapping("/{estado}")
    public UsuarioEstado atualiza(@PathVariable("estado") String estado) {
        return estadoService.atualiza(estado);
    }

    @PutMapping("/put/{estado}")
    public UsuarioEstado atualizaV2(@PathVariable("estado") String estado) {
        return estadoService.atualizaV2(estado);
    }
}
