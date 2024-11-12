package org.example.calculator.lv3;

import java.util.Scanner;
import org.example.calculator.lv3.enums.OperatorType;


public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                // Input the first number
                System.out.print("Enter the first number (type 'exit' to quit): ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Calculator shutting down.");
                    break;
                }

                double num1 = Double.parseDouble(input);

                // Input the second number
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(sc.nextLine());

                // Input the operator type using Enum
                System.out.print("Enter the operator (ADD, SUBTRACT, MULTIPLY, DIVIDE): ");
                OperatorType operator = OperatorType.valueOf(sc.nextLine().toUpperCase());

                // Perform the calculation using ArithmeticCalculator instance
                double result = calculator.calculate(num1, num2, operator);
                System.out.println("Result: " + result);

                // Show all results
                System.out.println("All calculations: " + calculator.getResults());

                // Option to filter results based on a threshold
                System.out.print("Do you want to filter results greater than a specific value? (y/n): ");
                if (sc.nextLine().equalsIgnoreCase("y")) {
                    System.out.print("Enter the threshold value: ");
                    double threshold = Double.parseDouble(sc.nextLine());
                    System.out.println("Results greater than " + threshold + ": " + calculator.filterResultsGreaterThan(threshold));
                }

                // Option to remove the first result
                System.out.print("Do you want to remove the first result? (y/n): ");
                String removeOption = sc.nextLine();
                if (removeOption.equalsIgnoreCase("y")) {
                    calculator.removeFirstResult();
                    System.out.println("First result removed. Current results: " + calculator.getResults());
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid operator. Use ADD, SUBTRACT, MULTIPLY, or DIVIDE.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
