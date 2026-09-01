import java.util.Scanner;

public class Task8_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DEFAULT_RATE = 5.0;

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time in years: ");
        double time = sc.nextDouble();

        double rate = DEFAULT_RATE;

        double interest = (principal * rate * time) / 100;

        System.out.println("Rate = " + rate + "%");
        System.out.println("Interest = " + interest);

        sc.close();
    }
}