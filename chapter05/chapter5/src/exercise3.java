// Name: Hansel Doan
// Date: 06/27/22
// Assignment: Chapter 5 Exercise 3
// Description: Prompt the user to enter an integer from 1 to 15, 
// Display an upside-down pyramid
// Imports the scanner class so that the program can take my input.
// Stores my input as the numberOfLines variable
// Uses for loops to initialze row variables etc.

import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 15: ");
        int numberOfLines = input.nextInt();

        for (int row = numberOfLines; row >= 1; row--) {
            for (int space = 1; space <= numberOfLines - row; space++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 2; i--) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
