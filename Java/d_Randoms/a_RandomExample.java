package Java.d_Randoms;

import java.util.Scanner;
import java.util.Random;

public class a_RandomExample {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        
        int diefacenum = rand.nextInt(6) + 1;
        System.out.println("die face num: " + diefacenum);
        
        if (diefacenum == 6){
            System.out.println("You rolled a 6");
        }
        
        /*
        if (num1 < 0.5){
            System.out.println("You flipped heads");
        }
        
        else {
            System.out.println("You flipped tails");
        }
        */
    }
}
