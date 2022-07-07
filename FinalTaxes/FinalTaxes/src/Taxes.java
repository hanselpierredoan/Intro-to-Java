// Name: Hansel Doan
// Date: 07/31/2022
// Assignment: Final Taxes
// Description: The code calculates how much in taxes a person owes based on their filing status, number of allowances, gross income, and deductions. 
// The user inputs their filing status, number of allowances, gross income, and deductions, and the code calculates the amount of taxes owed. 
// If the amount of taxes owed is less than the amount of taxes withheld, the code calculates and displays the refund amount. 
// If the amount of taxes owed is more than the amount of taxes withheld, the code displays the amount of taxes owed.
// The code uses a variety of control structures, 
// including if/else statements and for loops, to calculate the amount of taxes owed. 
// It also uses an array to store the tax brackets and tax rates.
// Specs:
// calculates how much taxes a person owes based on their filing status, number of allowances, gross income, deductions, and amount of tax withheld.
// uses a variety of variables, including filingStatus, numOfAllowances, grossIncome, deductions, taxableIncome, taxOwed, taxWithheld, refund, taxBrackets, and taxRates.
// uses an if/else statement to calculate the amount of taxes owed based on the person's taxable income.
// allows the user to input their filing status, number of allowances, gross income, deductions, and amount of tax withheld.
// calculates the refund or amount of taxes owed and displays the result to the user.
// uses the Scanner class for user input.
// uses the nextInt() and nextDouble() methods to get input from the user.
// uses the System.out.println() method to display output to the user.
// uses the Math class to calculate the refund or amount of taxes owed.
// uses the static main() method to run the program.

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        //Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Declare variables
        int filingStatus;
        int numOfAllowances;
        double grossIncome;
        double deductions;
        double taxableIncome;
        double taxOwed = 0;
        double taxWithheld;
        double refund;
        double[] taxBrackets = {0, 9700, 39475, 84200, 160725, 204100, 510300, 0};
        double[] taxRates = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};

        //Get user input
        System.out.println("Enter your filing status (1 for single filer, 2 for married filing jointly or qualifying widow(er), 3 for married filing separately, 4 for head of household): ");
        filingStatus = input.nextInt();

        System.out.println("Enter the number of allowances you are claiming: ");
        numOfAllowances = input.nextInt();

        System.out.println("Enter your total gross income: ");
        grossIncome = input.nextDouble();

        System.out.println("Enter any deductions you are claiming (e.g. student loan interest, alimony, etc.): ");
        deductions = input.nextDouble();

        //Calculate taxable income
        taxableIncome = grossIncome - deductions - ((numOfAllowances * 2000));

        //Calculate tax owed
        if (taxableIncome <= taxBrackets[filingStatus]) {
            taxOwed = taxableIncome * taxRates[0];
        } else if (taxableIncome <= taxBrackets[filingStatus + 1]) {
            taxOwed = taxableIncome * taxRates[1];
        } else if (taxableIncome <= taxBrackets[filingStatus + 2]) {
            taxOwed = taxableIncome * taxRates[2];
        } else if (taxableIncome <= taxBrackets[filingStatus + 3]) {
            taxOwed = taxableIncome * taxRates[3];
        } else if (taxableIncome <= taxBrackets[filingStatus + 4]) {
            taxOwed = taxableIncome * taxRates[4];
        } else if (taxableIncome <= taxBrackets[filingStatus + 5]) {
            taxOwed = taxableIncome * taxRates[5];
        } else if (taxableIncome > taxBrackets[filingStatus + 5]) {
            taxOwed = taxableIncome * taxRates[6];
        }

        //Get user input
        System.out.println("Enter the amount of tax withheld from your paycheck: ");
        taxWithheld = input.nextDouble();

        //Calculate refund or amount owed
        if (taxOwed < taxWithheld) {
            refund = taxWithheld - taxOwed;
            System.out.println("You are due a refund of $" + refund);
        } else {
            System.out.println("You owe $" + (taxOwed - taxWithheld) + " in taxes.");
        }
    }
}
