package org.example.calculator.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.example.calculator.lv3.enums.OperatorType;


public class ArithmeticCalculator<T extends Number> {
    private final List<Double> results;

    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public double calculate(T num1, T num2, OperatorType operator) {

        double operand1 = num1.doubleValue();
        double operand2 = num2.doubleValue();

        double result = operator.apply(operand1, operand2);
        results.add(result);
        return result;
    }



    // Method to get all results
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    // Method to remove the first result
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // Method to filter results greater than a specified threshold using Lambda & Stream
    public List<Double> filterResultsGreaterThan(double threshold) {
        return results.stream()
                .filter(result -> result > threshold)
                .collect(Collectors.toList());
    }
}
