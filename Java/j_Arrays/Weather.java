package Java.j_Arrays;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
                
        Scanner scan = new Scanner (System.in);
        
        String line = "-------------------------------------";
        String bar = "               ------";
        
        // ==============================================================
        
        System.out.println(line);
        System.out.println("Meteorological Data");
        System.out.println(line);
        
        int length = 7;
        int [] weathers = new int[length];
        
        // ==============================================================
        
        // ask user for the each day's temperature
        for (int i = 0; i < length; i++) {
            System.out.println(bar);
            System.out.println("Enter the temperature for the day: ");
            weathers[i] = scan.nextInt();
        }
        
        System.out.println(bar);
        System.out.println(line);
        
        // print temperature for each day
        for (int i = 0; i < length; i++) {
            System.out.println("Day " + (i + 1) + " temperature: " + weathers[i]);
        }
        
        // ==============================================================
        
        System.out.println(line);
        
        int max = weathers[0];
        int min = weathers[0];
        int total = 0;
        
        // biggest number
        for (int i = 0; i < weathers.length; i++) {  
           if(weathers[i] > max)  
               max = weathers[i];  
        } 
        
        // smallest number
        for (int i = 0; i < weathers.length; i++) {  
           if(weathers[i] < min)  
               min = weathers[i];  
        }
        
        // average
        for (int i = 0; i < weathers.length; i++) {
            total = total + weathers[i];
        }
        
        int average = total / weathers.length;
        
        // ==============================================================
        
        // print out results
        System.out.println("Highest temperature of the week: " + max);
        System.out.println("Lowerst temperature of the week: " + min);
        System.out.println("Average temperature: " + average);
        System.out.println(line);
        
        // editing 
        weathers [3] = 72;
        
        System.out.println("CORRECTION");
        // print temperature for each day
        for (int i = 0; i < length; i++) {
            System.out.println("Day " + (i + 1) + " temperature: " + weathers[i]);
        }
        
        System.out.println(line);
        
        // ==============================================================
        
        // ask user if any changes need to be made
        System.out.println("Are there any changes that need to be made? [yes/no: ");
        String tempchanges = scan.next();
        System.out.println(line);
        
        // completing any changes that need to be made
        if (tempchanges.equals("yes")) {
            System.out.println("Enter which day: ");
            int whichday = scan.nextInt();
            System.out.println(line);
            whichday = whichday - 1;
            System.out.println("Enter correct temperature: ");
            int correcttemp = scan.nextInt();
            weathers[whichday] = correcttemp;
            System.out.println(line);
        }
        
        // ==============================================================
        
        // print out final temperatures
        System.out.println("FINAL TEMPERATURES");
        for (int i = 0; i < length; i++) {
        System.out.println("Day " + (i + 1) + " temperature: " + weathers[i]);
        }
        System.out.println(line);
        
        // ==============================================================
    }
}
