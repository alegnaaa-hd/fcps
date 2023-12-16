package Java.e_Loops;

import java.util.Scanner;

public class b_LoopsPractice {
    public static void main(String[] args) {
        
        String line = "---------------------------------------------";
        String bar = "               -----------";
        
        int fcpsloop = 0;
        
        while (fcpsloop < 10){
            System.out.println("FCPS rocks!");
            fcpsloop = fcpsloop + 1;
        }
        
        for (int o = 1; o <= 10; o++){
            System.out.println("Today is the 4th of July!");
        }
        
        System.out.println(line);
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println(line);
        
        System.out.println("Enter a number between 5 and 10; ");
        int number = scan.nextInt();
        System.out.println(line);
        
        for (int i = 1; i <= number; i++){
            System.out.println(name);
        }
        
        System.out.println(line);
    }
}
