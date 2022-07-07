// Name: Hansel Doan
// Date: 07/27/22
// Assignment: Chapter 9 Exercise 1
// Description: Creates two Employee objects and sets their respective first name, last name, years with the company, and pay rate. 
// The code then prints out each employee's information. Retrieving the getter method.
package employeetesting;

public class EmployeeTesting {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setFirstName("John");

        e1.setLastName("Doe");

        e1.setYearsWithCompany(5);

        e1.setPayRate(8.5);

        System.out.println("Employee First Name: " + e1.getFirstName());

        System.out.println("Employee Last Name: " + e1.getLastName());

        System.out.println("Employee Number of years in company: " + e1.getYearsWithCompany());

        System.out.println("Employee Pay Rate: " + e1.getPayRate());

        Employee e2 = new Employee();

        e2.setFirstName("Jane");

        e2.setLastName("Doe");

        e2.setYearsWithCompany(1);

        e2.setPayRate(6.5);

        System.out.println("Employee First Name: " + e2.getFirstName());

        System.out.println("Employee Last Name: " + e2.getLastName());

        System.out.println("Employee Number of years in company: " + e2.getYearsWithCompany());

        System.out.println("Employee Pay Rate: " + e2.getPayRate());

    }

}
