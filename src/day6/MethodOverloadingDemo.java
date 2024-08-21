package day6;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "Hello";
		MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
		obj1.area(5.5f);
		obj1.area(5);
		obj1.area(12, 5);
		//m.indexOf("Str");
	}
	//1. Two/Three/Four method should have same name
	//2. Both should have different number of parameter (count, data-type)
	//3. Method Overloading - COMPILE TIME POLYMORPHISM
	void area(int side)
	{
		int area = side*side;
		System.out.println("Area of Square ="+area);
	}
	
	void area(int len, int bre)
	{
		int area = len*bre;
		System.out.println("Area of Rectangle ="+area);
	}

	void area(double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle ="+area);
	}
	// Real Time Usage - Advantage
	// 
}

