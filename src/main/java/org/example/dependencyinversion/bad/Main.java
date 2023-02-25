package org.example.dependencyinversion.bad;

// The Dependency Inversion principle states that our
// classes should depend upon interfaces or abstract classes
// instead of concrete classes and functions.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Bad design
        System.out.println(calculator.calculate(2, 5, "add"));
        System.out.println(calculator.calculate(2, 5, "subtract"));
    }
}
