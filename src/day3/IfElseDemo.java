package day3;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10, n = 100;
		//if else
		
		//if (condition) ... {  }
		// else { }
		
		//Method 1 - If without else
		
		if(m>0)
		{
			System.out.println("M is Positive");
		}
		
		//Method 2 - If with else
		
		if(m>0)
		{
			System.out.println("M is Positive");
		}
			
		else
		{
			System.out.println("M is Negative");
		}
		
		//Method 3 - Nested if else 
		// 0-2 - Infant, 3-14 - Child, 15-40 - Adult, greater than 40 - senior citizen
		
		int age = 24;
		
		if(age>0&&age<=2)
		{
			System.out.println("Infant");

		}
		else if (age>=2&&age<=14)
		{
			System.out.println("Child");

		}
		else if (age>=14&&age<=40)
		{
			System.out.println("Adult");

		}
		else 
		{
			System.out.println("Senior Citizen");

		}
		
		
	}

}
