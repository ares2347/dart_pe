package com.example.practical_exam.service;

import com.example.practical_exam.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);
    List<Employee> findAllEmployees();
}
