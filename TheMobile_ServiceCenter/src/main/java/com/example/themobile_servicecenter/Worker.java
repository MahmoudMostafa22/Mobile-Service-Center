package com.example.themobile_servicecenter;

import java.util.Date;

public class Worker extends Person {
    private String role;
    private String id;
    private String Email;
    private double salary;

    public Worker(String name, int age, int phonenumber, String role, String id, String email, double salary) {
        super(name, age, phonenumber);
        this.role = role;
        this.id = id;
        Email = email;
        this.salary = salary;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}