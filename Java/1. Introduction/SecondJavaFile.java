import java.util.Scanner;

public class SecondJavaFile {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num1; 
        
        System.out.println("Please enter a number: ");    
        num1 = scan.nextInt();
        
        System.out.println("twice your number is: " + num1 * 2);

    }
}