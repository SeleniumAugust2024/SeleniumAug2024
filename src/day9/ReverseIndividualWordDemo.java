package day9;

public class ReverseIndividualWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input - I am new to Java
		// Output - 
		String rev = ReverseIndividualWordDemo.revWord("I am new to Java");
		
		System.out.println("Result - "+ rev);
	}
	
	public static String revWord(String str)
	{
		String wrd[] = str.split("\\s");
		
		String reverseWord = "";
		
		for (String m:wrd)
		{
			StringBuilder ssb = new StringBuilder(m);
			ssb.reverse();
			reverseWord += ssb.toString()+" ";
			}
		return reverseWord;
		
	}

}
