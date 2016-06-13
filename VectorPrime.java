/*
This program returns all prime numbers from an input list using vectors
*/
 
import java.util.Scanner;
import java.util.Vector;
import java.util.Random;
import java.util.*;


public class VectorPrime {
 
    /**
     * Check if number is a prime
     * @return boolean indicating if number is a prime
     */
    public static boolean notPrime(int number) {
     
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // New Random object
        int randomNumber = random.nextInt(10) + 1; // Random amount of numbers to input by user
        Vector v = new Vector();
        Vector n = new Vector();
        System.out.println("enter " + randomNumber + " random numbers one by one");

        for (int i = 0; i < randomNumber; ++i) {
            int x = 1;
            do {
                try {
                    int response = scanner.nextInt(); // User enters values as many times as random number
                    v.add(response); // all responses stored in v vector
                    if (notPrime(response)) { // boolean method call that returns true if a prime number
                        n.add(response); // add prime number to n vector
                    }
                    x = 2;
                } catch (Exception e) {
                    System.out.println("Please enter numbers only");
                    scanner.next();
                }
            } while (x == 1);
        }

        /*
        Traverse and display all elements of vector using enumeration
        */
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        Enumeration vEnuum = n.elements();
        System.out.println("\nElements in vector with the prime numbers:");
        while (vEnuum.hasMoreElements())
            System.out.print(vEnuum.nextElement() + " ");
        System.out.println();
    }
}
