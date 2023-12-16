package Java.c_IfStatements;

import java.util.Scanner;
import java.util.Random;

public class d_RPSprogram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        
        String bar = "------------------------------------------------";
                    
        /////////////////////////// PROGRAM 3 ///////////////////////////

        System.out.println(bar);
        System.out.println("Program #3: Rock Paper Scissors");
        System.out.println(bar);
        
        int compnum = rand.nextInt(3) + 1;
        
        System.out.println("Enter - rock, paper, scissors: ");
        String userchoice = scan.next();
        System.out.println(bar);
        
        int usernum = 0;
        
        if (userchoice.equals("rock")){
            usernum = 1;
            System.out.println(usernum);
        }
        
        else if (userchoice.equals("paper")){
            usernum = 2;
            System.out.println(usernum);
        }
        
        else if (userchoice.equals("scissors")){
            usernum = 3;
            System.out.println(usernum);
        }
        
        else {
            System.out.println("unintelligible, restart program");
        }
        
        if (usernum == 1 && compnum == 1){
            System.out.println("You played: Rock");
            System.out.println("Computer played: Rock");
            System.out.println(bar);
            System.out.println("Results: Tie");
        }
        
        else if (usernum == 1 && compnum == 2){
            System.out.println("You played: Rock");
            System.out.println("Computer played: Paper");
            System.out.println(bar);
            System.out.println("Results: ur bad! you lost! git gud");
        }
        
        else if (usernum == 1 && compnum == 3){
            System.out.println("You played: Rock");
            System.out.println("Computer played: Scissors");
            System.out.println(bar);
            System.out.println("Results: you won!");
            System.out.println("congrats on not being bad at rock paper scissors");
        }
        
        else if (usernum == 2 && compnum == 1){
            System.out.println("You played: Paper");
            System.out.println("Computer played: Rock");
            System.out.println(bar);
            System.out.println("Results: you won!");
            System.out.println("congrats on not being bad at rock paper scissors");
        }
        
        else if (usernum == 2 && compnum == 2){
            System.out.println("You played: Paper");
            System.out.println("Computer played: Paper");
            System.out.println(bar);
            System.out.println("Results: Tie");
        }
        
        else if (usernum == 2 && compnum == 3){
            System.out.println("You played: Paper");
            System.out.println("Computer played: Scissors");
            System.out.println(bar);
            System.out.println("Results: ur bad! you lost! git gud");
        }
        
        else if (usernum == 3 && compnum == 1){
            System.out.println("You played: Scissors");
            System.out.println("Computer played: Rock");
            System.out.println(bar);
            System.out.println("Results: ur bad! you lost! git gud");
        }
        
        else if (usernum == 3 && compnum == 2){
            System.out.println("You played: Scissors");
            System.out.println("Computer played: Paper");
            System.out.println(bar);
            System.out.println("Results: you won!");
            System.out.println("congrats on not being bad at rock paper scissors");
        }
        
        else if (usernum == 3 && compnum == 3){
            System.out.println("You played: Scissors");
            System.out.println("Computer played: Scissors");
            System.out.println(bar);
            System.out.println("Results: Tie");
        }
        
        System.out.println(bar);
    }
}
