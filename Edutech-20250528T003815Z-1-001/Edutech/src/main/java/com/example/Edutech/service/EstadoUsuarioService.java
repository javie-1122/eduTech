package com.example.Edutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.EstadoUsuario;
import com.example.Edutech.repository.EstadoUsuarioRepository;


@Service
public class EstadoUsuarioService {
    @Autowired
    private EstadoUsuarioRepository estadoUsuarioRepository;

    public String almacenar(EstadoUsuario estadoUsuario){
        if(estadoUsuarioRepository.findById(estadoUsuario.getId()).isPresent()){
            return "El estado de id " + estadoUsuario.getId() + " ya existe";
        }
        estadoUsuarioRepository.save(estadoUsuario);
        return "El estado a sido guardado con exito";
    }

    public List<EstadoUsuario> listar(){
        return estadoUsuarioRepository.findAll();
    }

}
