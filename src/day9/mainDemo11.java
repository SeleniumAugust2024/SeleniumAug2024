package day9;

public interface mainDemo11 {

	// Interface can contain - public, static and final values
	// Interface - We will able to achieve Multiple Inheritance
	// Interface - Can contain only default - Method without Body
	// Interface - Java 8 - Interface can also default method - Method with Body

	int dummy = 3;

	void Demo1();

	default void Demo2() {
		System.out.println("I am in Interface Default Method");
	}

	static void Demo3() {
		System.out.println("I am in Interface Static Method");
	}

}

class child1 implements mainDemo11
{

	@Override
	public void Demo1() {
		// TODO Auto-generated method stub
		System.out.println("Child1");
		
	}
	
}

class child2 implements mainDemo11
{

	@Override
	public void Demo1() {
		// TODO Auto-generated method stub
		System.out.println("Child2");

	}
	
}


