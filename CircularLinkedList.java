/*
A circular Linked list is similar to a regular linked list that has a head node, with pointers to the next node. However,
in a circular linked list, you can access and insert a previous node to the current as you traverse the list forwards 
and backwards. This way, deleting previous nodes in the linked list chain is much easier, as you have instant access to both the next node and previous node of a linked list, 
depending on which is the current Node.
*/

import java.lang.*;
import java.util.*;
import java.io.*;


public class CircularLinkedList{
	
    // Store data of current node and hold reference to previous and next node
    int data;
    CircularLinkedList next;
    CircularLinkedList prev;

    /**
    * Constructor for CircularLinkedList
    */
   public CircularLinkedList(){
   	
    	data = 0;
    	next = null;
    	prev = null;
   }
   
    /** 
     * Constructor for CircularLinkedList with int value
     * @params value an int data for node
     */
   public CircularLinkedList(int value){
   	
    	data = value;
    	next = null;
    	prev = null;
   }
   
   /**
    * Inserts a new Node from current Node
    * @param value an int data for node
    * @return the newly inserted node
    */
   public CircularLinkedList InsertNext(int value) {

      CircularLinkedList node = new CircularLinkedList(value);
      if(this.next == null){ 
      	    // If current node is tail node or last node in the list
            node.prev = this;
            node.next = null;
            this.next = node;
      } else {
            // Insert anywhere in the list
            CircularLinkedList temp = this.next;
            node.prev = this;
            node.next = temp;
            this.next = node;
            temp.prev = node;
      }
      return node;
   }
   
   /**
    * Inserts a new node from current node for the .prev reference
    * @param value an int data for the node
    * @return the newly inserted node
    */
   public CircularLinkedList InsertPrev(int value){

      CircularLinkedList node = new CircularLinkedList(value);
      if(this.prev == null){ 
            // If current node is already the head or root node
            node.prev = null;
            node.next = this;
            this.prev = node;
      } else {
      	    // Create temp node, and have current.previous = temp
            CircularLinkedList temp = this.prev; 
            node.prev = temp;
            node.next = this;
            this.prev = node;
            temp.next = node;
      }
      return node;
   }
   
   /** 
    * This method deletes a node object by passing the pointer reference to the desired node number to be deleted
    * @param nodeNumber index of node to be deleted
    */
    public void deleteNode(int nodeNumber) {
    	CircularLinkedList node = this;
		int ithNode = 0;
		
		if(nodeNumber==1){
			// If index of node to be remove is 1 just more header pointer to next node
			node = this.next;
			this.next = null;
			this.prev = null;
		} else {
			// Other wise traverse through list until we get to the correct index
			// Update the prev and next references appropiately
			while(ithNode != nodeNumber){
				this.next = this;
				ithNode++;				
			}
			if(this.next == null){
				this.prev.next = null;
				this.prev = null;
			} else {
				this.prev.next = this.next;
				this.next.prev = this.prev;
			}	
		}		
	}
   
   /**
    * Iterate through linked list with every .next reference
    */
   public void TraverseFront() {
      TraverseFront(this);
   }
   
   /**
    * Ierate through linked list with every .next reference
    * @param node current linked list node
    */
   public void TraverseFront(CircularLinkedList node) {
      if(node == null)
       node = this;
       System.out.println("\n\nTraversing in Forward Direction");

      while(node != null) {
            System.out.println(node.data);
            node = node.next;
      }
   }

   /**
    * Ierate through linked list with every .prev reference
    */
   public void TraverseBack(){
      TraverseBack(this);
   }
   
   /**
    * Iterate through linked list with every .prev reference
    * @param node current linked list node
    */
   public void TraverseBack(CircularLinkedList node) {
      if(node == null)
            node = this;
      System.out.println("\n\nTraversing in Backward Direction");
      
      while(node != null) {
            System.out.println(node.data);
            node = node.prev;
      }
   }

   public static void main(String[] args) {
      CircularLinkedList node1 = new CircularLinkedList(1);
      CircularLinkedList node3 = node1.InsertNext(3);
      CircularLinkedList node2 = node3.InsertPrev(2); 
      CircularLinkedList node5 = node3.InsertNext(5);
      CircularLinkedList node4 = node5.InsertPrev(6);
      node1.TraverseFront();
      node5.TraverseBack();
   }
} 

