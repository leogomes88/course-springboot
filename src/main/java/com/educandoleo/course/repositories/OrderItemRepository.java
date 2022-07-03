package com.educandoleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoleo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
