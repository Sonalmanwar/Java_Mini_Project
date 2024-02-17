import java.util.Random;
import java.util.Scanner;

class RandomGuessGame {
  public static void main(String[] args) {
    
 Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        final int ATTEMPTS = 5;

        
        while (attempts < ATTEMPTS) {
          
            System.out.print("Guess the number between 1 and 100 : ");
            int userGuess = scanner.nextInt(); 

            
            if (userGuess == randomNumber) {
                System.out.println(" You guessed the correct number.");
                break;
            } else {
               
                System.out.println("Wrong guess!");

                if (userGuess < randomNumber) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Too High");
                }

                
                attempts++;
                System.out.println("Attempts left: " + (ATTEMPTS - attempts));
            }
        }

        
        if (attempts == ATTEMPTS) {
            System.out.println("your all attempts are over! TRY NEXT TIME"); 
          System.out.println("The correct number was: " + randomNumber);
            
        }

        scanner.close();
    }
}