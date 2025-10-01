import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideLengthOne;
        double sideLengthTwo;

        do {
            System.out.println("Enter Length of Side 1: ");
            if (scan.hasNextDouble()) {
                sideLengthOne = scan.nextDouble();
                break;
            } else {
                System.out.println("You have a invalid side Length. Please try again");
                scan.next();
            }
        } while(true);

        do {
            System.out.println("Enter Length of Side 2: ");
            if (scan.hasNextDouble()) {
                sideLengthTwo = scan.nextDouble();
                break;
            } else {
                System.out.println("You have a invalid side Length. Please try again");
                scan.next();
            }
        } while(true);

        double area = sideLengthOne * sideLengthTwo;
        double perimeter = 2 * (sideLengthOne + sideLengthTwo);
        double diagonal = Math.sqrt(sideLengthOne * sideLengthOne + sideLengthTwo * sideLengthTwo);

        System.out.printf("Side 1: %.2f%n", sideLengthOne);
        System.out.printf("Side 2: %.2f%n", sideLengthTwo);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

    }
}
