package day8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		
		cars.add("Mercedes");
		cars.add("Toyota");
		
		System.out.println(cars);
		
		cars.remove(0);
		
		System.out.println(cars);

		cars.add("Maruti");
		
		cars.add("Tata");
		
		System.out.println(cars.size());
		
		System.out.println(cars.isEmpty());
		
		System.out.println(cars.contains("Tata"));
		
	    Collections.sort(cars);  // Sort cars

		System.out.println(cars);

		ArrayList<Integer> carsArray = new ArrayList<Integer>();
		
		carsArray.add(12);
		carsArray.add(15);
		carsArray.add(17);
		carsArray.add(18);
	
		System.out.println(carsArray);

	    Collections.sort(carsArray);  // Sort cars

		System.out.println(carsArray);
		
		for (String i : cars) {
		      System.out.println(i);
		    }
		
		for (int i : carsArray) {
		      System.out.println(i);
		    }

		//Collections.
		
	    System.out.println("Reverse Order");

		Collections.sort(carsArray, Collections.reverseOrder()); // Sort myNumbers

	    for (int i : carsArray) {
	      System.out.println(i);
	    }
		
	}

}
