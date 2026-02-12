## Scooter Parking API – Endterm Project\

## Project Overview
This project is developed as an Endterm assignment for the course.

## It is a Spring Boot RESTful API that demonstrates:
1) CRUD operations
2) Layered architecture
3) SOLID principles
4) Design patterns
5) In-memory caching (Bonus Task)
6) The application manages users in a scooter parking system.
   

## Technologies Used
1) Java 17
2) Spring Boot
3) Spring Data JPA
4) H2 In-Memory Database
5) Maven
6) Postman


## Project Structure
The project follows a layered architecture:

• controller – REST controllers
• service – business logic
• repository – database access layer
• model – entity classes
• patterns – design patterns (Factory, Builder)
• utils – utility/helper classes
• cache – in-memory caching layer (Bonus Task)

Layered architecture is preserved:
Controller → Service → Repository


## REST API Endpoints

## Get all users
GET /users

## Create user
POST /users

## Request body example:

## Update user
PUT /users/{id}

{
  "name": "David",
  "rating": 4.5
}

## DELETE /users/{id}
Delete user
{
  "name": "David Updated",
  "rating": 4.8
}


## Bonus Task – In-Memory Caching Layer

## Objective
To improve application performance by implementing a simple in-memory caching mechanism for frequently accessed data.

## Implementation Details
A custom SimpleCache class was implemented using the Singleton pattern to ensure that only one cache instance exists in the application.

The cache is stored entirely in memory using:

HashMap<String, Object>


The getAllUsers() method in the service layer is cached.

How It Works

On the first request to GET /users, data is retrieved from the database and stored in memory.

On subsequent requests, the cached data is returned instead of querying the database again.

This reduces unnecessary database access and improves response time.

Cache Invalidation

To maintain data consistency, the cache is automatically cleared after:

create operations

update operations

delete operations

This guarantees that outdated data is never returned.

Design Constraints Satisfaction

Cache is stored fully in memory

Singleton pattern ensures a single cache instance

SOLID principles are respected

Layered architecture is preserved

Cache logic is implemented inside the service layer

Controllers and repositories remain unchanged

Design Patterns Used

Factory Pattern – used to create User objects

Builder Pattern – used for flexible and readable creation of User objects

Singleton Pattern – used for the caching layer

Database

H2 in-memory database is used.
Database schema is generated automatically by Hibernate.

API Testing

All endpoints were tested using Postman.

How to Run the Application

Open the project in IntelliJ IDEA

Load Maven dependencies

Run ScooterParkingApiApplication

Open Postman or browser:

http://localhost:8080
