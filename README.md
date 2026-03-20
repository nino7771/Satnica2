# 📊 Satnica App (JavaFX)

Desktop application for tracking working hours and calculating net salary for a single employee.

---

## 🧾 Description

This application allows users to input daily working hours (arrival/departure), calculate total work time, bonuses, meal allowance, and final salary.

It is designed for **a single employee**, with a focus on simplicity and fast data entry.

---

## ⚙️ Features

* Input working hours (arrival / departure)
* Automatic calculation of:

  * total hours and minutes
  * regular and overtime hours
  * daily earnings
  * total salary
* Bonus and meal allowance support
* Editable table (JavaFX TableView)
* Save data to file
* Load data from file
* Open saved file externally

---

## ⚠️ Important Note

* **Meal allowance is NOT included in total salary (****`txtPlata`****)**
* Salary calculation includes only working hours and bonus
* Meal allowance is tracked separately

---

## 🎯 Learning Purpose

This project was built as a **learning and experimental project**.

I intentionally:

* used `extends` (inheritance) in non-ideal situations
* mixed UI, logic, and data layers
* experimented with different approaches

👉 The goal was to:

* understand how Java and OOP behave in real scenarios
* test what works and what doesn’t
* learn from design mistakes and improvements

This project reflects **learning through experimentation**, not production-ready architecture.

---

## 🤖 AI Usage

AI was used minimally:

* for small suggestions
* quick idea validation

👉 Most of the logic and structure was written manually as part of the learning process.

---

## 🛠️ Technologies

* Java
* JavaFX
* Object-Oriented Programming (OOP)
* File I/O

---

## 🔧 Refactoring Plan

Planned improvements:

* remove unnecessary `extends` usage
* separate:

  * UI (View)
  * logic (Service / Calculate)
  * data (Model)
* eliminate `static` state and side effects
* simplify calculations (recalculation approach)
* improve file parsing (use delimiter instead of spaces)
* improve input validation
* migrate to JavaFX Properties (better TableView binding)

---

## 📸 Screenshot
<img width="1366" height="768" alt="Snimak ekrana (5)" src="https://github.com/user-attachments/assets/bb4be874-4f97-45f9-9086-cce96f839681" />
<img width="1366" height="768" alt="Snimak ekrana (5)" src="https://github.com/user-attachments/assets/bb4be874-4f97-45f9-9086-cce96f839681" />

---

## 🚀 How to Run

1. Clone repository:

```bash
git clone https://github.com/your-username/satnica-app.git
```

2. Open in IDE (IntelliJ / Eclipse)

3. Run:

```bash
View.java
```

---

## 📌 Status

🟡 Work in progress – functional but planned for refactoring.

---

## 👤 Author

Sinisa Babic
