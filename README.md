# CRUD Exercise with H2 – S04T02N01
This project is a basic CRUD using Spring Boot, H2 database, and JPA. The main entity is Fruit, with the following attributes: id, name, and quantityKg.

# Implemented Functionality
## ✔ Add a fruit: POST /fruita/add

## ✔ Update a fruit: PUT /fruita/update

## ✔ Delete a fruit by id: DELETE /fruita/delete/{id}

## ✔ Get one fruit by id: GET /fruita/getOne/{id}

## ✔ Get all fruits: GET /fruita/getAll

# Best Practices
ResponseEntity is used to return appropriate HTTP status codes.

A GlobalExceptionHandler class is implemented for centralized error handling.

The project follows the MVC structure with separated packages for controller, service, repository, model, and exception.

# Resources used
Spring Boot Documentation – Controllers & RequestMapping

Baeldung – Global Exception Handling with @ControllerAdvice

