package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
	    //System.out.println(it.next());
	    
	   // System.out.println(it.next());

	    System.out.println(it.hasNext());

	    
	    while(it.hasNext()) {
	    	  
	    	  String ele = it.next();
	    	  if(ele.equals("BMW"))
	    	  {
	    		  it.remove();
	    	  }
	    	  
	    	}
	    
	    System.out.println(cars);
	}

}
