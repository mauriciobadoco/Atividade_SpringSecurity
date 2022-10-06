package com.exercicio.ExercicioSpringSecurity.controller;

import com.exercicio.ExercicioSpringSecurity.dto.UsuariosDto;
import com.exercicio.ExercicioSpringSecurity.model.UsuariosModel;
import com.exercicio.ExercicioSpringSecurity.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    UsuariosService service;

    @GetMapping (path = "/usuarios")
    public ResponseEntity<List<UsuariosModel>> buscar(){
        return ResponseEntity.ok(service.buscar());
    }

    @GetMapping (path = "/usuarios/dto")
    public ResponseEntity<List<UsuariosDto>> buscarDto(){
        return ResponseEntity.ok(service.buscarDto());
    }

    @PostMapping (path = "/usuarios")
    public ResponseEntity<UsuariosModel> cadastrar (@RequestBody UsuariosModel usuariosModel){
        return new ResponseEntity<>(service.cadastrar(usuariosModel), HttpStatus.CREATED);
    }


}
