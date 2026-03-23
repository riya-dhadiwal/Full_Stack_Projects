# Bank Account Management System (Java Console Application)

## 📌 Project Overview

The **Bank Account Management System** is a menu-driven Java console application that simulates real banking operations such as account creation, deposit, withdrawal, money transfer, transaction tracking, and bank statistics.

This project demonstrates strong understanding of **Core Java concepts, Object-Oriented Programming, and ArrayList handling with custom objects.**

## Objectives

- Implement real-life banking workflow using Java
- Practice OOP concepts like Classes, Objects, Encapsulation
- Manage multiple accounts using ArrayList
- Build a structured menu-driven application
- Improve console UI using formatted table outputs

## Technologies Used

| Technology | Purpose |
|-----------|--------|
| Java (JDK 8+) | Core Programming |
| ArrayList | Dynamic account storage |
| Scanner | User input handling |
| OOP Concepts | System design |
| Console Formatting | Table UI display |

## Core Concepts Implemented

- Classes & Objects  
- Constructors  
- Encapsulation  
- Method Calling via Objects  
- Conditional Logic  
- Switch Case Menu  
- ArrayList with Custom Objects  
- Authentication Logic (PIN Verification)

## Features

- Create Bank Account  
- Duplicate Account Validation  
- Deposit Money (Table Output)  
- Withdraw Money (Table Output)  
- Check Balance  
- View All Accounts (Formatted Table)  
- Transfer Money Between Accounts  
- Delete Account  
- Transaction History Tracking  
- Bank Statistics Dashboard  

## Project Structure

```
BankManagementSystem
│
├── BankAccount.java        (Class)
│     ├── accountNumber
│     ├── name
│     ├── pin
│     ├── balance
│     ├── transactions (ArrayList)
│     ├── deposit()
│     ├── withdraw()
│     ├── showTransactions()
│
└── BankManagementSystem.java   (Main Class)
      ├── createAccount()
      ├── findAccount()
      ├── transferMoney()
      ├── bankStats()
      └── main()
```
## How to Run

### Step 1: Compile
### Step 2: Run

## Sample Menu
```
========= BANK MENU =========
1 Create Account
2 Deposit
3 Withdraw
4 Check Balance
5 View All Accounts
6 Delete Account
7 Transfer Money
8 Transaction History
9 Bank Statistics
10 Exit
```

## Sample Output
```
+----------------------+---------------+---------------+
| Account Number | Name | Balance |
+----------------------+---------------+---------------+
|     12345      | Riya | ₹6000.00 |
|     654321     | Aman | ₹8000.00 |
+----------------------+---------------+---------------+
```
## Learning Outcomes

- Understanding real banking logic implementation
- Secure authentication using PIN verification
- Managing dynamic collections using ArrayList
- Building structured console applications
- Implementing formatted UI outputs
- Handling multi-object interactions

