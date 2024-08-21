package day6;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent parentobj = new parent();
		parent parentobj1 = new child();
		child childobj = new child();
		//parent childobj1 
		parentobj.parentDemo();
		parentobj1.parentDemo();
		childobj.parentDemo();
		
	}
	
	// Parent class-- method -- parentDemo()
	// child class-- method -- parentDemo() + childDemo() + own Variable
	// RUNTIME POLYMORPHISM

}

class parent
{
	void parentDemo()
	{
		System.out.println("Parent");
	}
	
}

class child extends parent //extends is mandatory
{
	void parentDemo()
	{
		System.out.println("Child");
	}
	
}


// BASECLASS - Browser, Env, Utility
// Testcase1 extend baseclass
// Testcase2 extend baseclass
// 

