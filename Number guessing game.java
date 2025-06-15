import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = 9; 
        // int attempts = sc.nextInt();

        System.out.println("--------WELCOME TO NUMBER GUESSING GAME--------");
        System.out.println("Guess a number between 1 and 30:");
        int attempts = 0;
        while (attempts<5) {
            int guess = sc.nextInt();
            attempts++;

            if (guess == target) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < target) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Too high! Try again:");
            }
        }
        
        sc.close();
    }
}
