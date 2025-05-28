package com.example.Edutech.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;
    private String nombre;
    private String descripcion;
    private int valor;
    
    @OneToMany(mappedBy = "curso")
    private List<UsuarioCurso> usuarioCurso = new ArrayList<>();
    
    @OneToMany(mappedBy = "curso") 
    private List<Contenido> contenidos = new ArrayList<>();

    public Curso(){
        this.id_curso = 0;
        this.nombre = "";
        this.descripcion = "";
        this.valor = 0;
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

    public List<UsuarioCurso> getUsuarioCurso() {
        return usuarioCurso;
    }

    public void setUsuarioCurso(List<UsuarioCurso> usuarioCurso) {
        this.usuarioCurso = usuarioCurso;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    

    

    
    
    
    
    

}
