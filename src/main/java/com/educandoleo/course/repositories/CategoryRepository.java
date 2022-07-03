package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}