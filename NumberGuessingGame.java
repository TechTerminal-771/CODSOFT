import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain;

        do {

            int randomNumber = random.nextInt(100) + 1;
            int attemptsLeft = 7;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have 7 attempts to guess it.");


            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number!");
                    guessedCorrectly = true;
                    score += 10; // Add 10 points for a correct guess
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }


            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
            }


            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);


        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
