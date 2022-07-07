// Name: Hansel Doan
// Date: 07/27/22
// Assignment: Chapter 9 Exercise 1
// Description: This code is a Java class that defines the fields and methods for an Employee object. 
// The fields include the employee's first name, last name, years with the company, and pay rate. 
//The methods include getters and setters for each of the fields.
package employeetesting;

class Employee {

    private String firstName, lastName;

    private int yearsWithCompany;

    private double payRate;

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getYearsWithCompany() {

        return yearsWithCompany;

    }

    public void setYearsWithCompany(int yearsWithCompany) {

        this.yearsWithCompany = yearsWithCompany;

    }

    public double getPayRate() {

        return payRate;

    }

    public void setPayRate(double payRate) {

        this.payRate = payRate;

    }

}
