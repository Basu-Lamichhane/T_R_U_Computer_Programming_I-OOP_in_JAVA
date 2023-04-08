
/**
 * "VowelCounter" is Java application that reads a string from the user,
 * counts the number of vowels (both lowercase and uppercase), and counts the
 * number of non-vowel characters using a switch-case structure.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-28
 * files : VowelCounter.java
 * email :
 *
 */
import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");// User input for a String
        String input = scanner.nextLine();
        input = input.toLowerCase(); // Convert to lowercase to handle uppercase vowels

        // initializing vowel Counters
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        // counter for consonant letters
        int countNonVowel = 0;

        // Count logic using Switch case structure
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
                default:
                    countNonVowel++;
                    break;
            }
        }

        // Printing Ouputs
        System.out.println("Number of a's : " + countA);
        System.out.println("Number of e's : " + countE);
        System.out.println("Number of i's : " + countI);
        System.out.println("Number of o's : " + countO);
        System.out.println("Number of u's : " + countU);
        System.out.println("Number of non-vowels : " + countNonVowel);
    }
}
