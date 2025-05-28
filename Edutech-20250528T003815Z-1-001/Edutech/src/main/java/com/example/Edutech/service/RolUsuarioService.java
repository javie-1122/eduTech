package com.example.Edutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.RolUsuario;
import com.example.Edutech.repository.RolUsuarioRepository;

@Service
public class RolUsuarioService {
    @Autowired
    private RolUsuarioRepository rolUsuarioRepository;

    public String almacenar(RolUsuario rolUsuario){
        if(rolUsuarioRepository.findById(rolUsuario.getId()).isPresent()){
            return "El rol con ese id ya existe";
        }
        rolUsuarioRepository.save(rolUsuario);
        return "El rol a sido guardado con exito";
    }

    public List<RolUsuario> listar(){
        return rolUsuarioRepository.findAll();
    }
}
