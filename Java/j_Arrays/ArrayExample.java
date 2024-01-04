package Java.j_Arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /* nums = name of entire array
        arrays have brackets
        ararys can hold 10
        as soon as you create it, the array holds 0 integers */
        
        int length = 10;
        int [] nums = new int[length]; 
        
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter 1 int: ");
            nums[i] = scan.nextInt();
        }
        
        for (int i = 0; i < length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
        
        /*
        if (nums[i] > 10) {
            System.out.println("Your number is greater than 10");
        }
        */
    }
}
