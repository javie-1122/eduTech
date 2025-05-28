package com.example.Edutech.dto;

import java.util.ArrayList;
import java.util.List;



public class UsuarioDTO {
    private int id;
    private String correo;
    private String clave;
    private int idEstadoUsuario;
    private int idRolUsuario;
    private List<UsuarioCursoDTO> usuarioCursoDTOs;

    public UsuarioDTO(){
        this.id = 0;
        this.correo = "";
        this.clave = "";
        this.idEstadoUsuario = 0;
        this.idRolUsuario = 0;
        this.usuarioCursoDTOs = new ArrayList<>();
    }

    public UsuarioDTO(int id, String correo, String clave, int idEstadoUsuario, int idRolUsuario, List<UsuarioCursoDTO> usuarioCursoDTOs){
        this.id = 0;
        this.correo = correo;
        this.clave = clave;
        this.idEstadoUsuario = 0;
        this.idRolUsuario = 0;
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

    public int getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public int getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(int idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public List<UsuarioCursoDTO> getUsuarioCursoDTOs() {
        return usuarioCursoDTOs;
    }

    public void setUsuarioCursoDTOs(List<UsuarioCursoDTO> usuarioCursoDTOs) {
        this.usuarioCursoDTOs = usuarioCursoDTOs;
    }

    

    

    

    

    
}
