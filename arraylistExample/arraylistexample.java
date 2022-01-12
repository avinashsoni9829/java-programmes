package arraylistExample;
import java.io.*;
import java.util.*;

public class arraylistexample {

	public static void main(String [] args) {
		int  n = 5;  
		// creation 
		ArrayList<Integer>a = new ArrayList<Integer>(n);
		// adding elements
		for(int i  = 1 ; i  <= n ;++i) {
			  a.add(i);
		}
		
		
		System.out.println(" Arraylist = " + a);
		
		
		// removing elements
		
		a.remove(0);
		
		System.out.println("[upd : removed 0 index] ArrayList =  " + a);
		// dyanmic array 
		//  inherit : AbstractClass 
		// implements : ListInterface 
		// not used for primitive datatypes  int , char 
		// not sync
		
		
		// adding elements at any index
		
		a.add(1,23);
		System.out.println("[upd : new element at index 1 ]Array list =  " + a);
		
		// changing values
		
		a.set(1, 25);
		
		System.out.println("[upd : new value for element at index 1 ] ArrayList =   " + a);
		
		
		
		  
	}
	
}
