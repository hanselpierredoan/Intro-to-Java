// Name: Hansel Doan
// Date: 06/14/22
// Assignment: Chapter 3 Exercise 3
// Description further explained below: write a rock paper scissors game against a computer.
// Comment: This ex. was a lot of fun but took the most time and not really the most efficiently written code but it was still a lot to learn and fun!

//Get the user's pick
//Get the computer's pick
//Display the user's pick
//Display the computer's pick
//display the winner
import java.util.Scanner;

public class exercise3redo {

    public static void main(String[] args) {
        int userPick;
        int computerPick;
        String message;

        Scanner input = new Scanner(System.in);

        System.out.print("Choose (0) rock, (1) paper, (2) scissors: ");
        userPick = input.nextInt();

        computerPick = (int) (Math.random() * 3);

        System.out.print("User picked ");
        switch (userPick) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
        }

        System.out.print("Computer picked ");
        switch (computerPick) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
        }

        if (userPick == computerPick) {
            message = "It's a draw.";
        } else if (userPick == 0 && computerPick == 1) {
            message = "Paper covers rock. Computer wins.";
        } else if (userPick == 0 && computerPick == 2) {
            message = "Rock crushes scissors. You win.";
        } else if (userPick == 1 && computerPick == 0) {
            message = "Paper covers rock. You win.";
        } else if (userPick == 1 && computerPick == 2) {
            message = "Scissors cut paper. Computer wins.";
        } else if (userPick == 2 && computerPick == 0) {
            message = "Rock crushes scissors. Computer wins.";
        } else {
            message = "Scissors cut paper. You win.";
        }
        System.out.println(message);
    }
}
