import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000) + 1; 
        int guess = 0;
        int maxAttempts = 10;               
        int attempts = 0;

        System.out.println("Guess a number between 1 - 1000");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (guess != number && attempts < maxAttempts) {
            System.out.print("Your guess: ");
            guess = scan.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Go Higher!");
            } else if (guess > number) {
                System.out.println("Go Lower!");
            } else {
                System.out.println("You guessed it right! The number was " + number + " in " + attempts + " attempts.");
                break; 
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (guess != number) {
            System.out.println("You ran out of attempts! The number was " + number);
        }

        scan.close();
    }
}
