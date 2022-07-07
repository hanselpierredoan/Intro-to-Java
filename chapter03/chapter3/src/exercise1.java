// Name: Hansel Doan
// Date: 06/13/22
// Assignment: Chapter 3 Exercise 1
// Description: Prompt me to enter a three digit int. Then outputs it back to me in a descending order starting from the largest. If and else/if statements.

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a three digit int: ");
        int num = s.nextInt();
        int digit1 = num / 100;
        int digit2 = (num % 100) / 10;
        int digit3 = num % 10;
        int largest, middle, smallest;

        if (digit1 >= digit2 && digit1 >= digit3) {
            largest = digit1;
        } else if (digit2 >= digit1 && digit2 >= digit3) {
            largest = digit2;
        } else {
            largest = digit3;
        }

        if (digit1 <= digit2 && digit1 <= digit3) {
            smallest = digit1;
        } else if (digit2 <= digit1 && digit2 <= digit3) {
            smallest = digit2;
        } else {
            smallest = digit3;
        }

        middle = digit1 + digit2 + digit3 - largest - smallest;
        System.out.println(largest + " " + middle + " " + smallest);
    }
}
