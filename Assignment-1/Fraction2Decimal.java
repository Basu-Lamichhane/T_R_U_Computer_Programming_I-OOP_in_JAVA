/**
 * "Fraction2Decimal" is a Java application that prompts 
 * for and reads the numerator and denominator of a fraction as integers, then 
 * displays the decimal equivalent of the fraction.
 * 
 * "I've also corrected the previous code's statement where i did the typecasting with
 * extra variables, by casting in-line without the need for extra variables in line 30"
 *
 * name [Basu Lamichhane]
 * class/semester : 
 * date : 2023-02-08
 * files : Fraction2Decimal.java
 * email :
 * 
 */
import java.util.Scanner;

public class Fraction2Decimal {
    public static void main(String[] args) {
        
        //input from the user
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Numerator part : ");
        int num = scr.nextInt();//For numerator
        
        System.out.print("Enter the Denominator part : ");
        int den = scr.nextInt();//For denominator
        
        //calculating decimal by explicitly typecasting from int to double
        final double result = (double)num/den;
        
        // printing results
        System.out.println("Decimal equivalent of "+num+"/"+den+" is : " + result);
    }
}
