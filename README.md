# Online Cooking Class Platform  
### Online Cooking Class Platform: A Java app where students book cooking classes, view recipes, and chefs manage sessions. Admin controls users and class data using core Java and file handling.

An interactive desktop application where Admins and Students can manage, learn, and explore cooking recipes.  
This project follows full Java GUI, OOP, JDBC & Review-1 marking guidelines.

---

## Project Status
**Review 1: Completed Successfully**  
Developer: **Parth**

---

## Overview

This platform provides:

- Role-based access (Admin & Student)
- Recipe creation & management
- Veg / Non-Veg filtering system
- Recipe detail viewer (ingredients + steps)
- Login system via MySQL + fallback users
- Threading-based notification system
- Java Swing GUI with event handling

---

# Features

## Admin Features
- Add new recipes
- Select recipe type: Veg / Non-Veg
- Filter recipes (All / Veg / Non-Veg)
- View detailed recipe instructions
- Thread-safe recipe insertion
- Extendable system for future modules

---

## Student Features
- View all recipes
- Apply Veg / Non-Veg filters
- View detailed ingredients and steps

---

## System Features
- Authentication via MySQL database
- In-memory fallback login
- OOP-based user roles
- Multithreading for notifications
- Exception-safe JDBC operations
- Clean Java Swing GUI

---

# Project Structure

src/
├── db/
│ ├── DBUtil.java
│ ├── UserDAO.java
│ └── DBTest.java
│
├── models/
│ ├── User.java
│ ├── Admin.java
│ ├── Student.java
│ └── Recipe.java
│
├── services/
│ ├── DataStore.java
│ └── NotificationThread.java
│
└── ui/
├── LoginUI.java
├── AdminDashboard.java
├── StudentDashboard.java
└── RecipeDetailsUI.java


---

# Review-1 Marking Criteria Coverage

| Requirement | Status |
|------------|--------|
| OOP (Inheritance, Polymorphism, Abstraction) | ✔ Implemented |
| Collections & Generics | ✔ ArrayList used |
| Multithreading | ✔ NotificationThread |
| Synchronization | ✔ addRecipe() synchronized |
| Database Classes | ✔ DBUtil + UserDAO |
| JDBC Connectivity | ✔ Complete |
| GUI | ✔ Java Swing |
| Exception Handling | ✔ Present |
| Event Handling | ✔ Implemented |

---

# Technology Stack

### Languages  
- Java SE 17+  
- SQL (MySQL)

### GUI Framework  
- Java Swing

### Database  
- MySQL Workbench  
- MySQL Connector/J (JDBC Driver)

### Core Concepts  
- OOP  
- Exceptions  
- Collections  
- Multithreading  
- Synchronization  
- JDBC Connectivity  

---
