
/**
 * "UsernameCreator" is a Java application that prompts for and reads the user's
 * first and last name (separately), then displays a string composed of the first four characters of the user's last name,
 * followed by the first two letters of the user's first name, followed by a random number in the range of 10 to 99
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : Fraction2Decimal.java
 * email :
 *
 */

import java.util.Random;
import java.util.Scanner;

public class UsernameCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for First and Last name
        System.out.print("Enter your first name: ");
        String fname = scanner.next();
        System.out.print("Enter your last name: ");
        String lname = scanner.next();

        // Trimming both strings
        String fname_trim = fname.substring(0, 2);
        String lname_trim = lname.substring(0, 4);

        // Generating a Random number from 10 to 99
        Random random = new Random();
        int rand_int = random.nextInt(90) + 10;

        // Combining and printing
        System.out.println(lname_trim + fname_trim + rand_int);
    }
}
