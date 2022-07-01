package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
