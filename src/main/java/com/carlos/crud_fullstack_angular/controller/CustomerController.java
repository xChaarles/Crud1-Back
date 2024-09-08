package com.carlos.crud_fullstack_angular.controller;

import com.carlos.crud_fullstack_angular.entity.Customer;
import com.carlos.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//https://localhost:8080/api/customers
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
            this.customerService = customerService;
    }
    //https://localhost:8080/api/customers
    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    //https://localhost:8080/api/customers
    @GetMapping
    public List<Customer> findALL(){
        return customerService.findALL();
    }

    //https://localhost:8080/api/customers/1
    @GetMapping("/{id}")
    public Customer findById (@PathVariable Integer id){
        return customerService.findById(id);
    }

    //https://localhost/8080/api/customers/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    //https://localhost:8080/api/customers
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        customerDb.setFirstname(customer.getFirstname());
        customerDb.setLastname(customer.getLastname());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customerDb);
    }
}
