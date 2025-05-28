package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.EstadoUsuario;
import com.example.Edutech.service.EstadoUsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/estadousuarios")
public class EstadoUsuarioController {
    @Autowired
    private EstadoUsuarioService estadoUsuarioService;

    @PostMapping
    public String almacenar(@RequestBody EstadoUsuario estadoUsuario){
        return estadoUsuarioService.almacenar(estadoUsuario);
    }
    
    @GetMapping   
    public List<EstadoUsuario> listar(){
        return estadoUsuarioService.listar();
    }
    
    
}
