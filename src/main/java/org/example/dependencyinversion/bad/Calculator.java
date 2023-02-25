package org.example.dependencyinversion.bad;

// This is a bad implementation as Calculator class
// is highly dependent on the concrete implementation of the
// AddOperation and SubtractOperation class
public class Calculator {
    public int calculate(int a, int b, String operation) {
        switch (operation) {
            case "add" -> {
                AddOperation addOperation = new AddOperation();
                return addOperation.add(a, b);
            }
            case "subtract" -> {
                SubtractOperation subtractOperation = new SubtractOperation();
                return subtractOperation.subtract(a, b);
            }
            default -> {
                return 0;
            }
        }
    }
}
