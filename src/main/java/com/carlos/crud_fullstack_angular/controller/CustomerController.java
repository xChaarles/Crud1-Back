package com.carlos.crud_fullstack_angular.controller;

import com.carlos.crud_fullstack_angular.entity.Customer;
import com.carlos.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

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

    //localhost:8080
    @GetMapping
    public List<Customer> findALL(){
        return customerService.findALL();
    }

    //localhost:8080/1
    @GetMapping("/{id}")
    public Customer findById (@PathVariable Integer id){
        return customerService.findById(id);
    }

    //localhost/8080/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }
}
