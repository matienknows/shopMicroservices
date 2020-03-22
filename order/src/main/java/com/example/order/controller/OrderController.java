package com.example.order.controller;


import com.example.order.entity.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getOrderList() {
        return orderService.getOrderList();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }


}
