import java.util.Scanner;

public class Task10_GroceryBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DISCOUNT = 0.10;

        System.out.print("Enter price of item 1: ");
        double item1 = sc.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = sc.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = sc.nextDouble();

        double total = item1 + item2 + item3;
        double discountAmount = total * DISCOUNT;
        double finalAmount = total - discountAmount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
}