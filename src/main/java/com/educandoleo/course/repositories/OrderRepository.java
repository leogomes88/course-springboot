package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
