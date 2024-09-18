package Operator;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first number
        System.out.println("Enter the Number 1:");
        int a = sc.nextInt();

        // Input for the second number
        System.out.println("Enter the Number 2:");
        int b = sc.nextInt();

        // Input for the operation choice
        System.out.println("Enter the operation (1: Addition, 2: Subtraction, 3: Multiplication, 4: Division, 5: Modulus):");
        int operation = sc.nextInt();

        int result = 0;
        boolean validOperation = true;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result of Addition: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result of Multiplication: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result of Modulus: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Operation completed successfully.");
        }

        sc.close();
    }
}
