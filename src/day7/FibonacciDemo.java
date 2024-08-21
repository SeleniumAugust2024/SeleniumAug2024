package day7;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		
		//System.out.println("Result "+ fibonacci(9));
		
		for(int i = 0;i<n;i++)
		{
			System.out.print(fibonacci(i) + "  ");
		}
		// 0 1 1 2 3 5 8 13 21 34 55
	}
	public static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
