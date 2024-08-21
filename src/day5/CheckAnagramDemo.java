package day5;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 Strings are anagram are not - listen and silent
		
		// length should be same
		// character in both the string should be same
		
		//String m1 = "Listen";
		
		//String m2 = "Silent1";
		
		String m1, m2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter 2 String");
		
		m1 = s.nextLine();
		m2 = s.nextLine();
		
		m1 = m1.toLowerCase();
		
		m2 = m2.toLowerCase();
		
		if(m1.length()==m2.length())
		{
			char[] charm1 = m1.toCharArray(); //charm1 = ['l'] ['i']
			char[] charm2 = m2.toCharArray();
			// Array 
			// list of similar datatype
			// Array of fixed length
			// Syntax char []variablename
			// char[] variable
			// char variable[]
			
			Arrays.sort(charm1);
			Arrays.sort(charm2);
			
			if(Arrays.equals(charm1, charm2))
			{
				System.out.println("Both the string are Anagram");	
			}
			else
			{
				System.out.println("Both the string are not Anagram");
			}
		}
		else
		{
			System.out.println("Both the string are not Anagram");
		}
		
	}

}
