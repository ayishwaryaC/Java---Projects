import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        int secret = 7;
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number (1-10): ");
        int guess = sc.nextInt();
        if (guess == secret)
            System.out.println("Correct! 🎉 You guessed it!"); ff
        else
            System.out.println("Wrong! ❌ The number was " + secret);
    }
}
