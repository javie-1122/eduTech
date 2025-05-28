package com.example.Edutech.dto;


public class CursoDTO {
    private int id_curso;
    private String nombre;
    private String descripcion;
    private int valor;
    private int idUsuario;

    public CursoDTO(){
        this.id_curso = 0;
        this.nombre = "";
        this.descripcion = "";
        this.valor = 0;
        this.idUsuario = 0;
    }

    public CursoDTO(String id_curso, String nombre, String descripcion, int valor, int idUsuario){
        this.id_curso = 0;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = 0;
        this.idUsuario = 0;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    

    
    
    
}
