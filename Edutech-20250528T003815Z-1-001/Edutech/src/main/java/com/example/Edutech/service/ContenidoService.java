package com.example.Edutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.Contenido;
import com.example.Edutech.repository.ContenidoRepository;

@Service
public class ContenidoService {
    @Autowired
    private ContenidoRepository contenidoRepository;

    public String almacenar(Contenido contenido){
        if(contenidoRepository.findById(contenido.getId()).isPresent()){
            return "El contenido con este id, ya exite";
        }
        contenidoRepository.save(contenido);
        return "Contenido guardado con exito";
    }

    public List<Contenido> listar(){
        return contenidoRepository.findAll();
    }
}
