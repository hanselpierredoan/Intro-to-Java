// Name: Hansel Doan
// Date: 07/20/22
// Assignment: Chapter 8 Exercise 2
// Description below;
// Create method to find common values with method header provided,
// Create 2D array,
// Prompts me to enter values for first array,
// Prompts me to enter values for second array,
// Display common values.
// Enter 9 integers for both arrays, forming a 3x3 2D array, finding common values.
// Continue entering the 9 values until it prompts user for the values of the second array.

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] firstArray = new int[3][3];
        int[][] secondArray = new int[3][3];

        System.out.println("Enter values for first array: ");
        for (int[] firstArray1 : firstArray) {
            for (int j = 0; j < firstArray1.length; j++) {
                firstArray1[j] = input.nextInt();
            }
        }

        System.out.println("Enter values for second array: ");
        for (int[] secondArray1 : secondArray) {
            for (int j = 0; j < secondArray1.length; j++) {
                secondArray1[j] = input.nextInt();
            }
        }

        System.out.println("Common values are: ");
        findCommonValues(firstArray, secondArray);
    }

    public static void findCommonValues(int[][] firstArray, int[][] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                if (firstArray[i][j] == secondArray[i][j]) {
                    System.out.println("Matching value at " + i + ", " + j);
                }
            }
        }
    }
}
