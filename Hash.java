
/*
Hashtables stores key/value pairs in a hash table. 
When using a Hashtable, an object is used as a key, and the value that is linked to that key. 
The key is hashed, with the index being the hash code, where the linked value is placed.
*/

import java.util.*;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;


public class Hash {

    public static void main(String args[]) {
        // Create the HashTable
        Hashtable table = new Hashtable();
        Enumeration values;
        String string;
        int amount;

        // Adding Key value pairs seperated by commas
        table.put("Mike", 8);
        table.put("David", 9.87);
        table.put("Sam", 7);
        table.put("Derek", 400);
        table.put("Yas", 5000);
        table.put("randomName", 7892);

        // Show all tables in hash table.
        //Enumeration is used to output the elements of the Hash Table Object with hasMoreElements and nextElements methods
        values = table.keys(); // Traverses Hash Table, allowing use of Enumeration methods to view key/value pairs
        while (values.hasMoreElements()) {
            string = (String) values.nextElement();
            System.out.println(string + ": " + table.get(string));
        }
        
        // Add 1000 to Mike's value
        amount = ((Integer) table.get("Mike")).intValue(); // Retrieve value of Key called Mike as an integer

        table.put("Mike", amount + 10000);
        table.put("Mike", "This is not an int");
        System.out.println("Mike has a new amount of: " + table.get("Mike"));
        System.out.println();

        // containsKey() method checks if a particular key in the table exists
        System.out.println("Does hashtable contains Sam as key: " + table.containsKey("Sam"));

        // containsValue() method checks if a particular key in the table exists
        System.out.println("Does hashtable contains 100 as value: " + table.containsValue("100"));
        System.out.println("Size of the table hashtable is: " + table.size() + " key/ value pairs");
    }
}

