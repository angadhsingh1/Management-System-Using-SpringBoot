# Management-System-Using-SpringBoot

Note to the reader:
1. This application only utilizes backend configuration, which means I created a sample database of students
   with their occupation type. This project is limited by the fact that any user can update or delete any student    informaiton in the Management system. The backend is consists of caching to increase efficiency. 


# Employee Management System (Backend)

This is a backend implementation of an Employee Management System built using Spring Boot framework. It provides APIs for managing employee data, including creating new employees, updating their information, deleting them, and retrieving employee information.

## Technologies Used

* Spring Boot Framework
* Spring Data JPA
* H2 database

## Getting Started

### Prerequisites

* Java 8 or later
* H2 database

## API Endpoints

The following APIs are available for managing employee data:

### Get All Employees

* **Endpoint:** `/`
* **HTTP Method:** GET
* **Description:** Retrieves a list of all employees.

### Get Employee by ID

* **Endpoint:** `/{id}`
* **HTTP Method:** GET
* **Description:** Retrieves an employee by ID.

### Create Employee

* **Endpoint:** `/`
* **HTTP Method:** POST
* **Description:** Creates a new employee.

### Update Employee

* **Endpoint:** `/{id}`
* **HTTP Method:** PUT
* **Description:** Updates an existing employee.

### Delete Employee

* **Endpoint:** `/{id}`
* **HTTP Method:** DELETE
* **Description:** Deletes an employee by ID.


 
