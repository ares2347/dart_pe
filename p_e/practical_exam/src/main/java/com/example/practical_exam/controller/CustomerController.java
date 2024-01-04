package com.example.practical_exam.controller;

import com.example.practical_exam.entity.Customer;
import com.example.practical_exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService _customerService;

    @PostMapping(path = "/add")
    public ResponseEntity<Customer> addEmployee(@RequestBody Customer customer) {
        try {
            Customer result = _customerService.createCustomer(customer);
            return new ResponseEntity<Customer>(result, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<Customer>(new Customer(), HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> getList() {
        try {
            List<Customer> customers = _customerService.findAllCustomers();
            return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Customer>>(new ArrayList<Customer>(), HttpStatus.BAD_REQUEST);
        }
    }
}
