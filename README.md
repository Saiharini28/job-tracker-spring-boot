# 🚀 Job Application Tracker

A full-stack Job Application Tracker that helps users organize and monitor their job applications from one centralized dashboard.

The application allows users to add, edit, delete, search, filter, and sort job applications while securely storing resumes and providing direct access to job posting links.

---

## ✨ Features

- 📊 Interactive Dashboard
  - Total Applications
  - Applied Jobs
  - Interviews
  - Offers
  - Rejections

- 📈 Application Status Analytics
  - Professional Doughnut Chart
  - Real-time statistics

- 📝 Job Management
  - Add new application
  - Update existing application
  - Delete application

- 🔍 Search & Filter
  - Search by Company
  - Filter by Status
  - Sort by:
    - Latest Applied Date
    - Oldest Applied Date
    - Company A-Z
    - Company Z-A

- 📄 Resume Management
  - Upload Resume (PDF)
  - Open uploaded resume directly from dashboard

- 🔗 Job Links
  - Save job posting URL
  - Open original job post in one click

- 📅 Interview Tracking
  - Store interview dates
  - Keep application notes

- 🎨 Modern Responsive UI
  - Clean dashboard
  - Professional card layout
  - Responsive design
  - Interactive charts

---

## 🛠 Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Chart.js

### Backend
- Spring Boot
- Spring MVC
- REST API

### Database
- MySQL

### Build Tool
- Maven

---

## 📂 Project Structure

```
Job-Application-Tracker
│
├── backend
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   └── uploads
│
├── frontend
│   └── index.html
│
├── database
│   └── schema.sql
│
└── README.md
```

---

## 📸 Screenshots

### Dashboard

> Add your dashboard screenshot here

```
/screenshots/dashboard.png
```

### Job Cards

> Add your job cards screenshot here

```
/screenshots/jobs.png
```

### Analytics

> Add your chart screenshot here

```
/screenshots/chart.png
```

---

## ⚙️ Installation

### 1. Clone Repository

```bash
git clone https://github.com/yourusername/job-application-tracker.git
```

### 2. Navigate to Project

```bash
cd job-application-tracker
```

### 3. Configure MySQL

Create a database.

```sql
CREATE DATABASE job_tracker;
```

Update:

```
application.properties
```

with your MySQL username and password.

---

### 4. Run Spring Boot

```bash
mvn spring-boot:run
```

Backend runs on

```
http://localhost:8081
```

---

### 5. Open Frontend

Open

```
index.html
```

in your browser.

---

## 📁 Resume Upload

Uploaded resumes are stored inside:

```
uploads/
```

Each uploaded PDF can be opened directly from the application.

---

## 🔮 Future Improvements

- User Authentication
- Multiple User Accounts
- Email Notifications
- Resume Version History
- Company Logo Integration
- Dark Mode
- Calendar View
- Export Applications to Excel/PDF
- Interview Reminder Notifications
- Cloud File Storage (AWS S3)

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create your feature branch

```bash
git checkout -b feature-name
```

3. Commit changes

```bash
git commit -m "Added new feature"
```

4. Push

```bash
git push origin feature-name
```

5. Open a Pull Request

---

## 📜 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

Saiharini

If you found this project useful, consider giving it a ⭐ on GitHub.