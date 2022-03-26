package Day5FunctionProgram;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		double t,v;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Temperature (in Fahrenheit)");
		t =sc.nextDouble();
		System.out.println("Enter the Wind Speed v (in miles per hour)");
		v =sc.nextDouble();
	        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature (in Fahrenheit) = " + t);
	        System.out.println("Wind speed (in miles per hour) = " + v);
	        System.out.println("Wind chill  = " + w);

	}

}
