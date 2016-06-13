/*
Determine if file or directory exists
using exists method of Java File class.
*/

import java.io.*;

public class FileExist {

      public static void main(String[] args) {
         
          //create file object
          File file = new File("C://FileIO/Existtestdemo.txt");
        
          //returns true if a particular file or directory exists at specified path in the filesystem
          //false otherwise.
           boolean exists = file.exists();
       
           // Directory would be specified as part of getpath() method
           System.out.println("Does file " + file.getPath() + " exist ?: " + exists); 
         
           return exists
      }
}
     
   
