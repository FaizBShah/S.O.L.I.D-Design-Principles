package org.example.dependencyinversion.good;

public class SubtractOperation implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
