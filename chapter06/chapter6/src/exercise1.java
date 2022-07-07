// Name: Hansel Doan
// Date: 07/07/22
// Assignment: Chapter 6 Exercise 1
// Description: We use the method provided to create a test program
// that displays the three numbers sorted and invokes the method provided.

public class exercise1 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    /* Write a method with the following header to display three numbers in increasing order:
	public static void displaySortedNumbers(double num1, double num2, double num3)
     */
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
}
