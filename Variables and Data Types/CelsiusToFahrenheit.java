package Variables_and_DataTypes;

/*
    3.Write a program to convert temperature from Celsius to Fahrenheit.

    Celsius = (Fahrenheit - 32) / 1.8
    Fahrenheit = (Celsius * 1.8) + 32
*/

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius");
        int Celsius = sc.nextInt();

        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Fahrenheit :"+Fahrenheit);

    }
}
