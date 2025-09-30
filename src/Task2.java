import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numGallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        do {
            System.out.print("Enter the current number of gallons of gasoline in vehicle: ");
            if (scan.hasNextDouble()) {
                numGallons = scan.nextDouble();
                if (numGallons >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                scan.next();
            }
        } while (true);

        do {
            System.out.print("Enter Fuel Efficiency in MPG: ");
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                if (fuelEfficiency > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                scan.next();
            }
        } while (true);

        do {
            System.out.print("Enter Price of gas per gallon: ");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                scan.next();
            }
        } while (true);

        double gallonsFor100Miles = 100.0 / fuelEfficiency;
        double costPer100Miles = gallonsFor100Miles * pricePerGallon;
        double distance = numGallons * fuelEfficiency;

        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance the car can travel with current gas: %.2f miles%n", distance);
    }
}
