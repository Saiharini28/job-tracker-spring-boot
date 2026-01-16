# Job Tracker Spring Boot Application

## Description
A Spring Boot REST API application to track job applications. 
This project allows users to add, view, and manage their job applications efficiently.

## Features
- Add new job applications with company name, role, and status
- View all job applications
- Update and manage job application status
- Clean project structure using Spring Boot, JPA, and Maven

## Tech Stack
- Java 17
- Spring Boot
- Maven
- H2 / MySQL Database
- VS Code / IntelliJ IDEA

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Saiharini28/job-tracker-spring-boot.git


Navigate to project folder:

cd jobtracker


Run the application:

.\mvnw spring-boot:run


Access the API:

http://localhost:8081/jobs

Sample Output
[
  {
    "id": 1,
    "company": "Google",
    "role": "SDE",
    "status": "Applied"
  }
]


## 🎯 Project Purpose

The Job Tracker Spring Boot Application is designed to help users track their job applications in an organized way.  
It allows users to store company name, job role, and application status through REST APIs.  
This project demonstrates backend development skills using Spring Boot, RESTful services, and layered architecture.

## 🔗 API Endpoints

| Method | Endpoint            | Description                     |
|------- |---------------------|---------------------------------|
| GET    | /jobs               | Fetch all job applications      |
| POST   | /jobs               | Add a new job application       |


Author
Saiharini


