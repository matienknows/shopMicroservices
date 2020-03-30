package com.example.order.component.behaviour;


import com.example.order.component.structure.Orders;
import com.example.order.configuration.OrderRepository;
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
