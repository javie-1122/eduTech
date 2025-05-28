package com.example.Edutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Edutech.model.Usuario;

import com.example.Edutech.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    public String almacenar(Usuario usuario){
        if(usuarioRepository.findById(usuario.getId()).isPresent()){
            return "El usuario " + usuario.getId() + " yA EXISTE";
        }

        usuarioRepository.save(usuario);
        return "Usuario registrado correctamente";
    }

    

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
    

}
