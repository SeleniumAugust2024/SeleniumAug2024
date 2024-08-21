package day5;

public class multiDimensionalArrayDemo {
	static int m = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]); // Output 7
		
		System.out.println(myNumbers[1][1]); // Output 6
		
		System.out.println(myNumbers[1][0]); // Output 5
		
		System.out.println(myNumbers[0][3]); // Output 4
		
		//Nested For Loop
		for (int i = 0; i < myNumbers.length; ++i) {
			  for (int j = 0; j < myNumbers[i].length; ++j) {
			    System.out.println(myNumbers[i][j]);
			  }
			}
		
		System.out.println("Output Value "+ m);

		// Instance Variable - Inside the class outside the method, block, constructor
		// Local Variable - Inside Method, block, constructor
	
	}
	
	
	

}
