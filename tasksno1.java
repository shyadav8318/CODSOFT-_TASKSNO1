

import java.util.Random;
import java.util.Scanner;

public class tasksno1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed correctly.");
                    System.out.println("Number of attempts: " + attempts);

                    // Higher score for fewer attempts
                    score += (maxAttempts - attempts + 1) * 10;
                    guessed = true;
                    break;

                } else if (guess < number) {
                    System.out.println("Too low! Try again.");

                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("You are out of attempts!");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nFinal Score: " + score);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
