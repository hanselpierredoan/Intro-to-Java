// Name: Hansel Doan
// Date: 07/31/2022
// Assignment: Final Small Business
// Description: This code creates a small business simulation program. 
// The user can choose from a menu of options to update inventory, make a sale, pay employees, or exit the program. 
// The program tracks the sales made and the number of customers served.
// The code tracks the sales made by the business by adding the total sale amount to the sales total for the business.
// The code tracks the number of customers served by incrementing the numOfCustomers variable every time a sale is made.

import java.util.Scanner;

public class SmallBusiness {

    public static void main(String[] args) {

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Declare variables
        int selection;
        double salesTotal = 0;
        double[] salesArray = new double[7];

        //Create object of Business class
        Business myBusiness = new Business();

        //Declare and initialize multi-dimensional array
        String[][] productArray = {{"Product 1", "10.00"},
        {"Product 2", "20.00"},
        {"Product 3", "30.00"},
        {"Product 4", "40.00"},
        {"Product 5", "50.00"},
        {"Product 6", "60.00"},
        {"Product 7", "70.00"}};

        //Create do-while loop to keep program running until user ends
        do {

            //Print menu
            System.out.println("*******************************");
            System.out.println("*       Main Menu             *");
            System.out.println("* 1. Update Inventory        *");
            System.out.println("* 2. Make a Sale             *");
            System.out.println("* 3. Pay Employees           *");
            System.out.println("* 4. Exit                    *");
            System.out.println("*******************************");

            //Get user input
            System.out.print("\nEnter selection: ");
            selection = input.nextInt();

            //Use switch statement to run corresponding method for each menu option
            switch (selection) {
                case 1:
                    myBusiness.updateInventory();
                    break;
                case 2:
                    myBusiness.makeSale();
                    break;
                case 3:
                    myBusiness.payEmployees();
                    break;
                case 4:
                    myBusiness.exit();
                    break;
                default:
                    System.out.println("\nError: Invalid selection");

            }

        } while (selection != 4);

    }

}

class Business {

    //Declare variables
    String businessName;
    String ownerName;
    int numOfEmployees;
    double inventory;
    double sales;
    double expenses;
    static int numOfCustomers;

    //Default constructor
    public Business() {

        businessName = "";
        ownerName = "";
        numOfEmployees = 0;
        inventory = 0;
        sales = 0;
        expenses = 0;

    }

    //Overloaded constructor
    public Business(String bName, String oName, int numEmp, double inv, double sale, double exp) {

        businessName = bName;
        ownerName = oName;
        numOfEmployees = numEmp;
        inventory = inv;
        sales = sale;
        expenses = exp;

    }

    //Method to update inventory
    public void updateInventory() {

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("\nEnter updated inventory amount: ");
        inventory = input.nextDouble();

        //Print confirmation message
        System.out.println("\nInventory updated");

    }

    //Method to make a sale
    public double makeSale() {

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Declare variables
        int productSelection;
        double productCost = 0;
        double productQuantity;
        double saleTotal;
        saleTotal = 0;

        //Get user input
        System.out.print("\nEnter product number: ");
        productSelection = input.nextInt();

        //Get product cost
        System.out.print("Enter quantity sold: ");
        productQuantity = input.nextInt();

        //Calculate sale total
        saleTotal = productCost * productQuantity;

        //Add sale to sales total
        sales += saleTotal;

        //Increment number of customers
        numOfCustomers++;

        //Print confirmation message
        System.out.println("\nSale complete");

        //Return sale total
        return saleTotal;

    }

    //Method to pay employees
    public void payEmployees() {

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Declare variables
        double payAmount;

        //Get user input
        System.out.print("\nEnter employee pay amount: ");
        payAmount = input.nextDouble();

        //Subtract pay amount from expenses
        expenses -= payAmount;

        //Print confirmation message
        System.out.println("\nEmployees paid");

    }

    //Method to exit program
    public void exit() {

        //Print exit message
        System.out.println("\nGoodbye");

    }

}
