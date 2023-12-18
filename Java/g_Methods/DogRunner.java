package Java.g_Methods;

import java.util.Random;

public class DogRunner {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        Dog d1 = new Dog("Chow", 4, "JoeB", 110);
        
        System.out.println(d1.toString());
        
        double chance = rand.nextDouble();
        
        if (chance < 0.8){
            d1.bark();
        }
        
        d1.eat(1.5);
        
        System.out.println(d1.toString());
    }
}
