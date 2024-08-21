package day6;

public class MethodDemo {

	final float pi = 3.14f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object - Creation 
		MethodDemo obj1 = new MethodDemo();
		obj1.addTwoNumbers(); //function call... method call
		obj1.areaOfSquare();
		float res = obj1.areaOfCircle();
		System.out.println("Area of Circle -"+ res);
		
	}

	void addTwoNumbers() // Does not require return statement
	{
		int m = 10, n = 12;
		int sum = 0;
		sum = m + n;
		System.out.println("Addition - " + sum);
	}

	void areaOfSquare() {
		int side = 10;
		int area;
		area = side * side;
		System.out.println("Area -" + area);
		//return area;

	}

	float areaOfCircle() { //Any other return type - return statement is mandatory
		float radius = 2;
		float area;
		area = pi * 2 * 2;
		return area;
	}
}
