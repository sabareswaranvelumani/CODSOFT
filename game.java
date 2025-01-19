import java.util.Scanner;
import java.util.Random;

 class game {
    public static void main(String[] args) {
    
        Random rand = new Random();
        int generatedNumber = rand.nextInt(100); 

        
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Guess the number between 1 and 100!");

    
        while (userGuess != generatedNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

        
            if (userGuess < generatedNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else if (userGuess > generatedNumber) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        
        scanner.close();
    }
}



