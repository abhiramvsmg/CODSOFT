import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        displayGameHeader();

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 10;
            int attempts = 0;

            System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it right!");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                attempts++;
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (attempts < maxAttempts) {
                System.out.println("You guessed the number in " + attempts + " attempts. Great job!\n");
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + "\n");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }
    }

    private static void displayGameHeader() {
        System.out.println("********************************************");
        System.out.println("*         NUMBER GUESSING GAME             *");
        System.out.println("********************************************");
    }
}
