package Java.b_UserInput;

/* 
Project Notes
-- this project is a work in progress
-- dedicated to A.X.
*/

import java.util.Scanner;
import java.util.Random;

public class f_HandSlapsProject {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        
        String line = "------------------------------------------------";
        String bar = "               ----------------";
        
        System.out.println(line);
        System.out.println("Welcome to the Hand Slaps Game Bundle");
        System.out.println(line);
        
        System.out.println("What game would you like to play today:");
        System.out.println(bar);
        System.out.println("- [HS] Hot Hands");
        System.out.println("- Hitting");
        System.out.println(bar);
        System.out.println("Enter your choice ('HS' or 'Hitting'): ");
        String gamechoice = scan.next();
        System.out.println(line);
                
        if (gamechoice.equals("HS")){
            int HSloop = 1;
            while (HSloop == 1){
                System.out.println("What would you like to do:");
                System.out.println(bar);
                System.out.println("- [1] Continue Playing");
                System.out.println("- [2] Stop");
                System.out.println(bar);
                System.out.println("Enter choice: ");
                String continuechoice = scan.next();
                System.out.println(line);
                
                if (continuechoice.equals("1")){
                    
                    System.out.println("Who Will Go First");
                    System.out.println(bar);
                    System.out.println("Heads or Tails?");
                    System.out.println(bar);
                    System.out.println("Enter H or T: ");
                    String HSht = scan.next();
                    System.out.println(line);
                    
                    int heta = 0;
                    
                    if (HSht.equals("H")){
                        heta = rand.nextInt(10) + 1;
                    }
                    
                    else if (HSht.equals("T")){
                        heta = rand.nextInt(10) + 70;
                    }
                    
                    else {
                        System.out.println("Error - unintelligible, restart needed ");
                        System.out.println("(stop being bad at typing bro)");
                    }
                    
                    int compht = rand.nextInt(90) + 1;
                    
                    System.out.println(heta);
                    System.out.println(compht);
                    
                    if (heta <= compht){
                        System.out.println("Computer goes first");
                    }
                    
                    else {
                        System.out.println("Computer goes first");
                    }
                }
                
                else if (continuechoice.equals("2")){
                    System.out.println("byebye");
                    HSloop = 2;
                }
                
                else {
                    System.out.println("Error - unintelligible, restart needed ");
                    System.out.println("(stop being bad at typing bro)");
                    System.out.println(line);
                    
                }
            }
        }
        
        else if (gamechoice.equals("Hitting")){
            System.out.println("hit");
        }
        
        else {
            System.out.println("unintelligible, restart needed");
            System.out.println(bar);
            System.out.println("(stop being bad at typing bro)");
        }
        
        System.out.println(line);

        // to be continued... or not
    }   
}
