package com.example.customer.service;


import com.example.customer.entity.Customer;
import com.example.customer.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerById(int id) {
       return customerRepository.findById(id).get();

    }
    public List<Customer> getCustomerList(){
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
