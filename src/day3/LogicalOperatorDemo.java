package day3;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ||   OR
		// &&   AND
		// !    NOT
		// OR - If any one of the statement is TRUE - Then output is TRUE
		// AND - If both the statement are TRUE - Then output is TRUE
		
		int m = 10, n = 100;
		
		System.out.println((m>0)||(n<100));
		
		System.out.println(!((m>0)&&(n<100)));

		
		
	}

}
