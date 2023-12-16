package Java.d_Randoms;

import java.util.Random;

public class b_DieRolling {
    public static void main(String[] args) {
        
        String bar = "--------------------";
        
        Random rand = new Random();
        
        int numOnes = 0;
        int numTwos = 0;
        int numThrees = 0;
        int numFours = 0;
        int numFives = 0;
        int numSixes = 0;
        
        System.out.println(bar);
        for (int rolltimes = 1; rolltimes <= 10000; rolltimes++){
            int diceroll = rand.nextInt(6) + 1;
            
            if (diceroll == 1){
                numOnes++;
            }
            
            else if (diceroll == 2){
                numTwos++;
            }
            
            else if (diceroll == 3){
                numThrees++;
            }
            
            else if (diceroll == 4){
                numFours++;
            }
            
            else if (diceroll == 5){
                numFives++;
            }

            else {
                numSixes++;
            }
        }
        
        System.out.println("Times rolled 1: " + numOnes);
        System.out.println("Times rolled 2: " + numTwos);
        System.out.println("Times rolled 3: " + numThrees);
        System.out.println("Times rolled 4: " + numFours);
        System.out.println("Times rolled 5: " + numFives);
        System.out.println("Times rolled 6: " + numSixes);
        System.out.println(bar);
    }
}
