package Day5Program;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		  int x, y, t;  
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the First Number");  
	       x = sc.nextInt(); 
	       System.out.println("Enter the Scond Number");
	       y = sc.nextInt();  
	       System.out.println("before swapping numbers are: "+x +"  "+ y);  
	       
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping Numbers are: "+x +"   " + y);  
	       System.out.println( );  

	}

}
