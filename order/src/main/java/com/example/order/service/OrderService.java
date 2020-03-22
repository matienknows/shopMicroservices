package com.example.order.service;


import com.example.order.entity.Order;
import com.example.order.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Optional<Order> getOrderById(int id){
        return orderRepository.findById(id);
    }

    public List<Order> getOrderList(){
        return orderRepository.findAll();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }
}
