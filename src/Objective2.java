//Jazmine Freund
import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        System.out.println("You are going to guess a number from 1-100,");
        System.out.println("Then I am going to guess your number and you are going to say if it is higher, lower, or correct.");
        int lower=1;
        int higher=100;
        int guess=(int)(Math.random()*100)+1;
        Scanner input= new Scanner(System.in);
        String confirmation = "";
        System.out.println("Is your number "+guess+"?");
        confirmation=input.nextLine();
        while (confirmation != "correct") {
            if(confirmation=="higher"){
                lower=guess;
            }
            else if(confirmation=="lower"){
                higher=guess;
            }
            guess=(int)(Math.random()*higher)+lower;
            System.out.println(lower+","+higher);
            System.out.println("Is your number "+guess+"?");
            confirmation=input.nextLine();
        }
        System.out.println("I guessed your number correctly!");
    }
}