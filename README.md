
---

# ☕ Java17_Features

This repository contains examples of **key features introduced in Java 17 (LTS)** with clear **before vs after** examples.
Each file demonstrates how Java has evolved to make code more concise, readable, and powerful.

---

## 🚀 Features Covered

### 1. **Pattern Matching for `instanceof`**

* Simplifies `instanceof` checks by avoiding manual casting.
* Introduced a **pattern variable** that is automatically typed.

📄 **File:** `PatternMatchingInstanceOfExample.java`

---

### 2. **Guarded Pattern Matching in Switch (Preview Feature)**

* Adds **conditional patterns** using the `when` clause.
* Allows more readable and flexible switch logic.

📄 **File:** `GuardedPatternExample.java`

---

### 3. **Record Classes (JEP 395)**

* Introduced compact data carriers with **auto-generated constructor**, **getters**, and **toString()**.
* Great for immutable data models.

📄 **File:** `RecordExample.java`

---

### 4. **Sealed Classes (JEP 409)**

* Restricts which classes can extend or implement a parent class.
* Helps maintain control over inheritance.

📄 **File:** `SealedExample.java`

---

### 5. **Enhanced Switch Expressions (JEP 361)**

* Allows returning values directly from switch statements.
* Supports lambda-style `->` syntax.

📄 **Files:**

* `SwitchDemo.java` – Basic switch expressions
* `SwitchStatementWithReturnValue.java` – Switch returning values
* `SwitchWithMultipleCaseLabelDemo.java` – Multiple labels in one case
* `SwitchHandleNullExample.java` – Null-safe switch

---

### 6. **Text Blocks (JEP 378)**

* Introduces multi-line string literals using `"""`.
* Simplifies writing formatted text like JSON, SQL, or HTML.

📄 **File:** `TextBlockDemo.java`

---

## 🧰 Run Instructions

```bash
javac --enable-preview --release 17 FileName.java
java --enable-preview FileName
```

> Some features like **Guarded Patterns** may require preview mode (`--enable-preview`).

---

## 💡 Purpose

This repository is created for **learning and interview preparation**, showcasing how **Java 17 modernized core language syntax** while improving **readability and safety**.

---
