# 📚 Library Management System 
#### (Java Console Application)

# Objective

### The objective of this project is to develop a menu-driven Java application that manages library operations such as adding books, issuing, returning, searching, categorizing, and reserving books.
### This project demonstrates the use of Core Java concepts and Object-Oriented Programming (OOP) to simulate a real-world library system.

# Features
- Add new books
- Issue books
- Return books
- View all books
- Delete books

# Technologies Used
- Java (JDK 8+)
- IDE: Eclipse

# 💡 Concepts Covered
1. Classes & Objects
2. Constructors
3. ArrayList
4. Encapsulation
5. Conditional statements
6. Switch-case
7. Loops
8. Scanner class
9. Object state management

# Project Description
### The system stores book records using an ArrayList. Each book contains:

- Book ID
- Title
- Author
- Category
- Availability status
- Reservation status

### Users interact through a console-based menu, performing operations like issuing, returning, and reserving books.

# Class Design
## Book Class

### Book
```
├── bookId
├── title
├── author
├── category
├── isIssued
├── isReserved
├── reservedBy
├── display()
```

## LibraryManagementSystem Class

### LibraryManagementSystem
```
 ├── addBook()
 ├── issueBook()
 ├── returnBook()
 ├── deleteBook()
 ├── searchBook()
 ├── viewBooks()
 ├── viewByCategory()
 ├── reserveBook()
 ├── showStats()
 ├── findBook()
 ├── main()
```
# Menu Options

1. Add Book
2. Issue Book
3. Return Book
4. View All Books
5. Delete Book
6. Search Book
7. View By Category
8. Reserve Book
9. Show Statistics
10. Exit

# Sample Output
--- Library Management System ---
1. Add Book
2. Issue Book

..

Enter choice: 8

Enter Book ID: 101

Enter your name: Max

✅ Book Reserved Successfully!

# Key Functionalities Explained
### 📚 Book Categories
Books are grouped into categories such as:
- Fiction
- Technical
- Academic
This helps in easy filtering and organization.

### 📌 Online Reservation System
- Users can reserve books that are currently issued
- Each reservation stores the user name
- When the book is returned:

👉 It is automatically issued to the reserved user

### 📊 Statistics
Displays:

- Total available books
- Total issued books
- Total reserved books

 # Learning Outcomes
- Understanding of object state management
- Implementation of real-world system logic
- Use of ArrayList for dynamic storage
- Strong grasp of methods and modular programming
- Handling user input and validation

# Future Enhancements 🚀
1. Add login system (Admin/User roles)
2. Database integration (MySQL using JDBC)
3. GUI using Swing / JavaFX
4. Due date & fine calculation
5. Online book reservation portal
6. Multi-user access

# Conclusion
The Library Management System successfully demonstrates how Java can be used to build a structured, modular, and scalable application. With additional features like database integration and GUI, this system can evolve into a full-fledged library solution.
