package com.example.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int ID;
    private String name;
    private String email;

    // Default constructor
    public Employee() {}

    // Constructor with parameters
    public Employee(int id, String name, String email) {
        this.ID = id;
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
