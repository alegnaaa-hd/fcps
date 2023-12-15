package Java.b_UserInput;

import java.util.Scanner;

public class c_TravelInfo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String bar = "--------------------------------------------";
        
        /////////////////////////// PROGRAM 6 ///////////////////////////

        System.out.println(bar);
        System.out.println("Program #6: Travel Information");
        System.out.println(bar);
        
        int speed;
        int distance;
        
        System.out.println("Enter your distance for the trip (Miles): ");
        distance = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter your speed for your trip (MPH): ");
        speed = scan.nextInt();
        System.out.println(bar);
        
        double sspeed = speed;
        double ddistance = distance;
        
        double time = ddistance/sspeed;
        float ttime = (float) time;
        System.out.println("Time required to complete trip (hours): " + ttime);
        System.out.println(bar);
    }
}
