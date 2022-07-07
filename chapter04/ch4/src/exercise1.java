// Name: Hansel Doan
// Date: 06/21/22
// Assignment: Chapter 4 Exercise 1
// Description: Using the international standard letter/number mapping found on the telephone:
// Prompt the user to enter a letter
// Display its corresponding number
// For Nonletter, displays invalid

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        int number = 0;
        if (Character.isLetter(ch)) {
            if (ch >= 'W') {
                number = 9;
            } else if (ch >= 'T') {
                number = 8;
            } else if (ch >= 'P') {
                number = 7;
            } else if (ch >= 'M') {
                number = 6;
            } else if (ch >= 'J') {
                number = 5;
            } else if (ch >= 'G') {
                number = 4;
            } else if (ch >= 'D') {
                number = 3;
            } else if (ch >= 'A') {
                number = 2;
            }
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
