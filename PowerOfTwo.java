package Day5Program;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		  
        int i = 0;               
        int powerOfTwo = 1;  
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number (Less the 31)");
       int n = in.nextInt();
       
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);  
            powerOfTwo = 2 * powerOfTwo;              
            i = i + 1;
        }

	}

}
