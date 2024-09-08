package com.carlos.crud_fullstack_angular.service;

import com.carlos.crud_fullstack_angular.entity.Customer;

import java.util.List;

public interface CustomerService {
     Customer save(Customer customer);
     List<Customer> findALL();
     Customer findById (Integer id);
     void deleteById(Integer id);
     Customer update(Customer customer);
}
