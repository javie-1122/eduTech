package com.example.Edutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.TipoContenido;
import com.example.Edutech.repository.TipoContenidoRepository;

@Service
public class TipoContenidoService {
    @Autowired
    private TipoContenidoRepository tipoContenidoRepository;

    public String almacenar(TipoContenido  tipoContenido){
        if(tipoContenidoRepository.findById(tipoContenido.getId()).isPresent()){
            return "El tipo de contenido con ese id ya existe";
        }
        tipoContenidoRepository.save(tipoContenido);
        return "El contenido a sido ingresado con exito";
    }

    public List<TipoContenido> listar(){
        return tipoContenidoRepository.findAll();
    }
}
