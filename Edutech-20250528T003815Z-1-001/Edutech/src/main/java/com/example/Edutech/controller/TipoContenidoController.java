package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.TipoContenido;
import com.example.Edutech.service.TipoContenidoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/tipocontenidos")
public class TipoContenidoController {
    @Autowired
    private TipoContenidoService tipoContenidoService;

    @PostMapping     
    public String almacenar(@RequestBody TipoContenido tipoContenido){
        return tipoContenidoService.almacenar(tipoContenido);
    }

    @GetMapping      
    public List<TipoContenido> listar() {
        return tipoContenidoService.listar();
    }    
    
    
}
