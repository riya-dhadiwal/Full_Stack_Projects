# JDBC-Based Student Database Management System

## Project Overview

This project is a Java-based Student Database Management System developed using JDBC and MySQL. It demonstrates how Java applications can connect to a relational database to store and retrieve student information.

The application allows users to:

* Insert student records into a MySQL database.
* View existing student records.
* Establish database connectivity using JDBC.
* Perform persistent data storage and retrieval.

## Technologies Used

* Java (JDK 8+)
* MySQL Database
* JDBC (Java Database Connectivity)
* SQL

## Database Setup

### Create Database

```sql
CREATE DATABASE college;
USE college;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);
```

## Project Structure

Student_JDBC/

├── src/

│   └── StudentJDBC.java

├── mysql-connector-j-8.3.0/

│   └── mysql-connector-j-8.3.0.jar

└── README.md

## Features

* Add Student Records
* View Student Records
* JDBC Database Connectivity
* MySQL Integration
* PreparedStatement Usage
* Persistent Data Storage

## Sample Output

```
===== Student Database Management System =====
1. Add Student
2. View Students
Enter your choice: 1

Enter Student ID: 101
Enter Student Name: Amy
Enter Course: BTech

Student inserted successfully!
```

### Viewing Records

```
===== Student Database Management System =====
1. Add Student
2. View Students
Enter your choice: 2

Student Records:
---------------------------
ID: 101, Name: Amy N , Course: BTech
```

## Learning Outcomes

* Understanding JDBC architecture and workflow.
* Connecting Java applications with MySQL databases.
* Executing SQL queries using Java.
* Using PreparedStatement for secure database operations.
* Managing persistent data storage.
* Building a foundation for backend development.

## Conclusion

This project successfully demonstrates the integration of Java and MySQL using JDBC. It provides practical experience in database connectivity, SQL operations, and backend application development, making it a valuable foundation for enterprise-level software development.
