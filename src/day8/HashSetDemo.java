package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		    System.out.println(cars.size());
		    
		    // Method 2
		    Set<String> sortedData = new TreeSet<>(cars);
		    
		    System.out.println(sortedData);

//		    
//		   
//		    //Typecast - Method 1
//		    
//		    List<String> list = new ArrayList<>(cars);
//		    
//		    Collections.sort(list);
//		    
//		    System.out.println(list);
//		    
	}

}
