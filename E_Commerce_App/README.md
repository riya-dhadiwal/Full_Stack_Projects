# Mini E-Commerce Application (Console-Based)

## Project Overview

The Mini E-Commerce Application is a console-based Java project that simulates the core functionality of an online shopping system. The application allows users to browse products, add items to a shopping cart, remove products, view the cart, and generate a final bill during checkout.

The project demonstrates object-oriented programming concepts, business logic implementation, and multi-class interaction while providing a realistic e-commerce workflow.

---

## Objective

To develop a console-based shopping application that enables users to:

* View available products
* Add products to a shopping cart
* Remove products from the cart
* Calculate discounts and GST
* Generate a final bill during checkout

---

## Technologies Used

* Java (JDK 8+)
* Object-Oriented Programming (OOP)
* ArrayList Collection Framework
* Scanner Class for User Input

---

## Features

* Product Catalog Management
* Add Products to Cart
* Remove Products from Cart
* View Shopping Cart
* Checkout and Bill Generation
* Tiered Discount System
* GST Calculation (18%)
* Menu-Driven Interface
* Multi-Class Interaction
* Real E-Commerce Business Logic

---

## Discount Structure

| Purchase Amount   | Discount |
| ----------------- | -------- |
| ₹5,000 and above  | 10%      |
| ₹15,000 and above | 13%      |
| ₹25,000 and above | 15%      |

---

## Product Catalog

| Product ID | Product Name | Price   |
| ---------- | ------------ | ------- |
| 1          | Laptop       | ₹60,000 |
| 2          | Mobile       | ₹20,000 |
| 3          | Headphones   | ₹3,000  |
| 4          | Smart Watch  | ₹5,000  |
| 5          | Keyboard     | ₹1,500  |

---

## Project Structure

```text
ECommerceApp/
│
├── Product.java
├── ECommerceApp.java
└── README.md
```

---

## Sample Output

```text
===== MINI E-COMMERCE APPLICATION =====

1. View Products
2. Add Product to Cart
3. Remove Product from Cart
4. View Cart
5. Checkout
6. Exit

Enter your choice: 2

Enter Product ID to Add: 2
Mobile added to cart.
```

### Checkout Bill

```text
========== FINAL BILL ==========

Mobile - ₹20000.0
Headphones - ₹3000.0

--------------------------------
Subtotal: ₹23000.0
Discount: ₹2990.0
Amount After Discount: ₹20010.0
GST (18%): ₹3601.8
--------------------------------
Final Amount: ₹23611.8
================================
Thank You For Shopping!
```

---

## Learning Outcomes

* Understanding object-oriented programming concepts.
* Implementing multi-class interaction in Java.
* Managing collections using ArrayList.
* Designing shopping cart functionality.
* Applying real-world business rules such as discounts and taxation.
* Developing menu-driven console applications.
* Strengthening problem-solving and project development skills.

---

## Conclusion

This project successfully simulates a basic e-commerce platform using Java. It demonstrates important software development concepts such as object-oriented design, business flow implementation, shopping cart management, discount processing, GST calculation, and bill generation. The project serves as a strong foundation for developing larger retail and e-commerce applications.
