package org.example.openclosed;

// Good implementation, as we can add functionality
// to it by just extending new operations
public class Calculator {
    public int calculate(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
