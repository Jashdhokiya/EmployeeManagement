# Employee Management System

A simple **Employee Management System** with a **Spring Boot backend** and a **HTML/CSS/JavaScript frontend**. This system allows adding, viewing, and managing employee data.

## Features
- Add new employees (ID, Name, Email).
- View a list of all employees.
- Interacts with a MySQL database for data persistence.

## Setup

### Prerequisites
- **Java 21**
- **MySQL**
- **Maven**

### Backend Setup
1. Create a MySQL database:
   ```sql
   CREATE DATABASE employees
2. Update application properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employees
   spring.datasource.username=your_mysql_user
   spring.datasource.password=your_mysql_password   
3. Naviagate to backend and run mvn clean install
4. run command mvn spring-boot:run
5. open the index.html file 
