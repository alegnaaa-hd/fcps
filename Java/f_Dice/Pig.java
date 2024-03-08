package Java.f_Dice;

import java.util.Scanner;
import java.util.Random;

public class Pig {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String line = "------------------------------------------";
        String bar = "                --------";

        System.out.println(line);
        System.out.println("Welcome to the Pig Dice Game");
        System.out.println(line);

        //////////////////////////// DEFINING VARIABLES ////////////////////////////

        int gameloop = 0;
        int userloop = 0;
        int comploop = 0;

        int rolluserscore = 0;
        int totaluserscore = 0;
        int tempuserscore = 0;

        int rollcompscore = 0;
        int totalcompscore = 0;
        int tempcompscore = 0;

        //////////////////////////// GAME CODE ////////////////////////////

        while ((gameloop == 0) && (totaluserscore < 100) && (totalcompscore < 100)) {

            userloop = 0;
            comploop = 0;

            //////////////////////////// PLAYER'S TURN ////////////////////////////

            while (userloop == 0) {
                System.out.println("Player's Turn");
                System.out.println(line);
                int udiceone = rand.nextInt(6) + 1;
                int udicetwo = rand.nextInt(6) + 1;

                if (udiceone >= 2 && udicetwo >= 2) {
                    rolluserscore = udiceone + udicetwo;
                    System.out.println("Your roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + udiceone);
                    System.out.println("Dice #2: " + udicetwo);
                    System.out.println(bar);
                    System.out.println("Roll Score: " + rolluserscore);
                    System.out.println(line);
                    System.out.println("Do you want to roll again?");
                    System.out.println("Enter choice [yes/no]: ");
                    String ucontinue = scan.next();
                    System.out.println(line);

                    if (ucontinue.equals("no")) {
                        tempuserscore = tempuserscore + rolluserscore;
                        totaluserscore = totaluserscore + tempuserscore;

                        if (totaluserscore >= 100) {
                            break;
                        }

                        System.out.println("Round score: " + tempuserscore);
                        System.out.println("Total score: " + totaluserscore);
                        System.out.println(line);
                        System.out.println("User Turn Over");
                        System.out.println(line);
                        tempuserscore = 0;

                        userloop++;
                        gameloop++;
                    }

                    else if (ucontinue.equals("yes")) {
                        tempuserscore = tempuserscore + rolluserscore;
                        System.out.println("Current round score: " + tempuserscore);
                        System.out.println(line);
                    }

                }
               
                else if ((udiceone == 1 || udicetwo == 1) && (udiceone != 1 || udicetwo != 1)) {
                    rolluserscore = 0;
                    tempuserscore = 0;

                    System.out.println("Your roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + udiceone);
                    System.out.println("Dice #2: " + udicetwo);
                    System.out.println(bar);
                    System.out.println("Round Score: " + rolluserscore);
                    System.out.println(bar);
                    System.out.println("Total Score: " + totaluserscore);
                    System.out.println(line);

                    userloop++;
                    gameloop++;
                }
               
                else if (udiceone == 1 && udicetwo == 1) {
                    rolluserscore = 0;
                    tempuserscore = 0;
                    totaluserscore = 0;
                    System.out.println("Your roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + udiceone);
                    System.out.println("Dice #2: " + udicetwo);
                    System.out.println(bar);
                    System.out.println("Round Score: " + tempuserscore);
                    System.out.println(bar);
                    System.out.println("Total Score: " + totaluserscore);
                    System.out.println(line);
                    userloop++;
                    gameloop++;
                }
            }

            //////////////////////////// COMPUTER'S TURN ////////////////////////////

            while (comploop == 0) {
                System.out.println("Computer's Turn");
                System.out.println(line);
                int cdiceone = rand.nextInt(6) + 1;
                int cdicetwo = rand.nextInt(6) + 1;

                if (cdiceone >= 2 && cdicetwo >= 2) {
                    rollcompscore = cdiceone + cdicetwo;
                    System.out.println("Computer's roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + cdiceone);
                    System.out.println("Dice #2: " + cdicetwo);
                    System.out.println(bar);
                    System.out.println("Roll Score: " + rollcompscore);
                    System.out.println(line);

                    int compchoice = rand.nextInt(2) + 1;
                    String compcontinue;

                    if (compchoice == 1) {
                        compcontinue = "no";
                    }
                   
                    else {
                        compcontinue = "yes";
                    }

                    System.out.println("Computer's Choice: " + compcontinue);
                    System.out.println(bar);

                    if (compcontinue.equals("no")) {
                        tempcompscore = tempcompscore + rollcompscore;
                        totalcompscore = totalcompscore + tempcompscore;

                        if (totalcompscore >= 100) {
                            break;
                        }

                        System.out.println("Round score: " + tempcompscore);
                        System.out.println("Total score: " + totalcompscore);
                        System.out.println(line);
                        System.out.println("Computer Turn Over");
                        System.out.println(line);
                        tempcompscore = 0;
                        comploop++;
                        gameloop++;
                    }

                    if (compcontinue.equals("yes")) {
                        tempcompscore = tempcompscore + rollcompscore;
                        System.out.println("Current round score: " + tempcompscore);
                        System.out.println(line);
                    }
                }
               
                else if ((cdiceone == 1 || cdicetwo == 1) && (cdiceone != 1 || cdicetwo != 1)) {
                    rollcompscore = 0;
                    tempcompscore = 0;
                    System.out.println("Computer's roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + cdiceone);
                    System.out.println("Dice #2: " + cdicetwo);
                    System.out.println(bar);
                    System.out.println("Round Score: " + rollcompscore);
                    System.out.println(bar);
                    System.out.println("Total Score: " + totalcompscore);
                    System.out.println(line);
                    comploop++;
                    gameloop++;
                }
               
                else if (cdiceone == 1 && cdicetwo == 1) {
                    rollcompscore = 0;
                    tempcompscore = 0;
                    totalcompscore = 0;
                    System.out.println("Computer's roll");
                    System.out.println(bar);
                    System.out.println("Dice #1: " + cdiceone);
                    System.out.println("Dice #2: " + cdicetwo);
                    System.out.println(bar);
                    System.out.println("Round Score: " + tempcompscore);
                    System.out.println(bar);
                    System.out.println("Total Score: " + totalcompscore);
                    System.out.println(line);
                    comploop++;
                    gameloop++;
                }
            }

            userloop = 0;
            gameloop = 0;
            
        }
       
        //////////////////////////// GAME OVER ////////////////////////////

        System.out.println("GAME OVER");
        System.out.println(line);

        if (totaluserscore >= 100) {
            System.out.println("User Wins");
            System.out.println(bar);
            System.out.println("User final score: " + totaluserscore);
            System.out.println("Computer final score: " + totalcompscore);
            System.out.println(line);
        }
       
        else if (totalcompscore >= 100) {
            System.out.println("Computer Wins");
            System.out.println(bar);
            System.out.println("Computer final score: " + totalcompscore);
            System.out.println("User final score: " + totaluserscore);
            System.out.println(line);
        }
    }
}
