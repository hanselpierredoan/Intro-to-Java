// Name: Hansel Doan
// Date: 06/27/22
// Assignment: Chapter 5 Exercise 2
// Description: A simple program using a while loop.
// Adds all numbers with the sum of 0, and each number that is
// in the range of 1-1000 are divisible by 8, and not 7
// then displays the sum which is 54432.
// Comment: This one I had a slight problem because I couldn't figure out the 
// the while loop that adds up all the numbers.
// The first code I had had an error that couldn't parse the code
// but ultimately I tried to write this code as concise as possible.

public class exercise2 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 1000) {
            if (i % 8 == 0 && i % 7 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
