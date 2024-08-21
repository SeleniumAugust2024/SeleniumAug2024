package day6;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
		//obj1.area(23);
		ConstructorDemo obj1 = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo();
		ConstructorDemo obj3 = new ConstructorDemo(4,3);
		
	}
	
	//Pointer
	//1. classname and constructor(method) name should be same
	//2. 2 Types of Constructor - Default and Parameterized
	//3. Constructor are invoked during object creation

	ConstructorDemo() //Default constructor
	{
		System.out.println("Default Constructor Got Invoked");
	}
	ConstructorDemo(int m,int n) //Parameter constructor
	{
		System.out.println("Parameterised Constructor Got Invoked");
	}
	
	//Realtime Usage in Framework 
	//1. Browser initialization
	//2. Clearing cookies, session, localstorage
	//3. Initialization 
}
