package com.nikpa.thymeleaf_demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nikpa.thymeleaf_demo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    
    // load employee data
    private List<Employee> theEmployees;

    @PostConstruct
    private void loadData() {
        
        // create employees
        Employee emp1 = new Employee(1, "Monkey D.", "Luffy", "pithikos@op.com");
        Employee emp2 = new Employee(2, "Monkey D.", "Dragon", "drakos@op.com");
        Employee emp3 = new Employee(3, "Monkey D.", "Garp", "mpampas@op.com");
        Employee emp4 = new Employee(4, "Monkey D.", "????", "question@op.com");
    
        // create the list
        theEmployees = new ArrayList<>();

        // add to list
        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);
        theEmployees.add(emp4);

    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}
