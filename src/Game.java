//Jazmine Freund
import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        int num=1+(int)(Math.random()*10);
        Scanner input=new Scanner(System.in);
        int guess=0;
        System.out.println("Guess my secret number:");
        guess=input.nextInt();
        while(guess!=num){
            System.out.println("Guess again:");
            guess=input.nextInt();
        }
        System.out.println("You got it right! My secret number is "+num);
    }
}