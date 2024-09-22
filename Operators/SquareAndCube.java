package Operator;

import java.util.Scanner;

public class SquareAndCube {

    int Square(int input) {
        int result = input * input;
        return result;
    }

    int Cube(int input) {
        int result = input * input * input;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number for square
        System.out.println("Enter the Number for Square:");
        int num1 = sc.nextInt();
        SquareAndCube obj = new SquareAndCube();
        int SquareResult = obj.Square(num1);
        System.out.println("Square: " + SquareResult);

        // Get the number for cube
        System.out.println("Enter the Number for Cube:");
        int num2 = sc.nextInt();
        int CubeResult = obj.Cube(num2);
        System.out.println("Cube: " + CubeResult);
    }
}
