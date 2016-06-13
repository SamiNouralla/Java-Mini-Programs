/*
This program takes a sentence that is input by a user, and uses a vector to output sentence in reverse order
*/

import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;


public class VectorReverse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any Sentence");
        String word = in .nextLine();
        String[] w = word.split(" "); // split every word into array of strings
        Vector v = new Vector();

        //Add elements to Vector
        for (int i = 0; i < w.length; ++i) {
            v.add(w[i]);
        }
        System.out.println("Before Reverse Order, Vector Contains words : " + v);
        
        //This method reverse the order of elements of specified list.
        Collections.reverse(v); //Referenced Oracle manual http://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
        System.out.println("After Reverse Order, Vector Contains words : " + v);

    }
}
