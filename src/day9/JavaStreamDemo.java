package day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> num = Arrays.asList(1,23,42,22,2,45);
		
		List<Integer> numEven = num.stream()
				.filter(n -> n%2==0)
				.collect(Collectors.toList());
		
		System.out.println("Even Number - "+ numEven);
		
		
		List<String> maple = Arrays.asList("Jan","Feb","March","April");
		
		List<String> sortedMaple = maple.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted Maple - "+ sortedMaple);
	
		List<String> mapleSearch = Arrays.asList("Java","Jav", "API", "ROR", "Javaaaa");
		
		//Count the elements which are starting with Ja
		
		long count = mapleSearch.stream().filter(m->m.startsWith("Ja")).count();
		
		System.out.println("The Words Starting with Ja - "+ count);
	}

}
