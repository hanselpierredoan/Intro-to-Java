// Name: Hansel Doan
// Date: 06/07/22
// Assignment: Chapter 2 Exercise 3
// Description: Prompts to enter meters/seconds in speed--acceleration, displays minimum runway length for airplane.

import java.util.Scanner;

public class exercise3{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
    
        System.out.printf("The minimum runway length for this airplane is %.2f\n", length);
    }

}