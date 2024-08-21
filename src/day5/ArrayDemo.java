package day5;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		char[] charSym = {'A','A'};
	
		for(int i = 0; i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars1) {
		  System.out.println(i);
		}
		
		for (char i : charSym) {
			  System.out.println(i);
			}
	}
	

}
