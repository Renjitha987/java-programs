import java.util.Scanner;

public class Task11_TravelCostEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage in km/l: ");
        double mileage = sc.nextDouble();

        System.out.print("Enter petrol price per litre: ");
        double petrolPrice = sc.nextDouble();

        double fuelNeeded = distance / mileage;
        double cost = fuelNeeded * petrolPrice;

        System.out.println("Fuel needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);

        sc.close();
    }
}