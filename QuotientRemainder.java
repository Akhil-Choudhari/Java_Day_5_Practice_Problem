package Day5Program;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of Dividend");
		int dividend = sc.nextInt();  
		System.out.println("Enter the value of Divisor");
		 int divisor = sc.nextInt();  
	 
	    int quotient = 0, remainder = 0;  
	     
	    quotient = dividend / divisor ;  
	  
	    remainder = dividend % divisor;  
	  
	    System.out.println("Quotient when " + dividend + " divided by " + divisor + " is: " + quotient);  
	    System.out.println("Remainder when " + dividend + " divided by " + divisor + " is: " + remainder);  

	}

}
