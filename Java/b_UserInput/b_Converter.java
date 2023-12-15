package Java.b_UserInput;

import java.util.Scanner;

public class b_Converter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String bar = "-----------------------------------------------";
        
        /////////////////////////// PROGRAM 4 ///////////////////////////
        System.out.println(bar);
        System.out.println("Program #4: Fahrenheit --> Celsius & Kelvin Converter");
                
        System.out.println(bar);
        int fah;
        
        System.out.println("Please enter a temperature (Fahrenheit): ");
        fah = scan.nextInt();
        System.out.println(bar);
        
        int convert1 = ((fah - 32) * 5)/9;
        int convert2 = (int)(convert1 + 273.15);
        
        System.out.println("Temperature (Fahrenheit): " + fah);
        System.out.println("Temperature (Celsius): " + convert1);
        System.out.println("Temperature (Kelvin): " + convert2);
        System.out.println(bar);
        
        /////////////////////////// PROGRAM 5 ///////////////////////////

        System.out.println("Program #5: Miles --> Kilometers Converter");
        System.out.println(bar);
        
        System.out.println("Enter a distance (Miles): ");
        float miles = scan.nextFloat();
        System.out.println(bar);        
        
        double mmiles = miles;
        double mkconvert = (mmiles * 1.609);
        
        System.out.println("Distance (Miles): " + miles);
        System.out.println("Distance (Kilometers): " + mkconvert);
        System.out.println(bar);
    }
}
