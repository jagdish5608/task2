import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random 1-100
        int guess;
        int attempts = 0;

        System.out.println("----- Guess the Number Game -----");
        System.out.println("I have selected a number between 1 and 100.\nTry to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }

        } while (guess != number);

        sc.close();
    }
}
