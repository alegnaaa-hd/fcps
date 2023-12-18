package Java.g_Methods;

import java.util.Random;

public class Die {
    // Die attributes
    private int numSides;
    private int faceValue;
    private String dieColor;

    // Die behaviors
    public Die() {
        numSides = 6;
        faceValue = 1;
        dieColor = "white";
    }

    public Die (int howManySides){
        numSides = howManySides;
        faceValue = 1;
        dieColor = "white";
    }

    public int roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
