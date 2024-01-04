package com.example.practical_exam.service.impl;

import com.example.practical_exam.entity.Employee;
import com.example.practical_exam.repository.EmployeeRepository;
import com.example.practical_exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository _employeeRepository;
    @Override
    public void createEmployee(Employee employee) {
        try {
            _employeeRepository.save(employee);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Employee> findAllEmployees() {
        return _employeeRepository.findAll();
    }
}
