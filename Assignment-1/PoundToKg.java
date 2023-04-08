
/**
 * "PoundToKg" is a Java application that converts a weight in pounds
 * to its equivalent in kilograms. The conversion factor used is
 * 0.45359237 kilograms per pound.
 *
 * name [Basu Lamichhane]
 * class/semester : 
 * date : 2023-02-08
 * files : PoundTokg.java
 * email :
 */

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        // pound to kg conversion factor
        final double lb2kg = 0.45359237;

        // for input
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the weight in pounds : ");
        final double lb = scr.nextDouble();

        // for conversion
        final double kg = lb * lb2kg;

        // for result display
        System.out.println("Weight in Kilogram is " + kg + " kg.");
    }
}