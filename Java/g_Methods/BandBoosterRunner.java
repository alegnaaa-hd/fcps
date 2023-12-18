package Java.g_Methods;

import java.util.Scanner;

public class BandBoosterRunner {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        String line = "-------------------------------------------";
        String bar = "                 ---------";
        
        System.out.println(line);
        System.out.println("Band Boosters");
        System.out.println(line);
        
        System.out.println("Enter name of Band Booster #1: ");
        String BBname1 = scan.next();
        System.out.println(bar);
        
        System.out.println("Enter name of Band Booster #2: ");
        String BBname2 = scan.next();
        System.out.println(bar);
        
        System.out.println("Enter name of Band Booster #3: ");
        String BBname3 = scan.next();
        System.out.println(line);
        
        BandBooster BB1 = new BandBooster(BBname1);
        BandBooster BB2 = new BandBooster(BBname2);
        BandBooster BB3 = new BandBooster(BBname3);
        
        System.out.println("Enter amount of fundraising weeks: ");
        int BBweekamt = scan.nextInt();
        System.out.println(line);
        
        int BB1sales;
        int BB2sales;
        int BB3sales;
        
        for (int weeks = 0; weeks < BBweekamt; weeks++){
            
            System.out.println("Week #" + (weeks + 1));
            System.out.println(bar);

            System.out.println("Enter # of boxes " + BB1.getName() + " sold this week: ");
            BB1sales = scan.nextInt();
            BB1.updateSales (BB1sales);
            System.out.println(bar);
            
            System.out.println("Enter # of boxes " + BB2.getName() + " sold this week: ");
            BB2sales = scan.nextInt();
            BB2.updateSales (BB2sales);
            System.out.println(bar);
            
            System.out.println("Enter # of boxes " + BB3.getName() + " sold this week: ");
            BB3sales = scan.nextInt();
            BB3.updateSales (BB3sales);
            System.out.println(line);
        }
    }
}
