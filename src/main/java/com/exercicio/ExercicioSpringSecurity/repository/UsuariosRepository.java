package com.exercicio.ExercicioSpringSecurity.repository;

import com.exercicio.ExercicioSpringSecurity.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {

}
