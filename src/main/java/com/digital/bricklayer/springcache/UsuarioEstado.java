package com.digital.bricklayer.springcache;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "usuarios_estado")
public class UsuarioEstado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Estado estado;

    private Long qtAcessos;

    public UsuarioEstado(Long id, Estado estado, Long qtAcessos) {
        this.id = id;
        this.estado = estado;
        this.qtAcessos = qtAcessos;
    }

    public UsuarioEstado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Long getQtAcessos() {
        return qtAcessos;
    }

    public void setQtAcessos(Long qtAcessos) {
        this.qtAcessos = qtAcessos;
    }
}
