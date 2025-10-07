# 🎯 Mini Quiz Game (Java)

## 📖 Project Overview

This project is a **console-based Java quiz application** that tests users’ knowledge of core Java concepts.
It presents a series of **multiple-choice questions**, accepts user input, checks the correctness of each answer, and displays the final score.

---

## 🧠 Features

* Interactive **command-line quiz**.
* Multiple-choice questions with **4 options each**.
* Real-time feedback: “Correct” or “Incorrect”.
* Final score display.
* Uses **Java arrays** and **loops** for clean logic.
* Demonstrates concepts like **arrays**, **input handling**, and **conditionals**.

---

## ⚙️ How It Works

1. The program stores:

   * Questions in a `String[] questions` array.
   * Options in a 2D `String[][] options` array.
   * Correct answers in an `int[] answer` array.
2. It displays one question at a time.
3. The user enters their answer as an integer.
4. The program compares the user’s answer with the correct one.
5. The user’s score is updated and displayed at the end.

---

## 🗾 Example Run

```
Welcome to quiz game:
Why is using the '+' operator for repeated string concatenation inside a loop considered inefficient in Java?
1. A new, entire String object is created in memory during every concatenation operation.
2. The concatenation operation itself is significantly slower than methods like String.join().
3. It requires the JVM to perform garbage collection immediately after each concatenation.
4. The '+' operator only works with the String class and not with primitives, limiting its flexibility.
Enter your guess:
1
Correct!

...
Your score is 4 out of 5
```

---

## 🧮 Code Explanation

### Core Variables

| Variable    | Type         | Description                                      |
| ----------- | ------------ | ------------------------------------------------ |
| `questions` | `String[]`   | Stores quiz questions                            |
| `options`   | `String[][]` | Stores multiple choice options for each question |
| `answer`    | `int[]`      | Stores correct answers (1-indexed)               |
| `score`     | `int`        | Keeps track of total correct answers             |

### Logic Flow

1. Initialize data arrays.
2. Use a **for loop** to iterate through each question.
3. Display question and options.
4. Take user input via `Scanner`.
5. Check correctness → update score.
6. Display total score.

---

## 🧮 Requirements

* **Java JDK 8+**
* Any IDE or terminal that supports Java execution

---

## ▶️ How to Run

1. Save the code as `mini_quiz.java`
2. Open a terminal in the same directory.
3. Compile and run:

   ```bash
   javac mini_quiz.java
   java mini_quiz
   ```

---

## 📊 Code Metrics

| Metric                    | Value                               |
| ------------------------- | ----------------------------------- |
| **Lines of Code (NLOC)**  | ~60                                 |
| **Cyclomatic Complexity** | 5                                   |
| **Token Count**           | ~220                                |
| **Execution Time**        | O(n), where n = number of questions |

---

## 📘 Sample Questions

1. Why is using `'+'` for string concatenation inside a loop inefficient?
2. What is required to **overload** a method in Java?
3. What is the main restriction with **varargs** methods?
4. When does a **static block** execute?
5. What is the primary role of **DriverManager** in JDBC?

---

## 🤛 Author

**Name:** Shakeel Irfan
**Department:** Computer Science and Engineering
**Institution:** SRM Institute of Science and Technology
**Language:** Java


