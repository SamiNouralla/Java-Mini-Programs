/*
A Stack with its elements in reverse order
*/

import java.util.*;
import java.util.Scanner;


class Stack {
    
    public int maxSize;
    public char[] stackArray;
    public int top;
    
    /**
     * Constructor for Stack
     * @param max the size limit for stack
     */
    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize]; // uses array to represent stack Lifo behavious
        top = -1;
    }
    
    /**
     * Push element onto stack
     * @param j element to push onto stack
     */
    public void push(char j) {
        stackArray[++top] = j; // element at index zero of array is the first to be added
    }
    
    /**
     * Pop element from stack
     * @return element popped from stack
     */
    public char pop() {
        return stackArray[top--]; 
    }
    
    /**
     * Look at the last element from the stack
     * @return last element from stack
     */
    public char peek() {
        return stackArray[top];
    }
    
    /**
     * Check to see if stack is empty
     * @return boolean representing if the stack is empty
     */
    public boolean isEmpty() {
        return (top == -1);
    }
}

public class ReverseStack {

    public String input;
    public String output;
    
    /**
     * Initialize the input and output variables for the sentence to be used
     * @param input the original string
     */
    public ReverseStack(String input) {
        this.input = input;
    }
    
    /**
     * @return the original string in reverse order
     */
    public String doRev() {
        
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); ++i) {
            char ch = input.charAt(i); // Adding each character of word in the initialized Stack
            theStack.push(ch);
        }
        
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop(); //Because of LIFO behaviour, I must take the values on top of the stack, and re-add them into a new Stack object,
            output = output + ch;
        }
        
        return output; // new word is all the popped values of original word, and returns the output as part of method call
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter word");
        String input = in.nextLine();
        String output;
        
        ReverseStack theReverser = new ReverseStack(input); // Create new Reverse stack with input as member variable
        output = theReverser.doRev(); // Call reverse method of theReverser object
        System.out.println("Reversed: " + output);
        System.out.println("This word has " + theReverser.input.length() + " Characters");
    }
}

