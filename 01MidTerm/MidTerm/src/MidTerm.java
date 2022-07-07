// Name: Hansel Doan
// Date: 07/08/2022
// Assignment: MidTerm
// Description: Create a fully functioning Java application. 
// Prompts user for name and stores it.
// Displays a menu. Asks user to make a selection of...
// Flip a Coin, IQ Test, Display a table, guess a number, and exit.
// Method to flip a coin, randomly displays Heads or Tails.
// Creates a table in a n x n grid of the letter entered.
// Guess a number between 19 and 47, randomly generates a number and
// Cont: sees if user got it correct, displays the results.
// When exiting, displays a thank you banner.
// In the menu, if user enters a number that is anything other than 1-5, displays an error.

import java.util.Random;
import java.util.Scanner;

public class MidTerm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String userName = "";
        int menuSelection;
        int userIQ;
        int randomNumber1;
        int randomNumber2;
        int userAnswer;
        char tableLetter;
        int tableSize;
        int userGuess;
        int randomGuess;

        do {
            if (userName.equals("")) {
                System.out.println("Enter your name: ");
                userName = input.next();
            }

            displayMenu(userName);
            menuSelection = input.nextInt();

            switch (menuSelection) {
                case 1:
                    flipCoin();
                    break;
                case 2:
                    userIQ = testIQ(userName, rand);
                    System.out.println("Your IQ is: " + userIQ);
                    break;
                case 3:
                    System.out.println("Enter a letter: ");
                    tableLetter = input.next().charAt(0);
                    System.out.println("Enter a number from 4 to 13: ");
                    tableSize = input.nextInt();
                    if (tableSize < 4) {
                        tableSize = 4;
                    } else if (tableSize > 13) {
                        tableSize = 13;
                    }
                    drawTable(tableLetter, tableSize);
                    break;
                case 4:
                    randomGuess = rand.nextInt(29) + 19;
                    System.out.println("Guess a number from 19 to 47: ");
                    userGuess = input.nextInt();
                    if (userGuess == randomGuess) {
                        System.out.println("You guessed correctly!");
                    } else {
                        System.out.println("The number was " + randomGuess + ". You guessed " + userGuess);
                    }
                    break;
                case 5:
                    System.out.println("Thanks for playing! Please come back again!");
                    break;
                default:
                    System.out.println("Try again...");
                    break;
            }
        } while (menuSelection != 5);
    }

    public static void displayMenu(String userName) {
        System.out.println("Hi, " + userName + "! Please make a selection.");
        System.out.println("1 - Flip a Coin");
        System.out.println("2 - Test your IQ");
        System.out.println("3 - Display a table");
        System.out.println("4 - Guess the Number");
        System.out.println("5 - Exit");
    }

    public static void flipCoin() {
        Random rand = new Random();
        int coinFlip = rand.nextInt(2);
        if (coinFlip == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }

    public static int testIQ(String userName, Random rand) {
        Scanner input = new Scanner(System.in);
        int IQ;
        int randomNumber1 = rand.nextInt(127) + 7;
        int randomNumber2 = rand.nextInt(127) + 7;

        System.out.println("Hi, " + userName + "! I'm going to test your IQ.");
        System.out.println("What is the sum of " + randomNumber1 + " and " + randomNumber2 + "?");
        int userAnswer = input.nextInt();
        if (userAnswer == (randomNumber1 + randomNumber2)) {
            System.out.println("Great Job!");
            IQ = 93 + (randomNumber1 + randomNumber2);
        } else {
            System.out.println("No, the answer was " + (randomNumber1 + randomNumber2));
            IQ = 35 + (randomNumber1 + randomNumber2);
        }
        return IQ;
    }

    public static void drawTable(char tableLetter, int tableSize) {
        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                System.out.print(tableLetter + " ");
            }
            System.out.println();
        }
    }
}
