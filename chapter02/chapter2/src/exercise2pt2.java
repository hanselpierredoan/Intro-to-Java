// Name: Hansel Doan
// Date: 06/07/22
// Assignment: Chapter 2 Exercise 2
// Description: Prompts me to enter # of seconds, computes # of years and days and displays results
// Comment: I had a lot of problems with exercise 2 therefor the class name. My first attempt computed the years and days competely wrong..

import java.util.Scanner;

public class exercise2pt2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    long seconds = input.nextLong();
    long minutes = seconds / 60;
    long hours = minutes / 60;
    long days = hours / 24;
    long years = days / 365;
    long remainingDays = days % 365;
    System.out.println(seconds + " seconds is approximately " + years + " years and " + remainingDays + " days");
  }
}