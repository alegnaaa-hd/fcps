package Java.g_Methods;

public class DiePractice {
    public static void main(String[] args) {
        Die sixSided = new Die();
        Die twelveSided = new Die(12);
        
        sixSided.roll();
        twelveSided.roll();
        
        System.out.println("You rolled a " + sixSided.getFaceValue() + " and a " + twelveSided.getFaceValue());
        
        System.out.println("The sum of these two numbers is: " + (sixSided.getFaceValue() + twelveSided.getFaceValue()));
    }
}
