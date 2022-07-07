// Name: Hansel Doan
// Date: 07/07/22
// Assignment: Chapter 6 Exercise 3
// Description: Write a version of the Craps game and follow along with
// Chapter 6 video in Module.
package craps;

import java.security.SecureRandom;

public class exercise3 {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE, WON, LOST
    };

    // Constants for common roll
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;

        Status gameStatus;

        int sumOfDice = rollDice();

        //Checks the first roll
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        }

        // Checks each additional roll
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

        // Display Results
        if (gameStatus == Status.WON) {
            System.out.println("Player Wins!");
        } else {
            System.out.println("Player loses...");
        }

    }

    private static int rollDice() {
        int d1 = 1 + randomNumbers.nextInt(6);
        int d2 = 1 + randomNumbers.nextInt(6);

        int sum = d1 + d2;
        System.out.printf("Player rolled %d + %d = %d%n", d1, d2, sum);
        return sum;
    }

}
