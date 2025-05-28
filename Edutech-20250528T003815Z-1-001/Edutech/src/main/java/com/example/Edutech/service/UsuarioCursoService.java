package com.example.Edutech.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.dto.UsuarioCursoDTO;
import com.example.Edutech.model.Usuario;
import com.example.Edutech.model.UsuarioCurso;
import com.example.Edutech.repository.UsuarioCursoRepository;
import com.example.Edutech.repository.UsuarioRepository;



@Service
public class UsuarioCursoService {
    @Autowired 
    private UsuarioCursoRepository usuarioCursoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String almacenar(UsuarioCurso usuarioCurso){
        
        if(usuarioCursoRepository.existsById(usuarioCurso.getId())){
            return "El id ingresado ya existe";
        }else
            usuarioCursoRepository.save(usuarioCurso);
            return "usuario agregado ";
    }
    
    public List<UsuarioCurso> listar(){
        return usuarioCursoRepository.findAll();
    }

    public String asignarUsuario(UsuarioCursoDTO dto){
        if(!usuarioCursoRepository.existsById(dto.getId())){
            return "El id ingresado no existe";
        }else if(!usuarioRepository.existsById(dto.getIdUsuario())){
            return "El id ingresado no existe";
        }else{
            UsuarioCurso usuarioCurso = usuarioCursoRepository.findById(dto.getId()).get();
            Usuario usuario = usuarioRepository.findById(dto.getIdUsuario()).get();
            
            usuarioCurso.setUsuario(usuario);
            usuarioCursoRepository.save(usuarioCurso);
            return " Usuario ingresado con exito";
        }
    }
}
