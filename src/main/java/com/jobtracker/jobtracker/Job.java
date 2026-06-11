package com.jobtracker.jobtracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String status;

    private LocalDate appliedDate;
    private String resumeVersion;
    private String notes;
    private String jobLink;

    // No-arg constructor (REQUIRED by JPA)
    public Job() {
    }

    // Constructor WITHOUT id
    public Job(String company, String role, String status,
               LocalDate appliedDate,
               String resumeVersion,
               String notes) {

        this.company = company;
        this.role = role;
        this.status = status;
        this.appliedDate = appliedDate;
        this.resumeVersion = resumeVersion;
        this.notes = notes;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public String getResumeVersion() {
        return resumeVersion;
    }

    public String getNotes() {
        return notes;
    }
    public String getJobLink() {
    return jobLink;
    }

    // Setters

    public void setCompany(String company) {
        this.company = company;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public void setResumeVersion(String resumeVersion) {
        this.resumeVersion = resumeVersion;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setJobLink(String jobLink) {
    this.jobLink = jobLink;
    }
}