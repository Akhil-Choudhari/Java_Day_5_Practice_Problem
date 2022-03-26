package Day5FunctionProgram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double dis1;
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("enter x1 point of line");
		x1=sc.nextInt();
		
		System.out.println("enter y1 point of line");
		y1=sc.nextInt();
		
		System.out.println("enter x2 point of line ");
		x2=sc.nextInt();
		
		System.out.println("enter y2 point of line");
		y2=sc.nextInt();  
		dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	    
		System.out.println("distance between,"+"("+x1+","+y1+"),"+"("+x2+","+y2+"),"+"Length of line(distance) : "+dis1);

	}

}
