package com.example.Edutech.dto;

public class EstadoUsuarioDTO {
    private int id;
    private String descripcion;
    
    public EstadoUsuarioDTO() {
    }

    public EstadoUsuarioDTO(int id, String descripcion) {
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
