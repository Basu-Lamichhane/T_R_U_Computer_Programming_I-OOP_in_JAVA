
/**
 * "TimeConvert" is a Java application that reads a value representing a number 
 * of seconds, then displays the equivalent amount of time as a combination of 
 * hours, minutes, and seconds. 
 *
 * name [Basu Lamichhane]
 * class/semester : 
 * date : 2023-02-08
 * files : TimeConvert.java
 * email :
 */
import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {

        // input from the user
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number of seconds : ");
        final int sec = scr.nextInt();

        // conversion
        final int hour = sec / 3600;// converting second to hour
        final int remtime = sec % 3600;// calculating the remaning time
        final int min = remtime / 60;// calculating minutes
        final int remsec = sec % 60;// calculating remaining seconds

        // printing results
        System.out.println(
                sec + " seconds is equal to " + hour + " hours, " + min + " minutes, and " + remsec + " seconds.");
    }
}
