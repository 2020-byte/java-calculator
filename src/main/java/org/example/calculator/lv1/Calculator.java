package org.example.calculator.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                // Input first number
                System.out.print("Enter the first number (type 'exit' to quit): ");
                String input = sc.nextLine();

                // Check for exit command
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Calculator shutting down.");
                    break;
                }

                // Validate first number
                int firstNumber = Integer.parseInt(input);
                if (firstNumber < 0) {
                    System.out.println("Only positive integers are allowed.");
                    continue;
                }

                // Input second number
                System.out.print("Enter the second number: ");
                int secondNumber = Integer.parseInt(sc.nextLine());
                if (secondNumber < 0) {
                    System.out.println("Only positive integers are allowed.");
                    continue;
                }

                // Input operator
                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = sc.nextLine().charAt(0);

                // Perform calculation
                int result;

                switch (operator) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        break;
                    case '/':
                        if (secondNumber == 0) {
                            System.out.println("Division by zero is not allowed.");
                            continue;
                        }
                        result = firstNumber / secondNumber;
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        continue;
                }

                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}