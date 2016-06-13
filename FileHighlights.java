/*
The File.createNewFile() method is used to create a file in Java, and return a boolean value : 
true if the file is created successful; false if the file is already exists or the operation failed.
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileHighlights {
    
    public static void main(String[] args) {
        try {
            File file = new File("c:\\newfile.txt"); // Create a random file

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Checks if file exists
        File f = new File("c:\\sami.txt");
        if (f.exists()) {
            System.out.println("File existed");
        } else {
            System.out.println("File not found!");
        }

        // Reading a file using Buffered Reader
        BufferedReader br = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\test.txt")); // FileReader class to read file line by line
            while ((sCurrentLine = br.readLine()) != null) { // while file not empty output to console
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) { // catch expection such as file not existing
            e.printStackTrace();
        } finally { // This code runs regardless if exception is thrown or not
            try {
                if (br != null) br.close(); // Close the BufferedReader so program does not go out of scope
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // Writing content into and creating a new file
        try {
            String content = "Write this into file";
            File file = new File("/users/sami/filename.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file); //.getAbsoluteFile()); // Gets file path
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace(); // Referenced Oracle Docs in case error with file or directory occur 
        }

    }
}
