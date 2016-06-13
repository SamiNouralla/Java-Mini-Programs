/*
 Enumeration is a way to traverse all the member variables for a collection of objects.
 The hasMoreElements() method is called, in which a boolean is returned if there are 
 anymore elements in this collection.
 
 While there are elements, the nextElement() method will return the next element.
*/

import java.util.Enumeration;
import java.util.Vector;


public class Enumerate {

    public static void main(String args[]) {
        Vector v = new Vector();
        v.add("Object 1");
        v.add("Object 2");
        v.add("Object 3");
        System.out.println("Objects contained in the vector:");
        System.out.println();

        Enumeration enumeration = v.elements(); // enumeration object initialized to hold all elements of vector object v
        while (enumeration.hasMoreElements()) {
            Object o = enumeration.nextElement();
            System.out.println(o);
        }
    }
}
