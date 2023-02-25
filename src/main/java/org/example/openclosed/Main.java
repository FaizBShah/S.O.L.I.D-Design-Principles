package org.example.openclosed;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(2, 5, new AddOperation()));
        System.out.println(calculator.calculate(2, 5, new SubtractOperation()));
        System.out.println(calculator.calculate(2, 5, new MultiplyOperation()));
    }
}
