package day5;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class PrintDaysAndYearsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cYear = YearMonth.now().getYear();
		
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("MMMM yyyy");
		
		for(int cMonth = 1; cMonth<=12; cMonth++)
			
		{
			YearMonth yearMonth = YearMonth.of(cYear, cMonth);
					
			System.out.println(yearMonth.format(formatt));
			
		}
		// Logic of Object Creation 
		// <ClassName> ref/obj name = new <ClassName>
		
		// For Date, Year, Month, time  -
	}

}
