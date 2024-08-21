package day8;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Pakistan", "Karachi");

		
		capitalCities.put("Australia", "Perth");
		
		capitalCities.put("India", "Delhi");
		
		capitalCities.put("Nepal", "Kathmandu");
		
		capitalCities.put("USA", "Ame");
		

		System.out.println(capitalCities);
			
		//LIFO		
		
		System.out.println(capitalCities);
		
		
		HashMap<String, String> capitalCities1 = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities1.put("England", "London");
	    capitalCities1.put("Germany", "Berlin");
	    capitalCities1.put("Norway", "Oslo");
	    capitalCities1.put("USA", "Washington DC");
	    System.out.println(capitalCities1);
		
		
		
	}

}
