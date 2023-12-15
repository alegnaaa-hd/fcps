package Java.b_UserInput;

import java.util.Scanner;

public class e_CoinsInJar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        String bar = "-----------------------------------------";
        String line = "-----------------";
        
        /////////////////////////// PROGRAM 8 ///////////////////////////
        
        int pennies;
        int nickels;
        int dimes;
        int quarters;        

        System.out.println(bar);
        System.out.println("Program #8: Coins In Jar");
        System.out.println(bar);
        
        System.out.println("Enter the number of pennies: ");
        pennies = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter the number of nickels: ");
        nickels = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter the number of dimes: ");
        dimes = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter the number of quarters: ");
        quarters = scan.nextInt();
        System.out.println(bar);
        
        double dpennies = pennies;
        double dnickels = nickels;
        double ddimes = dimes;
        double dquarters = quarters;
        
        double cpennies = (dpennies * 0.01);
        double cnickels = (dnickels * 0.05);
        double cdimes = (ddimes * 0.1);
        double cquarters = (dquarters * 0.25);
        
        double totalamount = cpennies + cnickels + cdimes + cquarters;
        
        System.out.println("Number of pennies ($0.01): " + pennies);
        System.out.println("Pennies Total: $" + cpennies);
        System.out.println(line);
        
        System.out.println("Number of nickels ($0.05): " + nickels);
        System.out.println("Nickels Total: $" + cnickels);
        System.out.println(line);
        
        System.out.println("Number of dimes ($0.10): " + dimes);
        System.out.println("Dimes Total: $" + cdimes);
        System.out.println(line);
        
        System.out.println("Number of quarters ($0.25): " + quarters);
        System.out.println("Quarters Total: $" + cquarters);
        System.out.println(bar);
        
        System.out.println("Total amount: $" + totalamount);
        System.out.println(bar);
    }
}
