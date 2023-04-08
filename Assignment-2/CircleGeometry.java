
/**
 * "CircleGeometry" is a Java application that reads the radius of a sphere then
 * calculates and displays the circumference, volume and surface area .
 *
 *
 * Here,the Math class is used to perform mathematical operations such as
 * calculating pi and raising the radius, while the "printf" method is
 * used to print the calculated values to four decimal places.
 *
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : Fraction2Decimal.java
 * email :
 *
 */

import java.util.Scanner;

public class CircleGeometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for radius
        System.out.print("Enter the radius : ");
        double r = scanner.nextDouble();

        // Calculation of circumference, volume and area
        double circumference = 2 * Math.PI * r;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double Area = 4 * Math.PI * Math.pow(r, 2);

        // Printing outputs
        System.out.printf("Circumference: %.4f\n", circumference);
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface area: %.4f\n", Area);
    }
}
