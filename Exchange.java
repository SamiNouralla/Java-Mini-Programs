/*
Currency Exchange application that is designed for rupee to CDN exchange.
User inputs whether they are converting Canadian to Indian, or vice versa.
Once in appropiate exchange method, user enters the exchange rate, and the dollar amount, where the program returns the calculation
Error-handling is available for invalid inputs such as strings for integers
*/

import java.util.*;
import java.text.DecimalFormat;


public class Exchange {
   
    /**
     * Converts the value of Rupee into Canadian 
     * @return double Returns the value of rupee as a converted CDN
     */
    public static double Canadian() {
       
        Scanner scanner = new Scanner(System.in);
        boolean j = false;
        double converteddollars;
        do {
            try {
                System.out.println("What is the exchange rate Candian to Indian?");
                double exchanger = scanner.nextDouble(); // Converts user input into data type double
                System.out.println("How many Dollars are you converting?");
                double numberdollars = scanner.nextDouble();
                converteddollars = numberdollars / exchanger;
                j = true;
                return converteddollars; // returns the converted value as rupees
            } catch (Exception e) {
                System.out.println("Enter valid input please");
                scanner.next();
                return -1;
            }
        } while (j == false);
    }

    /**
     * Converts the value of CDN into Rupee 
     * @return double the converted value
     */
    public static double Indian() {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the exchange rate Canadian to Indian?");
        double exchanger = scanner.nextDouble();
        System.out.println("How many Rupees are you converting?");
        double numberdollars = scanner.nextDouble();
        double converteddollars = numberdollars * exchanger; // Since Canadian Dollar is stronger, I multiplied rupees value by dollar value
        return converteddollars; // returns the converted value as rupees
    }
   
    public static void main(String[] args) {

        boolean j = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter 1 for Canadian Exchanger or 0 for Indian Exchanger");
                int response = scanner.nextInt();
                j = true; //Created for getting try-catch to work properly
                double exchangedValue;
                String canada = "Canadian Dollars";

                if (response == 1) {
                    // If-Statement, that makes Method Call to Candian Method, which makes exchange rate calculation to rupees
                    canada = "Indian Rupees";
                    exchangedValue = Canadian();
                } else
                    exchangedValue = Indian(); // Method call to take exchange rate user provides
                System.out.println("Your response is equal to " + exchangedValue + "  " + canada);
            } catch (Exception e) {
                System.out.println("Please enter valid number");
                scanner.next();
            }
        } while (j == false);
    }
}
