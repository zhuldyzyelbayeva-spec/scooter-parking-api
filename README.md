# Scooter Parking API – Endterm Project

## Project Overview
This project is developed as an Endterm assignment for the course.
It is a Spring Boot RESTful API that demonstrates CRUD operations, layered architecture,
design patterns, and SOLID principles.

The application manages users in a scooter parking system.

---

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Postman

---

## Project Structure
The project follows a layered architecture:

- controller – REST controllers
- service – business logic
- repository – database access layer
- model – entity classes
- patterns – design patterns (Factory, Builder)
- utils – utility/helper classes

---

## REST API Endpoints

### Get all users

---

### Create user

Request body example:
```json
{
  "name": "David",
  "rating": 4.5
}

PUT /users/{id}

{
  "name": "David Updated",
  "rating": 4.8
}

DELETE /users/{id}

API Testing
All endpoints were tested using Postman.
Screenshots of requests and responses are available in:

docs/screenshots

Design Patterns Used
Factory Pattern – used to create User objects based on input parameters
Builder Pattern – used for flexible and readable creation of User objects

Database
H2 in-memory database is used
Database schema is generated automatically by Hibernate

How to Run the Application:
1)Open the project in IntelliJ IDEA
2)Load Maven dependencies
3)Run ScooterParkingApiApplication

Open browser or Postman:  http://localhost:8080



















