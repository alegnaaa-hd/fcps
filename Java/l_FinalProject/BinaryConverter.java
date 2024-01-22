package Java.l_FinalProject;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
    
        //==================================================================
        
        String doubleline = "==========================================";
        
        //==================================================================
        
        // creating necessary variables
        
        int user_input;
        int base_10Num;
        String binaryNum = "";
        
        //==================================================================
        
        System.out.println(doubleline);
        System.out.println("Binary Converter");
        System.out.println(doubleline);
        
        System.out.println("Enter integer: ");
        user_input = scan.nextInt();
        System.out.println(doubleline);
        
        int newNum;        
        base_10Num = user_input;
        
        //==================================================================
        
        while (base_10Num > 0){
            
            newNum = base_10Num % 2;
            base_10Num = base_10Num / 2;
            
            binaryNum = newNum + binaryNum;            
        } 
        
        //==================================================================
        
        System.out.println("Base 10 integer: " + user_input);
        System.out.println("Binary number: " + binaryNum);
        System.out.println(doubleline);
    }
}
