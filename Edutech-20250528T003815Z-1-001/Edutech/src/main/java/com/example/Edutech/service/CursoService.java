package com.example.Edutech.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.Curso;

import com.example.Edutech.repository.CursoRepository;


@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    

    public String almacenar(Curso curso){
        if(cursoRepository.findById(curso.getId_curso()).isPresent()){
            return "El curso de id " + curso.getId_curso() + " ya existe";
        }
        
        cursoRepository.save(curso);
        return "curso registrado con exito";
    }

    public List<Curso> listar(){
        return cursoRepository.findAll();
    }
    
    
}
