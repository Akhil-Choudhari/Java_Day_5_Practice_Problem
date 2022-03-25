package Day5Program;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the Second number");
		b = sc.nextInt();
		System.out.println("Enter the Third number");
		c = sc.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println("The largest number is: " +a);
		}
		else if (b>= a && b>=c) {
			System.out.println("The largest number is: " +b);
		}
		else
			System.out.println("The largest number is : " +c);

	}

}
