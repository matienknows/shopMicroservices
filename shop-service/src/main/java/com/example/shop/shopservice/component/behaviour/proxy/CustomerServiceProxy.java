package com.example.shop.shopservice.component.behaviour.proxy;


import com.example.shop.shopservice.component.structure.Shop;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("customer-service")
public interface CustomerServiceProxy {

    @GetMapping("/customer/customerid/{id}")
    public Shop retrieveCustomer(@PathVariable("id") int id);

}


