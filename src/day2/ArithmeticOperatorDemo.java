package day2;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// + , - , *, /, % (Remainder)
		//Scanner Class
		Scanner s = new Scanner(System.in);
//		
//		int num1, num2;
//		
//		System.out.println("Enter 2 Numbers = ");
//		
//		num1 = s.nextInt();
//		
//		num2 = s.nextInt();
//		
////		System.out.println("Enter the Operation - '/n' 1 for Addition /n 2 for Subtraction /n 3 for Multiplication /n 4 for Division /n 5. '%' for Modulus");
////		
////		int num = s.nextInt();
//		
//		int additionResult = num1+num2;
//		int multiplicationResult = num1*num2;
//		int divisionResult = num1/num2;
//		int modulusResult = num1%num2;
		
//		System.out.println(additionResult);
//		
//		System.out.println(multiplicationResult);
//	
//		System.out.println(divisionResult);
//		
//		System.out.println(modulusResult);
		
		int m = 100;
		
		// 4 Operation - Increment and Decrement 
		// Post Increment and Pre Increment
		// Post Decrement and Pre Decrement
		
		System.out.println(m++); //POST Increment m will increment but the value is not assigned
		// 100
		
		System.out.println(m);
		// 101
		
		System.out.println(++m); //PRE Increment m will get increment and assigned
		// 102
		
		int n = 200;
		
		
		System.out.println(n--); //POST decrement n will decrement but the value is not assigned
		// 100
		
		System.out.println(n);
		// 101
		
		System.out.println(--n); //PRE decrement n will get decrement and assigned
		// 102
		
		
		
	}

}
