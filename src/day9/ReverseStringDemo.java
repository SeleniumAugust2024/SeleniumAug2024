package day9;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String m = "Hello World";
		
		StringBuilder sb = new StringBuilder(m);
		
		String mrev = sb.reverse().toString();
		
		System.out.println("Reverse of String - "+ mrev);
		
		String result = ReverseStringDemo.ReverseString("Hello World");
		
		System.out.println("Reverse  "+ result);
		
	}
	
	static String ReverseString(String m)
	{
		String rev="";
		
		for(int i = m.length()-1;i>=0;i--)
		{
			rev+= m.charAt(i);
		}
		
		return rev;
	}

}
