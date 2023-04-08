
/**
 * "TwoPointsDistance" is a Java application that reads the (x,y) coordinates
 * for two points, which prompts for and read each of the four
 * values individually and computes the distance between the two points.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : Fraction2Decimal.java
 * email :
 *
 */

import java.util.Scanner;

public class TwoPointsDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs for first point
        System.out.println("********For the First Point*********");
        System.out.print("Enter the x coordinate : ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the y coordinate : ");
        int y1 = scanner.nextInt();

        // User inputs for second point
        System.out.println("********For the Second Point*********");
        System.out.print("Enter the x coordinate : ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the y coordinate : ");
        int y2 = scanner.nextInt();

        // Calculation of distance
        double distance = distanceCalculator(x1, y1, x2, y2);

        // Printing output
        System.out.println("The distance between " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")"
                + " is: " + distance);
    }

    static double distanceCalculator(int x1, int y1, int x2, int y2) {
        int X = x2 - x1;
        int Y = y2 - y1;
        double distance = Math.sqrt(X * X + Y * Y);
        return distance;
    }
}
