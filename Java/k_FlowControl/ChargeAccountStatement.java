package Java.k_FlowControl;

import java.util.Scanner;

public class ChargeAccountStatement {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        String line = "-----------------------------------------";
        String doubleline = "=========================================";
        
        //////////////////////////////////////////////////////////////////
        
        System.out.println(line);
        System.out.println("CS CARD International Statement");
        System.out.println(doubleline);
        
        // ==============================================================
        
        // initializing variables
        double previouscharges = 0;
        double newcharges = 0;
        double interest = 0;
        double newBalance = 0;
        double minPayAmt = 0; 
        String continueyn = "";
        
        // ==============================================================
        
        int loop = 0;

        while (loop < 1){
            
            previouscharges = newBalance;
            newcharges = 0;
            minPayAmt = 0;
            interest = 0;
        
            // ask for previous balance
            System.out.println("Previous Account Balance: $" + previouscharges);
            System.out.println(line);

            // ask for any new changes
            String ynNewCharges = "";
            System.out.println("Are there any new charges? [yes/no]: ");
            ynNewCharges = scan.next();
            System.out.println(line);

            // ==============================================================

            // evaluation of changes [yes/no]

            // if there are new changes
            if (ynNewCharges.equals ("yes")){
                System.out.println("Enter new charges: ");
                newcharges = scan.nextDouble();
                System.out.println(line);
            }

            // if no new changes
            else {
                System.out.println("New charges: 0");
                System.out.println(line);
            }

            // ==============================================================

            // evaluating interest

            // if there is no previous account balance
            if (previouscharges == 0){
                interest = 0;
            }

            // if there is previous account balance
            else {
                interest = previouscharges * 0.02;
            }

            // ==============================================================

            // compute total (new balance)

            newBalance = previouscharges + newcharges + interest;

            // ==============================================================

            // compute minimum amount due

            if (newBalance < 50){
                minPayAmt = 0;
            }

            else if ((newBalance >= 50) && (newBalance <= 300)){
                minPayAmt = 50;
            }

            else {
                minPayAmt = newBalance * 0.2;
            }

            // ==============================================================

            // printing out final results

            System.out.println(doubleline);
            System.out.println("CS CARD International Statement");
            System.out.println(doubleline);

            System.out.println("");
            System.out.println("Previous Balance: $" + previouscharges);
            System.out.println("Additional Charges: $" + newcharges);
            System.out.println("Interest: $" + interest);
            System.out.println("");

            System.out.println("New Balance: $" + newBalance);
            System.out.println("");

            System.out.println("Minimum Payment: $" + minPayAmt);
            System.out.println(doubleline);

            // ==============================================================
                        
            System.out.println("Would you like to continue? [yes/no]: ");
            continueyn = scan.next();
            System.out.println(line);
            
            if (continueyn.equals("no")){
                loop = 2;
                System.out.println("Final Balance: $" + newBalance);
                System.out.println(doubleline);
            }
        }
    }
}
