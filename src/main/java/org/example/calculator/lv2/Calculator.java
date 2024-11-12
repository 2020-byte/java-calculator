package org.example.calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) {
        // Validate the inputs (positive numbers and valid operator)
        Validator.validatePositive(num1);
        Validator.validatePositive(num2);
        Validator.validateOperator(operator);

        int result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                Validator.validateDivision(num2);  // Check if dividing by zero
                yield num1 / num2;  // Use 'yield' to return a value from a block
            }
            default -> throw new IllegalArgumentException("Unexpected operator: " + operator);
        };


        // Add the result to the list of results
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        // Return a copy of the results list to prevent external modification
        return new ArrayList<>(results);
    }

    public void setResults(List<Integer> results) {
        this.results = new ArrayList<>(results);
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}