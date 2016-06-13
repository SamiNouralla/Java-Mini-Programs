/*
My Implementation of the Stack data Type.
Methods push, pop, and peek are included using generic Object data types as parameters
I used Oracle documentation as a clue that the methods must contain keyword Object since dealing with Wrapper Class ArrayList()
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Vector;


class Stack {
    
    // Stack will be stored in alist
    ArrayList<Object> alist;
    
    /**
     * Constructor for Stack
     * @param b list of values to put into stack
     */
    public Stack(ArrayList b) {
       alist = b;      
    }

    /**
     * Check is stack is empty
     * @return boolean representing if stack is empty
     */
    public boolean isEmpty() {
         return alist.isEmpty();
    }

    /**
     * Pop the last element from stack
     * @return the popped elemented
     */
    public Object pop() { 
        Object last;
        int size=alist.size();
        last = alist.remove((size- 1)); // Index count starts at 0, must remove size minus 1
        
        return(last);      
    }

    /**
     * Push new element onto stack
     * @param x new object to push onto stack
     */
    public void push(Object x) { //push object element
        alist.add(x);
    }

    /**
     * Return value of last element on stack
     * @return last element on stack
     */
    public Object Peek() {
        return(alist.get(alist.size() -1));
    }
    
    /**
     * Print out all the elements on the stack
     */
    public void showStack(){
        Iterator itr = alist.iterator(); // Iterator class using Oracle Docs
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + " ");
        }
    }
}

//MyStack demonstrates the methods of Stack
public class MyStack {
    
     public static void main(String[] args) {
         
         ArrayList arraylist =new ArrayList();
         Scanner in = new Scanner(System.in);
         System.out.println("enter the number of elements you which to add");
         int input=in.nextInt();
         System.out.println("enter elements one by one");
         Stack testStack=new Stack(arraylist);
         
         for(int i= 0; i<input;++i){
             Scanner y= new Scanner(System.in);
             String wes = y.nextLine();
             testStack.push(wes);
         }
         
         System.out.println("Current stack has elements ");
         testStack.showStack();
         System.out.println("After Pop() method called, the stack will have elements: ");
         testStack.pop();
         testStack.showStack();
         System.out.println("After Peek() method called, the stack will return the top element " +testStack.Peek());
    }
}
