package com.example.order.configuration;


import com.example.order.component.structure.Orders;
import com.example.order.component.behaviour.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_ms")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value="order_id/{id}")
    public Orders retrieveOrder(@PathVariable int id){
        return orderService.getOrderById(id);
    }



    @GetMapping
    public List<Orders> getOrderList(){
        return orderService.getOrderList();
    }

    @PostMapping
    public void addOrder(@RequestBody Orders orders){
        orderService.addOrders(orders);

    }

}
