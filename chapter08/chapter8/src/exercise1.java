// Name: Hansel Doan
// Date: 07/20/22
// Assignment: Chapter 8 Exercise 1
// Description: Input number of rows and columns and computes onto a 2D Array, and sums up only the odd values.
// defines a two-dimensional array of doubles, 
// prompts the user to input the array values, 
// and outputs the sum of all odd values in the array.
//Continue entering values until user has filled out the array.

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] items = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                items[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of odd values: " + sumOddValues(items));
    }

    public static double sumOddValues(double[][] items) {
        double sum = 0;
        for (double[] item : items) {
            for (int j = 0; j < item.length; j++) {
                if (item[j] % 2 != 0) {
                    sum += item[j];
                }
            }
        }
        return sum;
    }
}
