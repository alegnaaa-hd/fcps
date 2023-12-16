package Java.e_Loops;

import java.util.Scanner;

public class a_LoopsIntro {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        /*
        int count = 0;
        
        while (count < 10) {
            System.out.println("Hello!");
            count = count + 1;
        }
        System.out.println("Outside the loop");
        System.out.println("Count: " + count);
        */
        
        /*
        String cont;
        System.out.println("Do you want to continue? ");
        cont = scan.next();
        
        while (cont.equals("yes")){
            System.out.println("Hello!");
            System.out.println("Do you want to continue? ");
            cont = scan.next();
        }
        
        System.out.println("Out of the loop");
        */
        
        int i = 0;      
        for (i = 0; i < 5; i++){
            System.out.println("HelLo!");
        }
        
        System.out.println("out of the loop");
        
        /*
        String cont;
        
        do {
            System.out.println("Hello!");
            System.out.println("Do you want to continue?");
            cont = scan.next();
        }while (cont.equals("yes"));
        
        System.out.println("outside the loop");
        */
    }
}
