//Jazmine Freund
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int n = 0;
        System.out.println("What difficulty would you like to do? Type 1, 2, 3, or 4?");
        n = first.nextInt();
        int num = 1 + (int) (Math.random() * (Math.pow(10, n)));
        Scanner input = new Scanner(System.in);
        int guess = 0;
        System.out.println("Guess my secret number:");
        guess = input.nextInt();
        int numguesses = 1;
        while (guess != num) {
            System.out.println("Guess again:");
            guess = input.nextInt();
            numguesses += 1;
        }
        System.out.println("You got it right! My secret number is " + num + ".");
        System.out.println("You guessed " + numguesses + " times");
    }
}