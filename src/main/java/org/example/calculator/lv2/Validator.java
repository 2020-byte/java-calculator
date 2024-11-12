package org.example.calculator.lv2;

public class Validator {
    // Method to validate if the operator is valid
    public static void validateOperator(char operator) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Invalid operator. Please use one of +, -, *, or /.");
        }
    }

    // Method to validate if the divisor is not zero (for division)
    public static void validateDivision(int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    // Method to validate if the number is positive
    public static void validatePositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed.");
        }
    }
}
