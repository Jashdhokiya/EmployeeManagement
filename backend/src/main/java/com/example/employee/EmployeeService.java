package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public String addEmployee(Employee employee) {
        // Check if the ID already exists
        if (repository.existsById(employee.getID())) {
            return "ID already exists. Please provide a unique ID.";
        }

        repository.save(employee);
        return "Employee added successfully.";
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public boolean isIDExists(int id) {
        return repository.existsById(id);
    }
}
