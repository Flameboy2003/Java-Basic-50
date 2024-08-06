package Variables_and_DataTypes;

public class UseOfFinal {
    public static void main(String[] args) {
        // Example variable of type int
        int a = 10;
        a = 20; // The value is updated
        System.out.println("The value of a: " + a);

        // Use of final keyword
        final int b = 10;
        // b = 20; // Uncommenting this line will cause a compile-time error: java: cannot assign a value to final variable b
        System.out.println("The value of b: " + b);
    }
}
