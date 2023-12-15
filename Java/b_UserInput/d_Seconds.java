package Java.b_UserInput;

import java.util.Scanner;

public class d_Seconds {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String bar = "--------------------------------------------";
        
        /////////////////////////// PROGRAM 7 ///////////////////////////

        System.out.println(bar);
        System.out.println("Program #7: Seconds Converter");
        System.out.println(bar);
        
        int seconds;
        int minutes;
        int hours;
        
        System.out.println("Enter any number (seconds): ");
        seconds = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter any number (minutes): ");
        minutes = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter any number (hours): ");
        hours = scan.nextInt();
        System.out.println(bar);
        
        int seminutes = minutes * 60;
        int sehours = hours * 3600;
        
        int totaltime = seconds + seminutes + sehours;
        
        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println(bar);
        
        System.out.println("Total (in seconds): " + totaltime);
        System.out.println(bar);
    }
}
