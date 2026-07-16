# Module 7: Spring REST using Spring Boot 3

## Exercise 1: Spring REST using Spring Boot

## Objective

Demonstrate implementation of RESTful Web Services using Spring Boot 3.

## Description

This project demonstrates the development of RESTful Web Services using Spring Boot following Controller, Service, and DAO architecture.

The application implements REST APIs for Country, Employee, and Department resources.

## Technologies Used

* Java 17
* Spring Boot 3
* Spring REST
* Maven
* JUnit 5
* MockMVC

## REST Services Implemented

### Country REST Service

GET all countries:

```
GET /countries
```

GET country by code:

```
GET /countries/{code}
```

POST country:

```
POST /countries
```

### Employee REST Service

GET all employees:

```
GET /employees
```

Update employee:

```
PUT /employees
```

Delete employee:

```
DELETE /employees/{id}
```

### Department REST Service

GET all departments:

```
GET /departments
```

## Features Implemented

* REST Controller implementation

* Service layer implementation

* DAO layer implementation

* XML based static data configuration

* JSON request body mapping using @RequestBody

* Input validation using:

  * @NotNull
  * @NotBlank
  * @Size
  * @Min
  * @Valid

* Global exception handling

* Employee not found exception handling

* HTTP GET, POST, PUT and DELETE methods

* MockMVC test cases

## Project Structure

```
controller
service
dao
exception
resources
test
```

## Testing

REST APIs were tested using:

* Postman
* MockMVC

## Conclusion

Successfully implemented RESTful Web Services using Spring Boot 3 with validation, exception handling, and CRUD operations.
