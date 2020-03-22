package com.example.order.repo;

import com.example.order.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.Order;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
