import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 5;
        boolean guessedCorrectly = false; 
        
        System.out.println("Welcome to the Guess Number Game");
        System.out.println("You will be asked to guess a number between " + lowerBound + " and " + upperBound + "to win the Game.");
        System.out.println("You have a maximum of " + maxAttempts + " attempts.");
        
        while (maxAttempts > 0) {
            System.out.print("Enter your guess number between " + lowerBound + " and " + upperBound + ":");
            int userGuess = scanner.nextInt();
            maxAttempts--;
            
            if (userGuess < targetNumber) {
                System.out.println("Your guess number is smaller.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess number is greater.");
            } else {
                guessedCorrectly = true;
                break;
            }
        }
        
        if (guessedCorrectly) {
            System.out.println("OOhhOO! Your number is correct. You won the game!");
        } 
        else {
            System.out.println("Sorry, you loss the game , the guess number is" + targetNumber + ".");
        }
        
        scanner.close();
    }
}
