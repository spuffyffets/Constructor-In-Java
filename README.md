# Java Constructors

This repository contains examples and explanations about constructors in Java. Constructors are fundamental to initializing objects in Java, and this repository aims to provide a clear and concise understanding of how they work.

## What is a Constructor?

A constructor in Java is a special method that is called when an object of a class is instantiated. Constructors are used to initialize the object's state and have the following characteristics:

- They have the same name as the class.
- They do not have a return type, not even `void`.
- They can be overloaded, meaning a class can have multiple constructors with different parameter lists.

## Types of Constructors

### Default Constructor

If no explicit constructor is defined in a class, Java provides a default constructor. The default constructor initializes instance variables to their default values (e.g., `null` for objects, `0` for numeric types).

### Parameterized Constructor

A parameterized constructor accepts arguments, allowing you to initialize the object with specific values when it is created.

## Example

Here is an example of a Java class with both a default constructor and a parameterized constructor:

```java
public class MyClass {
    private int number;
    private String text;

    // Default Constructor
    public MyClass() {
        // Initialization code
        number = 0;
        text = "Default";
    }

    // Parameterized Constructor
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Other methods and properties can follow...
}
