package Day5Program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter a Year of four digit : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if 
		(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		   System.out.println("Entered year is a leap year");
		else 
		   System.out.println("Entered year is not a leap year");
		
	}	

}