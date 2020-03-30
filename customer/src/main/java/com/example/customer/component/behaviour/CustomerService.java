package com.example.customer.component.behaviour;


import com.example.customer.component.structure.Customer;
import com.example.customer.configuration.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
