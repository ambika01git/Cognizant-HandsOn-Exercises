# Exercise 9 – Creating a Spring Boot Application

## Library Management System

### Objective

Develop a Spring Boot application for a Library Management System to simplify configuration and deployment.

### Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Eclipse IDE

### Features

- Spring Boot Application
- RESTful Web Services
- CRUD Operations for Book Management
- Spring Data JPA Repository
- H2 In-Memory Database
- Maven Build Management

### REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /books | Add a new book |
| GET | /books | Get all books |
| GET | /books/{id} | Get book by ID |
| PUT | /books/{id} | Update book |
| DELETE | /books/{id} | Delete book |

### How to Run

1. Import the project as a Maven Project in Eclipse.
2. Update Maven Dependencies.
3. Run `LibraryManagementApplication.java`.
4. Open Postman and test the REST APIs.

### Expected Result

The application starts successfully and provides REST APIs for performing CRUD operations on the Book entity using an H2 in-memory database.

### Author

**Ambika Mishra**
