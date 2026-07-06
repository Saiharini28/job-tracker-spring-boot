# 🚀 Job Application Tracker

A full-stack **Job Application Tracking System** built using **Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript**. The application helps users organize and monitor job applications through an interactive dashboard with analytics, search, filtering, sorting, resume management, and CRUD operations.

---

# ✨ Features

- Add new job applications
- Update existing applications
- Delete job records
- Track application status
  - Applied
  - Interview
  - Offer
  - Rejected
- Search applications by company name
- Filter jobs by status
- Sort applications by:
  - Latest Applied Date
  - Oldest Applied Date
  - Company A–Z
  - Company Z–A
- Interactive dashboard with application statistics
- Professional Doughnut Chart using Chart.js
- Responsive Job Cards and Table View
- Upload and open Resume PDFs
- Add personal notes
- Save and open Job Application Links
- Track Interview Dates
- Clean and professional user interface

---

# 🛠️ Tech Stack

## Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

## Frontend
- HTML5
- CSS3
- JavaScript
- Chart.js

## Database
- MySQL

## Tools
- IntelliJ IDEA
- VS Code
- Git
- GitHub
- Postman

---

# 📁 Project Structure

```text
job-tracker-spring-boot/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/jobtracker/jobtracker/
│       │       ├── FileUploadController.java
│       │       ├── Job.java
│       │       ├── JobController.java
│       │       ├── JobTrackerApplication.java
│       │       ├── repository/
│       │       │   └── JobRepository.java
│       │       └── service/
│       │           ├── InterviewReminderScheduler.java
│       │           ├── JobService.java
│       │           ├── JobServiceImpl.java
│       │           └── SendGridEmailService.java
│       │
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
│
├── uploads/
├── pom.xml
└── README.md
```

---

# 📊 Dashboard Preview

The dashboard provides:

- 📈 Total Applications
- 📄 Applied Count
- 🎯 Interview Count
- 🎉 Offer Count
- ❌ Rejected Count
- 🍩 Interactive Doughnut Chart
- 🗂️ Job Cards
- 📋 Job Applications Table
- 🔍 Search
- 🎛️ Filter
- ↕️ Sort

---

# 🗄️ Database Fields

| Field | Description |
|-------|-------------|
| Company | Company name |
| Role | Job role |
| Status | Current application status |
| Applied Date | Date of application |
| Interview Date | Scheduled interview date |
| Resume Version | Uploaded Resume PDF |
| Notes | Personal notes |
| Job Link | Original Job Posting URL |

---

# 🌐 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/jobs` | Get all jobs |
| GET | `/jobs/{id}` | Get job by ID |
| POST | `/jobs` | Add a new job |
| PUT | `/jobs/{id}` | Update a job |
| DELETE | `/jobs/{id}` | Delete a job |
| POST | `/upload` | Upload Resume PDF |

---

# 🚀 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/Saiharini28/job-tracker-spring-boot.git
```

---

## 2. Navigate to the Project

```bash
cd job-tracker-spring-boot
```

---

## 3. Configure MySQL

Create a MySQL database and update **application.properties**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jobtracker
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 4. Run the Application

Using Maven

```bash
mvn spring-boot:run
```

Or run

```
JobTrackerApplication.java
```

from IntelliJ IDEA.

---

## 5. Access the Application

### Frontend

```
http://localhost:8081/
```

### REST API

```
http://localhost:8081/jobs
```

---

# 📸 Screenshots

## Dashboard

![Dashboard](screenshots/dashboard.png)

---

## Add Job Form

![Add Job Form](screenshots/add-job.png)

---


## Applications Table

![Applications Table](screenshots/job-table.png)

---

# 🚀 Future Enhancements

- User Authentication using Spring Security
- Email Interview Reminders
- Export Applications to Excel/PDF
- Advanced Dashboard Analytics
- Company Logo Support
- Pagination
- Dark Mode
- Mobile Responsive Improvements
- Resume Version History
- Role-Based Access Control

---

# 📚 Learning Outcomes

This project demonstrates practical experience with:

- RESTful API Development
- CRUD Operations
- Spring Boot Architecture
- Spring Data JPA
- Hibernate ORM
- MySQL Database Integration
- JavaScript Fetch API
- Dynamic DOM Manipulation
- File Upload Handling
- Dashboard UI Design
- Chart.js Data Visualization
- Responsive Web Design
- Git & GitHub Version Control

---

# 👩‍💻 Author

**SaiHarini**

GitHub: https://github.com/Saiharini28

---

# 📄 License

This project is licensed under the MIT License.