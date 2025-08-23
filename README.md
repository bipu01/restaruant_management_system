# Restaurant Management System

A comprehensive Spring Boot-based restaurant management system designed to handle customer management, menu items, orders, employee management, and table reservations. This project was built for the Software Engineering subject, demonstrating modern web application development practices.

## Features

### Core Functionality
- **Customer Management**: Complete CRUD operations for customer profiles
- **Employee Management**: Staff management with role-based access control
- **Menu Management**: Comprehensive menu item management with categorization
- **Order Management**: Complete order lifecycle management
- **Table Management**: Restaurant table reservation and management system
- **Role-based Access Control**: Secure access management for different user types

### Technical Features
- **RESTful API**: Clean, RESTful endpoints for all operations
- **Database Integration**: MySQL database with JPA/Hibernate ORM
- **Exception Handling**: Global exception handling with custom error responses
- **Data Validation**: Input validation and error handling
- **Lombok Integration**: Reduced boilerplate code for cleaner models

## 🏗️ Architecture

### Technology Stack
- **Backend Framework**: Spring Boot 3.5.4
- **Java Version**: Java 17
- **Database**: MySQL 8.0
- **ORM**: Spring Data JPA with Hibernate
- **Build Tool**: Maven
- **Additional Libraries**: Lombok for code reduction

### Project Structure
```
src/main/java/com/crudSE/demo/
├── controller/          # REST API controllers
├── service/            # Business logic layer
├── repositories/       # Data access layer
├── models/            # Entity models and DTOs
├── DTOs/              # Data Transfer Objects
├── GlobalExceptionHandler/  # Exception handling
└── CrudAppSeApplication.java  # Main application class
```

### Design Patterns
- **MVC Architecture**: Separation of concerns between layers
- **Repository Pattern**: Data access abstraction
- **Service Layer**: Business logic encapsulation
- **DTO Pattern**: Data transfer optimization
- **Global Exception Handling**: Centralized error management

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- **Java 17** or higher
- **Maven 3.6+**
- **MySQL 8.0+**
- **Git** (for version control)
