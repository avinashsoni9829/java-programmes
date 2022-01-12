package stackClass;
/*
    subclass of vector 
    
 */

import java.io.*;
import java.util.*;

public class stackClassExample {
 
	 public static void main(String [] args) {
		   	Stack st = new Stack();
		   	st.push(1);
		   	st.push("ffnf");
		   	System.out.println("stack =  " + st);
		   	
		   	
		   	// peek feature
		   	
		   	System.out.println("stack first = " + st.peek());
		   	
		   	// pop 
		   	
		   	System.out.println("removing top  " + st.pop());
		   	
		   	System.out.println("stack   = " + st);
		   	
		   	st.add(2);
		   	st.add(3);
		   	st.add(4);
		   	
		   	//search 
		   	
		   	System.out.println(" stack = " + st);
		   	System.out.println("search index of 2 " + st.search(2));
		   	System.out.println("search index of 9 " + st.search(9));
		   	
		   	
		   	// recommended to use Array Dequeu for stack based Operations 
		   	
		   	Deque<Integer> Stack = new ArrayDeque<Integer>();
		   	
		   	Stack.push(1);
		   	Stack.push(2);
            
		   	System.out.println("deque " + Stack);
		   	
	 }
	 
}
