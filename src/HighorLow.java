import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberRandom = random.nextInt(10) + 1; // Generates a random number between 1 and 10
        int guessNum;

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            guessNum = scanner.nextInt();

            if (guessNum > numberRandom) {
                System.out.println("Too high!");
            } else if (guessNum < numberRandom) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You guessed it right!");
            }
        } while (guessNum != numberRandom);

        // Display the randomly generated number
        System.out.println("The random number was: " + numberRandom);

        scanner.close();
    }
}
