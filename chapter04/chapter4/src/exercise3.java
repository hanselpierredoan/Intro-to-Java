// Name: Hansel Doan
// Date: 06/23/22
// Assignment: Chapter 4 Exercise 3
// Description: Prompts user to enter four cities one by one.
// Orders four cities.
// Sorts them in alphabetical order in the output.
// Use if and comparing lines against each other in order to alphabetically sort.

import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        System.out.print("Enter the fourth city: ");
        String city4 = input.nextLine();

        String temp;

        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }

        if (city1.compareTo(city3) > 0) {
            temp = city1;
            city1 = city3;
            city3 = temp;
        }

        if (city1.compareTo(city4) > 0) {
            temp = city1;
            city1 = city4;
            city4 = temp;
        }

        if (city2.compareTo(city3) > 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }

        if (city2.compareTo(city4) > 0) {
            temp = city2;
            city2 = city4;
            city4 = temp;
        }

        if (city3.compareTo(city4) > 0) {
            temp = city3;
            city3 = city4;
            city4 = temp;
        }

        System.out.println("The four cities in alphabetical order are "
                + city1 + " " + city2 + " " + city3 + " " + city4);
    }
}
