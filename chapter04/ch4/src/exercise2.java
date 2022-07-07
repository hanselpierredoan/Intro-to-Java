// Name: Hansel Doan
// Date: 06/22/22
// Assignment: Chapter 4 Exercise 2
// Description: Get a random integer from 0 - 26, select a random character out of the alphabet and 
// display print upper case

public class exercise2 {

    public static void main(String[] args) {

        char c1 = (char) (Math.random() * 26 + 'A');

        char c2 = (char) (Math.random() * 26 + 'A');

        char c3 = (char) (Math.random() * 26 + 'A');

        char c4 = (char) (Math.random() * 26 + 'A');

        char c5 = (char) (Math.random() * 26 + 'A');

        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);

    }

}
