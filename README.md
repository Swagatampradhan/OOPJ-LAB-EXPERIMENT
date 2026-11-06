# Java Programming Laboratory Lab Manual (Experiments 01 - 07)

This directory contains the complete source code and compiled bytecode for Experiments 01 through 07.

---

## Directory Index

| Experiment | Topic | Location | Files |
|---|---|---|---|
| **EXP-01** | Basic Syntax, CLA, Loops & Conditionals | `Experiment-1/` | `test1.java` to `test5.java` |
| **EXP-02** | Arrays (1D, 2D) & Command Line Arguments | `Experiment-2/` | `test1.java` to `test5.java` |
| **EXP-03** | Classes, Objects, Constructors & Methods | `Experiment-3/` | `test1.java` to `test4.java` |
| **EXP-04** | Inheritance & Method Overriding | `Experiment-4/` | `test1.java` to `test5.java`, `Person.java`, `Employee.java`, `TestEmployee.java` |
| **EXP-05** | Interfaces & Multiple Inheritance | `Experiment-5/` | `test1.java` to `test6.java` |
| **EXP-06** | String Handling & Manipulations | `Experiment-6/` | `test1.java` to `test6.java` |
| **EXP-07** | Packages & Exception Handling | `Experiment-7/` | `test1.java` to `test6.java`, `mypack/`, `pack1/`, `mathops/` |

---

## Detailed Experiments & How to Run

### Experiment-1: Basics & Control Statements
1. **test1.java** - Accepts two strings as command line arguments and outputs formatted greeting.
   - Run: `java test1 Wipro Bangalore`
2. **test2.java** - Prints the sum of all digits of a given number.
   - Run: `java test2`
3. **test3.java** - Checks if a number is a palindrome.
   - Run: `java test3`
4. **test4.java** - Checks if a number is prime.
   - Run: `java test4`
5. **test5.java** - Prints first 5 values divisible by 2, 3, and 5.
   - Run: `java test5`

---

### Experiment-2: Arrays & Multi-Dimensional Arrays
1. **test1.java** - Finds the maximum and minimum values in an array.
   - Run: `java test1`
2. **test2.java** - Linear search to check if a number is present.
   - Run: `java test2`
3. **test3.java** - Finds the 2 largest and 2 smallest numbers in an array.
   - Run: `java test3`
4. **test4.java** - Removes duplicate elements from an array.
   - Run: `java test4`
5. **test5.java** - Reverses the elements of a 2x2 matrix passed via CLA.
   - Run: `java test5 10 20 30 40`

---

### Experiment-3: Classes, Constructors & Encapsulation
1. **test1.java** - `Box` class with parameterized constructor and `getVolume()` method.
   - Run: `java test1`
2. **test2.java** - `Calculator` class with static overloaded `power()` methods.
   - Run: `java test2`
3. **test3.java** - `Patient` class calculating BMI via `computeBMI()`.
   - Run: `java test3`
4. **test4.java** - `Author` and `Book` classes with getters, setters, and composition.
   - Run: `java test4`

---

### Experiment-4: Inheritance & Polymorphism
1. **test1.java** - `Animal` base class, `Bird` child class overriding `eat()`, `sleep()`, and adding `fly()`.
   - Run: `java test1`
2. **test2.java** / **TestEmployee.java** - `Person` and `Employee` inheritance hierarchy.
   - Run: `java test2` or `java TestEmployee`
3. **test3.java** - `Person` base class with `Teacher` and `Student` derived subclasses.
   - Run: `java test3`
4. **test4.java** - `Fruit` base class with `Apple` and `Orange` overriding `eat()`.
   - Run: `java test4`
5. **test5.java** - `Shape` base class with `Circle`, `Triangle`, `Square` overriding `draw()` and `erase()`.
   - Run: `java test5`

---

### Experiment-5: Interfaces
1. **test1.java** - `Animal` interface with `makeSound()` implemented by `Dog`.
   - Run: `java test1`
2. **test2.java** - `Drawable` interface with `draw()` implemented by `Circle` and `Rectangle` via interface reference.
   - Run: `java test2`
3. **test3.java** - `Greetings` interface with abstract `sayHello()` and default `sayBye()`.
   - Run: `java test3`
4. **test4.java** - `NumberPrinter` interface with `printNumber(Integer num)`.
   - Run: `java test4`
5. **test5.java** - Multiple inheritance using interfaces `Printer` and `Scanner`.
   - Run: `java test5`
6. **test6.java** - `Vehicle` interface with `start()` implemented by `Car` and `Bike`.
   - Run: `java test6`

---

### Experiment-6: String Handling
1. **test1.java** - String palindrome verification.
   - Run: `java test1`
2. **test2.java** - Concatenates two strings and converts to lowercase.
   - Run: `java test2`
3. **test3.java** - Returns string made of `n` copies of first two characters.
   - Run: `java test3`
4. **test4.java** - Returns first half if string length is even, else `null`.
   - Run: `java test4`
5. **test5.java** - Returns string without first and last characters.
   - Run: `java test5`
6. **test6.java** - Returns `n` repetitions of the last `n` characters.
   - Run: `java test6`

---

### Experiment-7: Packages & Exception Handling
1. **test1.java** - User-defined package `mypack`.
   - Compile: `javac -d . test1.java`
   - Run: `java mypack.test1`
2. **test2.java** - Access specifiers (`public`, `protected`, default, `private`) within and outside packages.
   - Compile: `javac -d . pack1/AccessDemo.java test2.java`
   - Run: `java test2`
3. **test3.java** - User-defined mathematical operations package `mathops`.
   - Compile: `javac -d . mathops/Operations.java test3.java`
   - Run: `java test3`
4. **test4.java** - Multiple exception handling (`ArithmeticException`, `ArrayIndexOutOfBoundsException`).
   - Run: `java test4`
5. **test5.java** - Demonstration of `finally` block execution.
   - Run: `java test5`
6. **test6.java** - Custom user-defined exception `InsufficientBalanceException`.
   - Run: `java test6`
