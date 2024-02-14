# Goal Tracking System RESTful API

This API provides endpoints for managing goals, including CRUD operations.

## Endpoints

- `GET /goals`: Retrieve all goals
- `GET /goals/{id}`: Retrieve a specific goal by ID
- `POST /goals`: Create a new goal
- `PUT /goals/{id}`: Update a goal
- `DELETE /goals/{id}`: Delete a goal

## Setup

1. Clone the repository
2. Run the application using Maven: `mvn spring-boot:run`
3. The API will be available at `http://localhost:8080`

## Technologies Used

- Java
- Spring Boot
- Maven
- JSON
- JUnit
- Mockito

## Notes

- Data is stored in a JSON file (`goals.json`)
- Exception handling is implemented throughout the application
- Inheritance is demonstrated in the `GoalRepositoryImpl` class, which implements the `GoalRepository` interface
- HTTP Methods are used according to the RESTful principles
