package com.exercicio.ExercicioSpringSecurity.service;

import com.exercicio.ExercicioSpringSecurity.dto.UsuariosDto;
import com.exercicio.ExercicioSpringSecurity.model.UsuariosModel;
import com.exercicio.ExercicioSpringSecurity.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository repository;

    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    public List<UsuariosModel> buscar(){
        return repository.findAll();
    }


    public UsuariosModel cadastrar( UsuariosModel usuariosModel){

        usuariosModel.setSenha(passwordEncoder().encode(usuariosModel.getSenha()));
        return repository.save(usuariosModel);
    }

    public List<UsuariosDto> buscarDto() {
        List<UsuariosModel> lista = repository.findAll();
        return lista.stream().map(UsuariosDto::new).collect(Collectors.toList());
    }
}
