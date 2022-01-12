package vectorClass;
/*
 falls in legacy classes 
 compatible with collections 
 
 same as arraylist 
   * but vector is syncronized
   * contains some extra legacy methods 
   
  it implements Serizable Clonable Iterable RandomAccess Interface 
  stack is its subclass
  
  
  # if increment is defined -> grows accordingly 
    else
    capcity  gets doubled in each allocation cycle
    
    
    vector has three protected data memebers 
     * int capacityIncremenet
     * int elementCount
     * Object elementData[]
 */

import java.io.*;
import java.util.*;

public class vectorClassExample {
	
	public static void main(String [] args) {
	    int n = 5;
		Vector<Integer> a = new Vector<Integer>(n);
		
		for(int  i = 1;  i<=5 ; ++i) {
			  a.add(i);
		}
		
		System.out.println("Vector =  " + a);
		
		
		// remove is same , update is same 
		
		//System.out.println("[removing value  5] vector =  " + a);
		
	}

}
