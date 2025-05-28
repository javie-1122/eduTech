package com.example.Edutech.dto;

public class RolUsuarioDTO {
    private int id;
    private String descripcion;
    
    public RolUsuarioDTO() {
    }

    public RolUsuarioDTO(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
