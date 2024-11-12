package org.example.calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
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

                int num1 = Integer.parseInt(input);

                // Input the second number
                System.out.print("Enter the second number: ");
                int num2 = Integer.parseInt(sc.nextLine());

                // Input the operator
                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = sc.nextLine().charAt(0);

                // Perform the calculation using Calculator instance
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("Result: " + result);

                // Show all results
                System.out.println("All calculations: " + calculator.getResults());

                // Option to remove the first result
                System.out.print("Do you want to remove the first result? (y/n): ");
                String removeOption = sc.nextLine();
                if (removeOption.equalsIgnoreCase("y")) {
                    calculator.removeFirstResult();
                    System.out.println("First result removed. Current results: " + calculator.getResults());
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
