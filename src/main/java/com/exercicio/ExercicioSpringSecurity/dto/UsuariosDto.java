package com.exercicio.ExercicioSpringSecurity.dto;

import com.exercicio.ExercicioSpringSecurity.model.UsuariosModel;
import lombok.Data;
@Data
public class UsuariosDto {
        private String nome;
        private String login;
        private String senha;


        public UsuariosDto(UsuariosModel usuariosModel){
            this.nome = usuariosModel.getNome();
            this.login = usuariosModel.getLogin();
            this.senha = usuariosModel.getSenha();
        }

}

