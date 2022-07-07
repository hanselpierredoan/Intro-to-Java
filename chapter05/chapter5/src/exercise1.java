// Name: Hansel Doan
// Date: 06/27/22
// Assignment: Chapter 5 Exercise 1
// Description: Prompt me to enter width and height of rectangle
// Using for loops that:
// Displays Rectangle represented with #, corresponding to input for w + h of rectangle.

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        int height;
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
