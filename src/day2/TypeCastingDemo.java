package day2;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//byte, short, int, long
		
		
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    float myFloat = myInt;
	    
	    
	    //short myShort = myInt;
	    
	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    System.out.println(myFloat);
	    
	    
	    
	    //Narrowing Casting
	    
	    
	    long mlong = 232313434;
	    
	    System.out.println(mlong);
	    int mint = (int) mlong;
	    
	    
	    float mfloat1 = mlong;
	    System.out.println(mfloat1);

	    System.out.println(mint);
	}
	

}
