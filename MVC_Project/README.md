# Java MVC-Based Student Management System

## Project Overview

This project is a console-based Student Management System developed using the MVC (Model-View-Controller) architectural pattern in Java. The application demonstrates the separation of concerns by dividing the project into three components:

* **Model** – Manages student data.
* **View** – Handles user interface and output display.
* **Controller** – Processes business logic and coordinates between Model and View.

The system allows users to add, view, search, update, and delete student records through a menu-driven interface.

---

## Objective

To implement the MVC architectural pattern in Java and develop a modular Student Management System that demonstrates professional software design principles.

---

## Technologies Used

* Java (JDK 8+)
* Object-Oriented Programming (OOP)
* MVC Architecture
* ArrayList Collection Framework
* Scanner Class for User Input

---

## MVC Architecture

### Model

**Student.java**

Responsible for storing student information such as:

* Student ID
* Student Name
* Course
* Email

### View

**StudentView.java**

Responsible for:

* Displaying student details
* Displaying messages and notifications
* User interaction output

### Controller

**StudentController.java**

Responsible for:

* Adding students
* Viewing student records
* Searching students
* Updating student information
* Deleting students
* Managing application logic

---

## Features

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student
* Display Total Students
* Duplicate ID Validation
* Menu-Driven Interface
* MVC-Based Design
* Modular and Maintainable Code

---

## Project Structure

```text
MVC_Project/
│
├── Student.java
├── StudentView.java
├── StudentController.java
├── MVCMain.java
└── README.md
```

---

## Menu Options

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
```

---

## Sample Output

### Add Student

```text
Enter ID: 101
Enter Name: Amy
Enter Course: Computer Science
Enter Email: amy@gmail.com

Student Added Successfully!
```

### View Student

```text
------------------------
ID      : 101
Name    : Amy
Course  : Computer Science
Email   : amy@gmail.com
------------------------
```

### Update Student

```text
Student Updated Successfully!
```

### Delete Student

```text
Student Deleted Successfully!
```

---

## How to Compile and Run

### Compile

```cmd
javac Student.java
javac StudentView.java
javac StudentController.java
javac MVCMain.java
```

### Run

```cmd
java MVCMain
```

---

## Learning Outcomes

* Understanding MVC Architecture.
* Implementing Separation of Concerns.
* Applying Object-Oriented Programming Concepts.
* Managing Data using ArrayList.
* Performing CRUD Operations.
* Developing Modular and Scalable Applications.
* Understanding Industry-Level Software Design Patterns.

---

## Conclusion

The Java MVC-Based Student Management System successfully demonstrates the implementation of the Model-View-Controller design pattern. By separating data management, user interface, and business logic into independent components, the project achieves better maintainability, scalability, and code organization. This project serves as a strong foundation for developing enterprise-level Java applications using industry-standard architectural practices.
