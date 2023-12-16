package Java.c_IfStatements;

import java.util.Scanner;

public class b_IFpractice {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        String bar = "---------------------------------------";
        
        /////////////////////////// PROGRAM 1A ///////////////////////////

        System.out.println(bar);
        System.out.println("Program 1A: Square or No Square");
        System.out.println(bar);
        
        int length;
        int breadth;
        
        System.out.println("Enter length of rectangle: ");
        length = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter width of rectange: ");
        breadth = scan.nextInt();
        System.out.println(bar);
        
        if (length == breadth){
            System.out.println("Length of rectangle: " + length);
            System.out.println("Width of rectangle: " + breadth);
            System.out.println("This rectangle CAN be classified as a square");
        }
        
        else{
            System.out.println("Length of rectangle: " + length);
            System.out.println("Width of rectangle: " + breadth);
            System.out.println("This rectangle CANNOT be classified as a square");
        }
        
        /////////////////////////// PROGRAM 1B ///////////////////////////

        System.out.println(bar);
        System.out.println("Program 1B: The Largest Number");
        System.out.println(bar);
        
        int Bnum1;
        int Bnum2;
        int Bnum3;
              
        System.out.println("Enter a number: ");
        Bnum1 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter another number: ");
        Bnum2 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Enter a third number: ");
        Bnum3 = scan.nextInt();
        System.out.println(bar);
        
        if (Bnum1 > Bnum2 && Bnum1 > Bnum3){
            System.out.println(Bnum1 + " is the biggest number");
        }
        
        else if(Bnum2 > Bnum1 && Bnum2 > Bnum3){
            System.out.println(Bnum2 + " is the biggest number");
        }
        
        else if(Bnum3 > Bnum1 && Bnum3 > Bnum2){
            System.out.println(Bnum3 + " is the biggest number");
        }
        
        else {
            System.out.println("The values are all equal");
        }
        
        /////////////////////////// PROGRAM 1C ///////////////////////////

        System.out.println(bar);
        System.out.println("Program 1C: CTY T-shirt Store");
        System.out.println(bar);
        
        int numCTYts;
        
        System.out.println("Enter the amount of CTY t-shirts you would like to buy: ");
        numCTYts = scan.nextInt();
        System.out.println(bar);
        
        double numCTYtss = numCTYts;
        
        if (numCTYts >= 3){
            double above3 = (numCTYtss * 15.0) * 0.85;
            System.out.println("Your total for " + numCTYts + " CTY t-shirts: $" + above3);
        }
        
        else{
            double lower3 = numCTYtss * 15;
            System.out.println("Your total for " + numCTYts + " CTY t-shirts: $" + lower3);
        }
        
        /////////////////////////// PROGRAM 1D ///////////////////////////

        System.out.println(bar);
        System.out.println("Program 1D: Test Scores");
        System.out.println(bar);
        
        int testscore;
        
        System.out.println("Enter your test score: ");
        testscore = scan.nextInt();
        System.out.println(bar);
        
        if (testscore >= 90) {
            System.out.println("You earned a A (average)");
            System.out.println("Congratulations! You're not stupid");
        }
        
        else if (testscore >= 80 && testscore <= 89){
            System.out.println("You earned a B (bsian)");
            System.out.println("aiya");
        }
        
        else if (testscore >= 70 && testscore <= 79) {
            System.out.println("You earned a C (can't eat dinner)");
            System.out.println("ni tai sha le");
        }
        
        else if (testscore >= 60 && testscore <= 69) {
            System.out.println("You earned a D (don't come home)");
            System.out.println("ni shi yi ge bin dan");
        }
        
        else {
            System.out.println("you're a failure");
        }
                
        /////////////////////////// PROGRAM 1E ///////////////////////////
        
        System.out.println(bar);
        System.out.println("Program 1E: Converter F/C");
        System.out.println(bar);

        int usertemperature;
        
        System.out.println("Enter a temperature: ");
        usertemperature = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Is your value in Fahrenheit or Celsius: ");
        String FC = scan.next();
        System.out.println(bar);
        
        if (FC.equals("Fahrenheit")){
            int fahc = ((usertemperature - 32) * 5)/9;
            System.out.println("Your entered temperature (Fahrenheit): " + usertemperature);
            System.out.println("Your converted temperature (Celsius): " + fahc);
        }

        else if (FC.equals("Celsius")){
            int celf = ((usertemperature * 9)/5) + 32;
            System.out.println("Your entered temperature (Celsius): " + usertemperature);
            System.out.println("Your converted temperature (Fahrenheit): " + celf);
        }

        else {
            System.out.println("unintelligible, please restart");
        }
        
        System.out.println(bar);
    }
}
