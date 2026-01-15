package com.jobtracker.jobtracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String status;

    // No-arg constructor (REQUIRED by JPA)
    public Job() {
    }

    // Constructor WITHOUT id
    public Job(String company, String role, String status) {
        this.company = company;
        this.role = role;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    // No setter for id (JPA handles it)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
