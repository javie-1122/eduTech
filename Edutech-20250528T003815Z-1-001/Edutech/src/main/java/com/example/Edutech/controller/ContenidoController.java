package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.Contenido;
import com.example.Edutech.service.ContenidoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/contenidos")
public class ContenidoController {
    @Autowired
    private ContenidoService contenidoService;

    @PostMapping    
    public String almacenar(@RequestBody Contenido contenido){
        return contenidoService.almacenar(contenido);
    }

    @GetMapping         
    public List<Contenido> listar(){
        return contenidoService.listar();
    }
}
