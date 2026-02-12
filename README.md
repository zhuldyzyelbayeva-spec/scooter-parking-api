# Scooter Parking API – Endterm Project

## Project Overview

It is a Spring Boot RESTful API that demonstrates:
- CRUD operations
- Layered architecture
- Design patterns
- SOLID principles
- In-memory caching mechanism (Bonus Task)

The application manages users in a scooter parking system.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Postman

---

## Project Architecture

The project follows a layered architecture:

- controller – REST endpoints
- service – business logic
- repository – data access layer
- model – entity classes
- patterns – Factory and Builder patterns
- cache – Singleton in-memory caching layer
- utils – helper classes

The architecture respects SOLID principles and separation of concerns.

---

## REST API Endpoints

### Get all users
GET /users

### Create user
POST /users

Example request body:
{
  "name": "David",
  "rating": 4.5
}

### Update user
PUT /users/{id}

### Delete user
DELETE /users/{id}

---

## Design Patterns Used

### Factory Pattern
Used to create User objects based on type (e.g., VIP user).

### Builder Pattern
Used for flexible and readable object creation.

### Singleton Pattern
Used in the caching layer to ensure only one cache instance exists.

---

# Bonus Task - Simple In-Memory Cache

## Objective

Enhance application performance by implementing a simple in-memory caching mechanism for frequently requested data.


## Implementation Details

A custom caching layer was implemented using:

- HashMap for in-memory storage
- Singleton pattern to guarantee a single cache instance
- Manual cache invalidation strategy

The method `getAllUsers()` is cached.

Repeated calls return cached data instead of querying the database again.


## Cache Invalidation Strategy

The cache is automatically cleared after:

- create operations
- update operations
- delete operations

This ensures data consistency while improving read performance.


## Design Constraints Satisfaction

- Cache stored fully in memory
- Only one cache instance exists (Singleton)
- Layered architecture preserved
- SOLID principles maintained
- No external caching libraries used

---


## Database

The project uses H2 in-memory database.
The schema is generated automatically by Hibernate.

H2 Console:
http://localhost:8080/h2-console

---


## How to Run the Application

1. Open the project in IntelliJ IDEA
2. Load Maven dependencies
3. Run ScooterParkingApiApplication
4. Application runs at:
http://localhost:8080


---


## API Testing

All endpoints were tested using Postman.
Screenshots are available in:
docs/screenshots
