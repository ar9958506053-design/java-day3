# Java OOP Demonstration Project 🚀

This project demonstrates **core Object-Oriented Programming (OOP) concepts in Java** using a simple and structured program.

It includes examples of:
- Classes & Objects
- Encapsulation
- Inheritance
- Method Overloading
- Arrays & String manipulation

---

## 📂 Files Overview

### 1. Main.java
- Entry point of the program
- Demonstrates all concepts together:
  - Student details
  - Employee data
  - Product encapsulation
  - Inheritance using CollegeStudent
  - Method overloading using billing
- 📄 Source: :contentReference[oaicite:0]{index=0}  

---

### 2. Product.java
- Demonstrates **Encapsulation**
- Uses:
  - Private variable `price`
  - Getter & Setter methods
- 📄 Source: :contentReference[oaicite:1]{index=1}  

---

### 3. ProductBilling.java
- Demonstrates **Method Overloading**
- Calculates total bill for:
  - 1 product
  - 2 products
  - 3 products
- 📄 Source: :contentReference[oaicite:2]{index=2}  

---

## 🧠 Concepts Covered

### 🔹 1. Classes & Objects
- Creating objects of Student and Employee
- Accessing methods and properties

### 🔹 2. Encapsulation
- Using private variables with getter/setter
- Example: Product price handling

### 🔹 3. Inheritance
- `CollegeStudent` extends `Student`
- Reuses parent class properties

### 🔹 4. Method Overloading
- Same method name with different parameters
- Example: `calculateBill()`

### 🔹 5. Arrays & Strings
- Marks stored in arrays
- String formatting using `toUpperCase()`

---

## ▶️ How to Run

### Step 1: Compile all files
```bash
javac Main.java Product.java ProductBilling.java
