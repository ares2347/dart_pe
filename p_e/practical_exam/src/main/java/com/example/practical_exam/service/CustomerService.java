package com.example.practical_exam.service;

import com.example.practical_exam.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> findAllCustomers();
}
