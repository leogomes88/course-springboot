package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}