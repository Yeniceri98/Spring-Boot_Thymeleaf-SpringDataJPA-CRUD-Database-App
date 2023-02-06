package com.demo.controller;

import com.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        Employee emp1 = new Employee(1, "Ahmet", "Yeniceri", "ahmet@gmail.com");
        Employee emp2 = new Employee(2, "Enner", "Valencia", "enner@gmail.com");
        Employee emp3 = new Employee(3, "Caroline", "Barbara", "caroline@gmail.com");

        // Create the list
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        theModel.addAttribute("employees", employeeList);

        return "employees-table";

    }

}
