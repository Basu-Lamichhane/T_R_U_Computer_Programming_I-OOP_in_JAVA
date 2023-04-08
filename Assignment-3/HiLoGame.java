
/**
 * "HiLoGame" is Java application that picks a random number between 1 and 100,
 * then repeatedly prompt the user to guess the number and on each guess. It reports
 * to the user that they are correct or that the guess is high or low. It continues
 * accepting guesses until the user guesses correctly or chooses to quit. It also 
 * counts the number of guesses and reports that value when the user guesses correctly. 
 * If a guess is out of the range 1 to 100, an appropriate message is displayed to the user.
 * At the end of each game (by quitting or a correct guess),it prompts to determine whether 
 * the user wants to play again. It continues playing another game until the user 
 * chooses to stop. This program uses a nest of loops :
 * 
 * ---the outer loop to play each game until the user chooses to stop. 
 * ---the inner loop to prompt the user for each guess in a game.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-28
 * files : HiLoGame.java
 * email :
 *
 */

import java.util.Scanner;
import java.util.Random;

public class HiLoGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess, n, count;

        System.out.println("!!!!!!!!!!!!!Welcome to the Hi-Lo Game!!!!!!!!!!!!!");

        do {
            n = rand.nextInt(100) + 1;
            count = 0;

            System.out.println(
                    "I have a number between 1 and 100 in my mind. Try your luck and guess that number ! (BEST OF LUCK!!!)");

            do {
                System.out.print("Provide your best guess. (from 1 to 100)(or 0 to quit): ");
                guess = input.nextInt();
                count++;

                if (guess == 0) {
                    System.out.println("It pains me to see you go. The number that I thought was " + n + ".");
                    break;
                } else if (guess < 1 || guess > 100) {
                    System.out.println("Your prediction is out of range. Please enter a number between 1 and 100.");
                    count--;
                } else if (guess < n) {
                    System.out.println("Your prediction is too low. Try again!");
                } else if (guess > n) {
                    System.out.println("Your prediction is too high. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + count + " tries.");
                }
            } while (guess != n && guess != 0);

            System.out.print("Do you want to play again? (y/n) ");
        } while (input.next().equalsIgnoreCase("y"));

        System.out.println("Thanks for playing the Hi-Lo Game!");
    }
}
