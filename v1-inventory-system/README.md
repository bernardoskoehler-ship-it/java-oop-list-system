# 📦 V1 - Inventory System

This is the first version (V1) of a simple inventory management system developed in Java.

The goal of this version is to practice core Object-Oriented Programming (OOP) concepts and dynamic data handling using ArrayList.

---

## 🚀 Features

* Add products with quantity
* Update existing product quantities
* Remove products from inventory
* Prevent invalid inputs (empty names, invalid quantities)
* Prevent removing more items than available
* Automatically remove products when quantity reaches zero
* List all products in the inventory

---

## 🧠 Concepts Practiced

* Object-Oriented Programming (OOP)
* Encapsulation
* ArrayList (dynamic lists)
* Loop structures (`for`, enhanced `for`)
* Control flow (`continue`, `return`)
* Data validation
* Basic business logic

---

## 📂 Classes

* `Estoque` → Handles all inventory logic
* `Produto` → Represents a product with name and quantity

---

## 💻 Example Usage

```java id="ex2"
Estoque e = new Estoque();

e.adicionarProduto("Tomate", 2);
e.adicionarProduto("Tomate", 2);
e.adicionarProduto("Batata", 2);

e.removerProduto("Tomate", 1);
e.removerProduto("Batata", 3);

e.listarProdutos();
```

---

## 📌 Example Output

```id="out2"
Nao possui produto o suficiente para remover
Tomate x3
Batata x2
```

---

## 🎯 Purpose

This version focuses on building a solid foundation in Java by implementing a simple but functional system.

Future versions will improve structure, reusability, and scalability.

---

## 🔄 Future Improvements

* Extract search logic into separate methods
* Improve code organization
* Add more features to the system
* Apply more advanced OOP concepts

---

## 📎 Author

Developed by Bernardo as part of a Java learning journey 🚀
