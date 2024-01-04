package com.example.practical_exam.controller;

import com.example.practical_exam.entity.Employee;
import com.example.practical_exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService _employeeService;

    @GetMapping("/form")
    public String getForm(ModelMap modelMap) {
        String view = "formEmployee";
        try {
            Employee employee = new Employee();
            modelMap.addAttribute("employee", employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        String view = "redirect:/employee/list";
        try {
            _employeeService.createEmployee(employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }

    @GetMapping("list")
    public String getList(ModelMap modelMap) {
        String view = "listEmployee";
        try {
            List<Employee> employees = _employeeService.findAllEmployees();
            modelMap.addAttribute("employees", employees);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }
}
