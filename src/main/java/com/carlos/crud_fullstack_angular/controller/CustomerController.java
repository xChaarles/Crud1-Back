package com.carlos.crud_fullstack_angular.controller;

import com.carlos.crud_fullstack_angular.entity.Customer;
import com.carlos.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
            this.customerService = customerService;
    }
    //localhost:8080/create
    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> findALL(){
        return customerService.findALL();
    }

}
