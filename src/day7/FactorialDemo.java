package day7;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int result = factorialCal(number);
		System.out.println("Factorial of Number - "+ result);
	}
	
	public static int factorialCal(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorialCal(n-1);
	}
	
	//1. You dont need to create object
	//2. static can be refer directly using classname
	//3. It is creating only single copy
	
}
