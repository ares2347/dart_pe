package com.example.practical_exam.service.impl;

import com.example.practical_exam.entity.Customer;
import com.example.practical_exam.repository.CustomerRepository;
import com.example.practical_exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository _customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        try {
            return _customerRepository.save(customer);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new Customer();
        }
    }

    @Override
    public List<Customer> findAllCustomers() {
        return _customerRepository.findAll();
    }
}
