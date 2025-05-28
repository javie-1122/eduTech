package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.dto.UsuarioCursoDTO;
import com.example.Edutech.model.UsuarioCurso;
import com.example.Edutech.service.UsuarioCursoService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/usuariocursos")
public class UsuarioCursoController {
    @Autowired
    private UsuarioCursoService usuarioCursoService;

    @PostMapping        
    public String almacenar(@RequestBody UsuarioCurso usuarioCurso){
        return usuarioCursoService.almacenar(usuarioCurso);
    }

    @GetMapping     
    public List<UsuarioCurso> listar(){
        return usuarioCursoService.listar();
    }

    @PostMapping("/asignar")
    public String asignarUsuario(@RequestBody UsuarioCursoDTO dto){
        return usuarioCursoService.asignarUsuario(dto);
    }
}
