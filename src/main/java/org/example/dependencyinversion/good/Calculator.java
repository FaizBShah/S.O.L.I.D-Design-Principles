package org.example.dependencyinversion.good;

// This is a good implementation as the Calculator
// class does not directly depend upon the concrete implementation
// of the CalculatorOperation interface
public class Calculator {
    public int calculate(int a, int b, CalculatorOperation operation) {
        return operation.calculate(a, b);
    }
}
