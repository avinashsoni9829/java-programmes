package AbstractList;
import java.util.*;
public class abstractlistexample {

	public static void main(String [] args) {
		  AbstractList<String> names = new ArrayList<String>();
		  // adding data
		  names.add("Avinash");
		  names.add("abhishek");
		  names.add("euue32");
		  
		  System.out.println("List of names = " + names);
		  
		  
		  // removing data
		  
		  names.remove(0);
		  System.out.println("[updated : deletion ]List of names = " + names);
          
		  // printing the hashcode 
		  
		  System.out.println("List hashcode " + names.hashCode());
		  
		  
		  // to Array  
		  
		  System.out.println("conversion to array = " + names.toArray());
		  
		  // to string 
		  System.out.println("conversion to string = " + names.toString());
		  
		  // isEmpty()
		  
		  if(names.isEmpty()) {
			  System.out.println("Empty array!");
		  }
		  else
		  {
			  System.out.println(" not empty ");
		  }
		  
		  // size()
		  
		  System.out.println("size =  "  + names.size());
		  
	}
}
