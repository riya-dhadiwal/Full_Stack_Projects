# Employee Payroll Management System (Java)

A **console-based Java application** to manage employee records and perform payroll calculations efficiently. This project demonstrates core Java concepts such as **OOP, file handling, and data structures**.

---

##  Features

✔ Add Employee  
✔ Update Employee Details  
✔ Delete Employee  
✔ View Individual Employee Payroll  
✔ View All Employees  
✔ Search Employee by Name  
✔ Automatic Salary Calculation  
✔ Persistent Data Storage (File Handling)

---

## 🧮 Salary Calculation Logic

- HRA = 20% of Basic Salary  
- DA = 10% of Basic Salary  
- Gross Salary = Basic + HRA + DA  
- Deductions = 8% of Gross Salary  
- Net Salary = Gross Salary - Deductions  

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- OOP Concepts (Classes, Objects, Encapsulation)
- ArrayList
- File Handling (Serialization)
- Scanner (User Input)

---

## 📂 Project Structure
```
PayrollManagementSystem.java
│
├── Employee Class
│ ├── Attributes (ID, Name, Salary, etc.)
│ ├── calculateSalary()
│ ├── displayShort()
│ └── displayFull()
│
└── PayrollManagementSystem Class
├── addEmployee()
├── updateEmployee()
├── deleteEmployee()
├── viewEmployee()
├── viewAll()
├── searchByName()
├── saveToFile()
├── loadFromFile()
└── main()
```

---

## ▶️ How to Run

1. Clone the repository:
```bash
git clone https://github.com/your-username/payroll-system.git
Open in Eclipse / IntelliJ / VS Code
Run:
PayrollManagementSystem.java
``` 
## Sample Output
--- Payroll System ---
1. Add Employee
2. View Employee
3. View All
4. Update Employee
5. Delete Employee
6. Search by Name
7. Exit

##  Data Persistence
- Employee data is stored in a file:
employees.dat
- Data is automatically loaded when the program starts

##  Concepts Covered
- Object-Oriented Programming (OOP)
- File Handling using Serialization
- Exception Handling
- Menu-driven Programs
- Data Structures (ArrayList)

##  Future Enhancements
🔹 MySQL + JDBC Integration

🔹 GUI using Java Swing / JavaFX

🔹 Export Payroll to CSV/Excel

🔹 Role-based salary structure

🔹 REST API (Spring Boot)
