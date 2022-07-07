// Name: Hansel Doan
// Date: 07/13/22
// Assignment: Chapter 7 Exercise 1
// Description: Creates an array of 10 numbers, then finds the index of the smallest number 
// in the array and the smallest element in the input of ten ints.

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int index = indexOfSmallNumber(numbers);
        System.out.println("The index of the smallest number is " + index);
        System.out.println("The smallest element is " + numbers[index]);
    }

    public static int indexOfSmallNumber(int[] numberArray) {
        int index = 0;
        int min = numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
                index = i;
            }
        }
        return index;
    }
}
