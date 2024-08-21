package day4;

public class PatternNestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 10;
		
		//outer loop
		for(int i = 1; i<=rows; ++i) // outer for loop is executing for 10 Time
		{
			//inner loop
			for(int j=1;j<=i;++j) //inner loop is getting based on value of i
			{
				System.out.print(j + " ");
			}
			
			System.out.println("");
		}
		
		//while
		// --- for statement
		//for
		// --- while statement
		
	}
	
	// January
	// Date...31 -- Day 1
	// 				Day 2
	//				Day 3
	//              Day 4
	
	// Feb
	// Date...29
	// March
	// Date...31
	
	//Real time Framework - Reading the excel -- sheetname, row, cell
	
	//1
	//1 2
	//1 2 3
	//1 2 3 4

}
