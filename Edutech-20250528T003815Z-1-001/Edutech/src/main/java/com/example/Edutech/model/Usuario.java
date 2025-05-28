package com.example.Edutech.model;


import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String correo;
    private String clave;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioCurso> usuarioCurso = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "estadousuario_id")
    private EstadoUsuario estadoUsuario;

    @ManyToOne
    @JoinColumn(name = "rolusuario_id")
    private RolUsuario rolUsuario;

    public Usuario(){
        this.id = 0;
        this.correo = "";
        this.clave = "";
        this.estadoUsuario = new EstadoUsuario();
        this.rolUsuario = new RolUsuario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<UsuarioCurso> getUsuarioCurso() {
        return usuarioCurso;
    }

    public void setUsuarioCurso(List<UsuarioCurso> usuarioCurso) {
        this.usuarioCurso = usuarioCurso;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    
    
    
    

    
}
