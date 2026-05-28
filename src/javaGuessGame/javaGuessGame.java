package javaGuessGame;
import java.util.Scanner;
import java.util.Random;

	public class javaGuessGame {
	    public static void main(String[] args) {
	        // Create objects for generating random numbers and reading input
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        // Generate a random number between 1 and 100
	        int targetNumber = random.nextInt(100) + 1;
	        int userGuess = 0;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

	        // Loop until the player guesses the correct number
	        while (userGuess != targetNumber) {
	            System.out.print("Enter your guess: ");
	            
	            // Check if the input is an integer to prevent crashes
	            if (scanner.hasNextInt()) {
	                userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");
	                } else if (userGuess > targetNumber) {
	                    System.out.println("Too high! Try again.");
	                } else {
	                    System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
	                }
	            } else {
	                System.out.println("Please enter a valid whole number.");
	                scanner.next(); // Clear the invalid input
	            }
	        }
	        
	        scanner.close(); // Close the scanner to release resources
	    }
	}


