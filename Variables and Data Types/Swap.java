package Variables_and_DataTypes;


    /* 2.Write a program to swap two numbers using a temporary variable.
        INPUT:
            int num1 = 5;
            int num2 = 10;
        OUTPUT:
            Before swapping: num1 = 5, num2 = 10
            After swapping: num1 = 10, num2 = 5
    */


public class Swap {


    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int temp;

        System.out.println("Before swapping: " + "num1 =" + num1 + " num2 =" + num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping: " + "num1 =" + num1 + " num2 =" + num2);

    }
}
