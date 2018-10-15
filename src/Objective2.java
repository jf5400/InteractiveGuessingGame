//Jazmine Freund
import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        System.out.println("You are going to guess a number from 1-100,");
        System.out.println("Then I am going to guess your number and you are going to tell if it is higher, lower, or correct.");
        System.out.println("If it is lower do 1, correct do 2, and higher do 3 ");
        int lower=0;
        int higher=101;
        int guess=(int)(Math.random()*100)+1;
        Scanner input= new Scanner(System.in);
        int confirmation = 1;
        System.out.println("Is your number "+guess+"?");
        confirmation=input.nextInt();
        if(confirmation==1){
            System.out.println("yes");
        }
        while (confirmation != 2) {
            if(confirmation==3){
                lower=guess;
            }
            else if(confirmation==1){
                higher=guess;
            }
            guess=((int)(Math.random()*(higher-1)))+(1+lower);
            System.out.println("Is your number "+guess+"?");
            confirmation=input.nextInt();

        }
        System.out.println("I guessed your number correctly!");
    }
}