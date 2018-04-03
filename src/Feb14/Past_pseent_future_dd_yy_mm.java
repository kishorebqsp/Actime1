package Feb14;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Past_pseent_future_dd_yy_mm {

	public static void main(String[] args) {
		//to print the current date
	LocalDate d=LocalDate.now();
	System.out.println(d);
	
	//to print the current date
	LocalDate d1=LocalDate.now().plusDays(4);
	System.out.println(d1);
	
	//to print the current date
	LocalDate d2=LocalDate.now().plusDays(5);
	System.out.println(d2);
	
	//to print the current date
	LocalDate d3=LocalDate.now().plusMonths(3);
	System.out.println(d3);
	
	//to print the current date
	LocalDate d4=LocalDate.now().plusYears(5);
	System.out.println(d4);
	
	//to print the current date
	LocalDate d5=LocalDate.now().plusWeeks(4);
	System.out.println(d5);
	
	//to print the current date
	boolean d6 = LocalDate.now().isLeapYear();
	System.out.println(d6);

	//to print the current date	
	 int d7 = LocalDate.now().lengthOfMonth();
	System.out.println(d7);
	
	int d8 = LocalDate.now().lengthOfYear();
	System.out.println(d8);

 DayOfWeek d9 = LocalDate.now().getDayOfWeek();
	System.out.println(d9);
	
	 int d10 = LocalDate.now().getDayOfMonth();
	System.out.println(d10);

	int d11 = LocalDate.now().getDayOfYear();
	System.out.println(d11);
	}

}
