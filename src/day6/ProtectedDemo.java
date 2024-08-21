package day6;

import day7.AccessModifierDemo;

public class ProtectedDemo extends AccessModifierDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifierDemo obj1 = new AccessModifierDemo();
		
		ProtectedDemo obj2 = new ProtectedDemo();
		
		System.out.println(obj2.m);	
		
		System.out.println(obj1.n);		

		
	}

}
