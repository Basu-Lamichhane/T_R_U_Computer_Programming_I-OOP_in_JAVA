
/**
 * This java program named "RandomArrayDriver" defines a class called RandomArray, which has an integer array of a
 * particular size. The integer array is initialized with random numbers from 0 through the array size by the
 * RandomArray class' constructor. The getMinimum(), getMaximum(), getAverage(), and toString() methods of the
 * RandomArray class returns the array's minimum, maximum, average, and string representation of values, respectively.
 *
 * The program also comes with a unique driver class called RandomArrayDriver that asks the user for the sample size,
 * creates a RandomArray object of that size, and displays the contents of the object along with the minimum, maximum,
 * and average array values.
 *
 * The program creates a RandomArray object of that size using randomly generated integers after the user specifies a
 * sample size. The generated array along with its minimum, maximum, and average values are then displayed by the program.
 *
 * To produce various arrays and results, this procedure can be repeated with various sample sizes.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : RandomArrayDriver.java
 * email :
 */

import java.util.Random;
import java.util.Scanner;

class RandomArray {
    private int[] arr;

    // Constructor which generates an array of random numbers ranging from 0 to the
    // size of the array
    public RandomArray(int size) {
        arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size + 1);// Generating a random number from 0 to the size of array
        }
    }

    // Method for getting minimum value from the array
    public int getMinimum() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method for getting maximum value from the array
    public int getMaximum() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method for getting average value from the array
    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    // Method for returning the array in [a,r,r,a,y] format by associating
    // StringBuilder class
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");// adding '[' in beginning
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");// adding commas after each elements in array
            }
        }
        sb.append("]");// adding ']' in last
        return sb.toString();
    }
}

// Test Driver for "RandomArray" class
public class RandomArrayDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sample size: ");
        int size = input.nextInt();// For user input of array size

        RandomArray randArr = new RandomArray(size);

        // Printing the outputs
        System.out.println("Array: " + randArr.toString());// Printing the array elements in [a,r,r,a,y] format
        System.out.println("Minimum: " + randArr.getMinimum());// Printing minimum value of the array
        System.out.println("Maximum: " + randArr.getMaximum());// Printing maximum value of the array
        System.out.println("Average: " + randArr.getAverage());// Printing average value of the array
    }
}
