package com.example.Edutech.dto;

public class UsuarioCursoDTO {
    private int id;
    private int idUsuario;
    private int idCurso;
    
    public UsuarioCursoDTO() {
    }

    public UsuarioCursoDTO(int id, int idUsuario, int idCurso) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idCurso = idCurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    
}
