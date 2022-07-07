// Name: Hansel Doan
// Date: 07/13/22
// Assignment: Chapter 7 Exercise 1
// Description: Create a class named TestAverage and a main method. 
// The main method prompts the user to enter five double values. These values are stored in an array named values. 
// The average method is then called with values as an argument. This method returns the average of the array elements as a double value. 
// Finally, the average value is output to the console and the sum of the doubles is also outputted.

import java.util.Scanner;

public class exercise1redo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five double values: ");
        double[] values = new double[5];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The average is " + average(values));
        System.out.println("The sum is " + sum(values));
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
