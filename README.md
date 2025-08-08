# Calculator

Welcome! This is a **console-based calculator** written in Java 17 (works perfectly on Java 18 too), built for the Elevate Labs Java Developer Internship Task 1. The project helped me learn the basics of Java syntax, console input/output, and all about methods and loops!

---

## Features

- **Basic Operations:** Addition, Subtraction, Multiplication, Division (with divide-by-zero checks)
- **Power & Square Root:** Find exponents and square roots easily (including error handling)
- **Memory Function:** Stores your last answer; recall or clear memory anytime
- **Input Validation:** Protects against invalid inputs, like text instead of numbers
- **Friendly Console UI:** Easy-to-follow menu and prompts. Error messages that make sense!
- **Continuous Use:** The calculator runs in a loop until you choose to exit—no need to restart the app for each calculation

---

## Getting Started

### Prerequisites

- Java 17 or later (tested on Java 17 and Java 18)
- A code editor like **VS Code** or **IntelliJ CE** (Community Edition)
- Terminal or Command Prompt

### How to Compile & Run

1. **Clone or Download** this repository, or just copy `Calculator.java` into your project folder.
2. Open Terminal/Command Prompt in the folder where you saved `Calculator.java`.
3. Compile the program:
    ```
    javac Calculator.java
    ```
4. Run the calculator:
    ```
    java Calculator
    ```

**Tip:** If you are new to the command line, just make sure you’re in the same folder as your Java file before compiling/running.

---

## Calculator Usage

- You’ll see a list of operations (Addition, Division, etc.) after starting the program.
- Enter the *number* for your desired operation (for example, “1” for Add).
- Enter your numbers when prompted.
- Get your answer instantly! The answer is also saved in memory for later.
- Use “Recall Memory” to view your last answer, or “Clear Memory” to reset it.
- To exit, just choose “9” (Exit) from the menu.

---

## Code Structure

- **Main Class:** `Calculator`
- **Each operation** is in its own method for clarity and reusability.
    - `add`, `subtract`, `multiply`, `divide`, `power`, `squareRoot`
- **Input handling:** Done via a helper method for easy error checking.
- **Switch-expression:** Uses modern Java 17 “arrow” `->` syntax for readability.

---

## What I Learned

- Creating and calling methods in Java
- Handling user input with `Scanner`
- Managing loop control flow (`while`, `switch`)
- Try-with-resources to safely manage input streams
- Defensive programming—how to prevent and inform about user errors (like dividing by zero or bad input)
- Java 17 features, including enhanced switch syntax and best practices

---

## Example Session

Options:

1. Add
2. Subtract
3. Multiply
4. Divide
5. Power
6. Square Root
7. Recall Memory
8. Clear Memory
9. Exit

Your choice: 1
First number: 5
Second number: 4
Result: 9.0

Options:
...
Your choice: 4
Dividend: 10
Divisor: 0
Error: Cannot divide by zero!
...
Your choice: 9
Goodbye!


---

## FAQ / Common Errors

- **Entering text instead of a number:** Program automatically prompts you to re-enter.
- **Dividing by zero:** Displays a friendly error message.
- **Negative square root:** Gives an error (since real numbers don’t support sqrt of negative).
- **Stale memory:** Easily clear memory with “Clear Memory” option if you want to reset.

---

## For Interview Questions (Cheat Sheet)

- *Why separate methods?*  To make code reusable, readable, and easy to debug.
- *How handle divide-by-zero?*  Checks divisor, prints error, and returns `NaN`.
- *Data types used?*  `double`, `int`, and `Scanner` for input.
- *Why a loop?*  So user can keep calculating without restarting the program.
- *Java version?*  Uses Java 17+ features, e.g., modern switch expression.

---

## License

This code is a learning project. Do anything you want with it.

