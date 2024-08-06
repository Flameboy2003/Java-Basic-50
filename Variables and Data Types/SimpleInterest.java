package Variables_and_DataTypes;

//5.Calculate the simple interest given principal, rate, and time

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 3;

        double Interest = principal * (rate / 100) * time;
        System.out.println("Simple Interest :" + Interest);
    }
}
