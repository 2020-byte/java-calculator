package org.example.calculator.lv3.enums;

public enum OperatorType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    // Apply the operation based on OperatorType
    public double apply(double num1, double num2) {
        return switch (this) {
            case ADD -> num1 + num2;
            case SUBTRACT -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> {
                if (num2 == 0) throw new ArithmeticException("Cannot divide by zero.");
                yield num1 / num2;
            }
        };
    }
}