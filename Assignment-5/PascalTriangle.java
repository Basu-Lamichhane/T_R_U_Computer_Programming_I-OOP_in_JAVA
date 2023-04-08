
/**
 * In this implementation, the "main" function takes the value of n from the user,
 * and then iterates through the first n lines of Pascal's Triangle. For each line,
 * the function calls the pascal function to compute the value of each element in the line,
 * and then prints the line.
 *
 * The pascal function takes the row number n and the column number k, and recursively
 * computes the value of the element at that position using the formula
 * C(n, k) = C(n-1, k-1) + C(n-1, k). If k is 0 or n, the function returns 1,
 * which is the value of the edge elements of the triangle.
 *
 * A nested loop is applied in order to print the space, " " in each line
 * and another nested loop is applied to actually print the element
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : PascalTriangle.java
 * email :
 */

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();// user input
        input.close();
        for (int i = 0; i < N; i++) {

            // nested loop to create leading spaces in each line
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");// prints leading space
            }

            // nested loop to print the elements in each line
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");// prints an element
            }
            System.out.println();
        }
    }

    // recursive function
    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return pascal(n - 1, k - 1) + pascal(n - 1, k);
        }
    }
}
