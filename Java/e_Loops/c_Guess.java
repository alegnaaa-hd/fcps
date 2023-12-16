package Java.e_Loops;

import java.util.Scanner;
import java.util.Random;

public class c_Guess {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        
        String line = "-----------------------------------------";
        String bar = "              -----------";
                
        System.out.println(line);
        System.out.println("Guess The Number");
        System.out.println(line);
        
        int mnumber = rand.nextInt(100) + 1;
        
        int loop = 1;
        int guesscount = 0;
        double percenthigh = 0;
        double percentlow = 0;
        
        while (loop == 1){
            System.out.println("Guess the number (1 - 100): ");
            int userguess = scan.nextInt();
            System.out.println(line);

            if (userguess == mnumber){
                guesscount++;
                System.out.println("You guessed the number correctly");
                loop = 2;
                System.out.println(line);
                System.out.println("Total Guesses Needed: " + guesscount);
                System.out.println(line);
                System.out.println("Percent of guesses too high: " + (percenthigh/guesscount) * 100 + "%");
                System.out.println("Percent of guesses too low: " + (percentlow/guesscount) * 100 + "%");
                System.out.println(line);
            }

            else if (userguess > mnumber){
                System.out.println("Your guess was too high");
                guesscount++;
                percenthigh++;
            }

            else if (userguess < mnumber){
                System.out.println("Your guess was too low");
                guesscount++;
                percentlow++;
            }

            /*
            else {
                System.out.println("error, restart needed");
                System.out.println(bar);
                System.out.println("bro what are you doing");
            }
            */
        }
    }   
}
