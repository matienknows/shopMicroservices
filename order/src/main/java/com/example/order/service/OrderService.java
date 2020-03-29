package com.example.order.service;


import com.example.order.entity.Orders;
import com.example.order.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getOrderList(){
        return orderRepository.findAll();
    }

    public Orders getOrderById(int id){
        return orderRepository.findById(id).get();
    }
    public void addOrders(Orders orders){
        orderRepository.save(orders);
    }
}
