// Name: Hansel Doan
// Date: 06/06/22
// Assignment: Chapter 2 Exercise 1
// Description: Create an app that converts pounds into bloonkins. In the output console you can enter in pounds when the app is ran
// Description cont: --and then converts the pounds into bloonkins.

import java.util.Scanner;

class ConvertingPoundsIntoBloonkins {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double bloonkins = pounds * 0.713;
		System.out.print(pounds + " pounds is " + bloonkins + " bloonkins");
	}
}
