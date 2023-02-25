package org.example.openclosed;

// This class is badly designed as it violates the
// open-closed principle. If tomorrow we need to again add a new operation,
// let's say, multiplication, then we need to again modify this class.
// But, Open-Closed Principle states class should be open for extension but
// closed for modification.
public class BadCalculator {
    public int calculate(int number1, int number2, String type) {
        return switch (type) {
            case "add" -> number1 + number2;
            case "subtract" -> number1 - number2;
            default -> 0;
        };
    }
}
