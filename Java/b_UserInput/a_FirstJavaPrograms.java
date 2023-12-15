package Java.b_UserInput;

import java.util.Scanner;

public class a_FirstJavaPrograms {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        
        String bar = "----------------------------------------";

        /////////////////////////// PROGRAM 1 ///////////////////////////
        
        System.out.println(bar);
        System.out.println("Program #1");
        System.out.println(bar);
        
        System.out.println("Please enter a number: ");      
        num1 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Please enter another number: ");
        num2 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Sum of your numbers: " + (num1 + num2));
        int value = Math.abs(num1 - num2);
        System.out.println("Difference of your numbers: " + value);
        System.out.println("Product of your numbers: " + (num1 * num2));
        System.out.println(bar);
        
        /////////////////////////// PROGRAM 2 ///////////////////////////

        System.out.println("Program #2");
        System.out.println(bar);
        
        int value1;
        int value2;
        int value3;
        
        System.out.println("Please enter a number: ");
        value1 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Please enter another number: ");
        value2 = scan.nextInt();
        System.out.println(bar);
        
        System.out.println("Please enter a third number: ");
        value3 = scan.nextInt();
        System.out.println(bar);
        
        int sumof3 = value1 + value2 + value3;
        int avgof3 = sumof3/3;
        
        System.out.println("Average of your 3 numbers: " + avgof3);
        System.out.println(bar);
        
        /////////////////////////// PROGRAM 3 ///////////////////////////

        System.out.println("Program #3");
        System.out.println(bar);
        
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println(bar);
        
        System.out.println("Please enter your age: ");
        String age = scan.next();
        System.out.println(bar);
        
        System.out.println("Please enter your school: ");
        String school = scan.next();
        System.out.println(bar);
        
        System.out.println("Please enter your pet name: ");
        String petname = scan.next();
        System.out.println(bar);
        
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + school + ", though I miss my pet " + petname + " very much!");
        System.out.println(bar);
    }
}