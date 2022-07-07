// Name: Hansel Doan
// Date: 07/31/2022
// Assignment: Final Adventure
// Description: Create a program that allows the user to go on an adventure, choosing what to do through the console input.
// Specs:
// There is a for loop, a while loop, and a do/while loop used to keep the project running until the user wishes to end.
// In addition to the main method, there are 3 other methods in the main class. These methods receive AND return values.
// There is 1 other class in the project with 3 attributes, 3 behaviors, and 1 overloaded constructor and the default constructor. 
// Objects of the class are used in the application.
// There is a single dimensional array and a multi dimensional array used in the application. 
// There is also an array that stores a collection of one of the classes.
// The code creates a static variable called playerHp, a scanner object called input, and several other variables. 
// There is also an array called enemyLoot. The code has a do-while loop that runs until the player's hp is below 0. 
// There are several options the player can choose from inside the loop. 
// If the player chooses option A, they will attack the enemy and deal damage. 
// If the player chooses option B, they will loot the enemy and find items. 
// If the player chooses option C, they will run away from the enemy. 
// If the enemy's hp is above 0, the enemy will attack the player. 
// If the player's hp is below 0, the game will end.

import java.util.Scanner;

public class Adventure {

    //Create static variable
    public static int playerHp = 100;

    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Create variables
        String userInput;
        int enemyHp = 100;
        int playerAttack = 10;
        int enemyAttack = 10;

        //Create array
        int[] enemyLoot = {0, 1, 2};

        //Start loop
        do {

            //Print available options
            System.out.println("What would you like to do?");
            System.out.println("A. Attack");
            System.out.println("B. Loot");
            System.out.println("C. Run");

            //Get user input
            userInput = input.nextLine();

            //Switch statement
            switch (userInput) {
                case "A":
                    //Attack
                    enemyHp -= playerAttack;
                    System.out.println("You attack the enemy and deal " + playerAttack + " damage!");
                    System.out.println("The enemy's HP is now " + enemyHp);
                    break;
                case "B":
                    //Loot
                    System.out.println("You loot the enemy and find:");
                    for (int i = 0; i < enemyLoot.length; i++) {
                        System.out.println(enemyLoot[i]);
                    }
                    break;
                case "C":
                    //Run
                    System.out.println("You run away from the enemy!");
                    break;
                default:
                    System.out.println("That is not a valid input");
                    break;
            }

            //Check if enemy is still alive
            if (enemyHp > 0) {
                //Enemy attacks
                playerHp -= enemyAttack;
                System.out.println("The enemy attacks you and deals " + enemyAttack + " damage!");
                System.out.println("Your HP is now " + playerHp);
            }

            //Check if player is still alive
            if (playerHp <= 0) {
                //Game over
                System.out.println("You have died!");
                break;
            }

        } while (true);

    }

}
