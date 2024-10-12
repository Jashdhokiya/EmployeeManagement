package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public String addEmployee(@RequestBody com.example.employee.Employee employee) {
        if (service.isIDExists(employee.getID())) {
            return "ID already exists. Please provide a unique ID.";
        } else {
            service.saveEmployee(employee);
            return "Employee added successfully.";
        }
    }

    @GetMapping
    public List<com.example.employee.Employee> getAllEmployees() {
        return service.getAllEmployees();
    }
}
