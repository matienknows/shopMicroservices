package com.example.shop.shopservice.service;


import com.example.shop.shopservice.entity.Shop;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order-service")
public interface OrderServiceProxy {

    @GetMapping("/order_ms/order_id/{id}")
    public Shop retrieveOrder(@PathVariable("id") int id);

}
