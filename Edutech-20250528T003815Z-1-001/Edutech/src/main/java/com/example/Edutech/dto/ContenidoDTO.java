package com.example.Edutech.dto;

public class ContenidoDTO {
    private int id;
    private String nombre;
    private int idCurso;
    private int idTipoContenido;
    
    public ContenidoDTO() {
    }

    public ContenidoDTO(int id, String nombre, int idCurso, int idTipoContenido) {
        this.id = id;
        this.nombre = nombre;
        this.idCurso = idCurso;
        this.idTipoContenido = idTipoContenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdTipoContenido() {
        return idTipoContenido;
    }

    public void setIdTipoContenido(int idTipoContenido) {
        this.idTipoContenido = idTipoContenido;
    }

    
}
