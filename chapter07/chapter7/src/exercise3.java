// Name: Hansel Doan
// Date: 07/13/22
// Assignment: Chapter 7 Exercise 1
// Description: Uses the method and creates a program that takes in 10 integers from a user and stores them in an array. 
// It then creates two new arrays, one with the even indices of the first array and one with the odd indices. 
// Finally, it prints all three arrays.
// The first two outputs are in the size of five whilst the last is the size of ten.

public class exercise3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        splitArray(arr);
    }

    public static void splitArray(int[] arr) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr1[i / 2] = arr[i];
            } else {
                arr2[i / 2] = arr[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
