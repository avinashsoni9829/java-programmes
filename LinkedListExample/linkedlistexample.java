package LinkedListExample;
/*
  Internal Implementation : Doubly Linked List Data Structure 
  
 */

import java.io.*;
import java.util.*;

public class linkedlistexample {
  
	public static void main(String [] args) {
		  LinkedList<Integer>l = new LinkedList<Integer>();
		  
		  l.add(1);
		  l.add(2);
		  l.add(3);
		  l.add(4);
		  l.add(5);
		  
		  l.add(2,41);
		  
		  System.out.println("Linked List =  " + l);
		  
		  
		  l.removeFirst();
		  System.out.println(" Linked List = " + l);
		  
	}
	
}
