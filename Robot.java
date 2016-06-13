/*
This program creates a new class called robot to represent an object with coordinate points.
The scenerio is that a robot is enclosed in a room, and can only move one unit, either north or south per turn.
The target for exiting the room is found on a random coordinate point, and if found in 10000 random moves, a goodbye message is printed
*/

import java.util.Random;


public class Robot {

    // x axis position, y axis position
    int xPos;
    int yPos;

    /**
     * Construtor for Robot class, initialize coordinate points
     */
    public Robot(int theX, int theY) {
        
        xPos = theX;
        yPos = theY;
    }

    /**
     * Increment y coordinate by 1 unit
     */
    void North() {

        ++yPos;
        System.out.println("Larry now at position " + xPos + " " + yPos);
    }
    
    /**
     * Decrement y coordinate by 1 unit
     */
    void South() {
        
        --yPos;
        System.out.println("Larry now at position " + xPos + " " + yPos);
    }

    /**
     * Increment x coordinate by 1 unit
     */
    void East() {
        
        ++xPos;
        System.out.println("Larry now at position " + xPos + " " + yPos);
    }

    /**
     * Decrement x coordinate by 1 unit
     */
    void West() {

        --xPos;
        System.out.println("Larry now at position " + xPos + " " + yPos);
    }

    // Enumeration of all possible directions
    enum direction {
        North, South, East, West
    }
    direction go;
    
    public static void main(String[] args) {

        boolean lost = true; //Changes to false when target found
        Random random = new Random(); // new random variable
        int x = 1000;
        int y = 1000;
        Robot Larry = new Robot(1, 1); //New robot object with initial distance

        int count = 0;
        System.out.println("Larry starting at position " + Larry.xPos + " " + Larry.yPos);
        System.out.println("Larry the robot has 10000 moves to find exit point 10 10");
        System.out.println("The room is 1000 by 1000 units long");

        for (int i = 1; i <= 10000; ++i) { //For 10000 moves, robot makes random distance changes in incremental units
            ++count;
            direction randomWeek = direction.values()[random.nextInt(direction.values().length)];

            if (Larry.xPos == 10 & Larry.yPos == 10) { // Target on x,y coordinate (10,10)
                System.out.println("it took " + count + " moves to find exit");
                System.out.println("Exit Found");
                lost = false;
                break;
            }

            if (randomWeek == Robot.direction.North) {
                if (Larry.yPos != y) {
                    Larry.North();
                } else {
                    if (Larry.yPos == y) {
                        continue; // start at beginning of loop over again
                    }
                }
            }

            if (randomWeek == Robot.direction.South) {
                if (Larry.yPos != 0) {
                    Larry.South();
                } else {
                    continue; // start at beginning of loop over again
                }
            }

            if (randomWeek == Robot.direction.West) {
                if (Larry.xPos != 0) {
                    Larry.West();
                } else {
                    continue; // start at beginning of loop over again
                }
            }

            if (randomWeek == Robot.direction.East) {

                if (Larry.xPos != 1000) {
                    Larry.East();
                } else {
                    continue; // start at beginning of loop over again
                }
            }
        }
        
        System.out.println(count);
        if (lost == true) {
            System.out.println("could not find exit at point 10 10 within 10000 moves");
        }
    }
}
