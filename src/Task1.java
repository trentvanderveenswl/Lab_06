import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valid = false;
        double celsius;
        double fahrenheit;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F: ");
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
                valid = true;
            } else {
                System.out.println("You did not enter a valid value for celsius, please try again.");
                scan.next();
            }
        } while (!valid);
    }
}
