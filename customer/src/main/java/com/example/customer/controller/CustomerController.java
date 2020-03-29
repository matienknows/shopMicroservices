package com.example.customer.controller;


import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value="/customerid/{id}")
    public Customer retrieveCustomer(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

}
