
/**
 * "BugDriver" is Java application that implement a class called Bug, which represents
 * a bug moving along a horizontal wire. The bug can only move for one unit of distance at
 * a time, in the direction it is facing.The bug can also turn to reverse direction
 *
 * An interactive test driver  named "BugDriver" is created that instantiates the Bug, then allows the user to manipulate
 * it with simple commands like Output (to see the position and direction), Move, Turn and Exit.
 * All process is done via the driver class only.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-28
 * files : BugDriver.java
 * email :
 *
 */

import java.util.Scanner;

class Bug {

    private int position;
    private boolean facingRight;

    // Creating a Constructor
    public Bug(int initialPosition) {
        position = initialPosition;
        facingRight = true;
    }

    // Method for turning the bug
    public void turn() {
        facingRight = !facingRight;
    }

    // Method for moving the bug
    public void move() {
        if (facingRight) {
            position++;
        } else {
            position--;
        }
    }

    // Method for getting the position of bug
    public int getPosition() {
        return position;
    }

    // Method for getting the direction of bug
    public String getDirection() {
        if (facingRight) {
            return "right";
        } else {
            return "left";
        }
    }

    public String toString() {
        return "Position: " + position + ", Direction: " + getDirection();
    }
}

// Test Driver for "Bug" class
public class BugDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial position of bug: ");
        int initialPosition = scanner.nextInt();// getting the initial position of bug
        Bug bug = new Bug(initialPosition);
        boolean done = false;
        while (!done) {
            System.out.println("Output=O");
            System.out.println("Move=M");
            System.out.println("Turn=T");
            System.out.println("End=E");
            System.out.print("Enter a command (O, M, T, or E): ");
            String command = scanner.next().toUpperCase();
            switch (command) {
                case "O":
                    System.out.println(bug.toString());
                    break;
                case "M":
                    bug.move();
                    break;
                case "T":
                    bug.turn();
                    break;
                case "E":
                    done = true;
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}
