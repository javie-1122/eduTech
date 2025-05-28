package com.example.Edutech.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.RolUsuario;
import com.example.Edutech.service.RolUsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/rolusuarios")

public class RolUsuarioController {
    @Autowired
    private RolUsuarioService rolUsuarioService;

    @PostMapping        
    public String almacenar(@RequestBody RolUsuario rolUsuario){
        return rolUsuarioService.almacenar(rolUsuario);
    }

    @GetMapping         
    public List<RolUsuario> listar(){
        return rolUsuarioService.listar();
    }
    
    
}
