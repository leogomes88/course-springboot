package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
