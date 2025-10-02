import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomInt = random.nextInt(10) + 1;
        int guess = 0;

        System.out.println("Welcome! Let's play a game.");
        System.out.println("Try to guess my number!");

        do {
            System.out.print("Enter a number [1-10]: ");

            while (!scan.hasNextInt()) {
                System.out.println("Sorry, that is not a valid number. Please try again.");
                scan.next();
                System.out.print("Enter a number [1-10]: ");
            }

            guess = scan.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Sorry, your guess must be between 1 and 10. Please try again.");
                continue;
            }

            if (guess == randomInt) {
                System.out.println("Correct! My number was " + randomInt);
                break;
            } else if (guess < randomInt) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }

        } while (true);
    }
}
