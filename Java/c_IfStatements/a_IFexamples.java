package Java.c_IfStatements;

import java.util.Scanner;

public class a_IFexamples {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter your score on the test: ");
        int score = scan.nextInt();
        
        if (score > 90) {
            System.out.println("You got an A");
        }
        
        else if(score >= 80){
            System.out.println("You got a B");
        }
        
        else if(score >= 70){
            System.out.println("You got a C");
        } 
        
        else if(score >= 60){
            System.out.println("You got a D");
        }
        
        else {
            System.out.println("you failed");
        }
        
        /*
        int num1 = 300;
        int num2 = 200;
        int num3 = 100;
        
        
        if (num1 > num2){
            if (num1 > num3)
                System.out.println(num1 + " is the biggest number");
        }
        
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
        
           System.out.println("this will show no matter what");
        
        System.out.println("hi");
        */
        /*
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest number");
        }
        
        else if(num2 > num1 && num2 > num3);
            System.out.println(num2 + " is the greatest number");
        }
        
        else {
            System.out.println(num3 + " is the greatest number");
        }
        */
    }
}
