package Games;

import java.util.Scanner;

public class Math_class {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E); 
		
		double result;
		
		result = Math.pow(2,3);
		result = Math.abs(-5);
		result = Math.sqrt(9);
		result = Math.round(3.14);
		result = Math.ceil(3.14);
		result = Math.floor(3.99);
		result = Math.max(10,20);
		result = Math.min(10,20);
		
		System.out .println(result);
		
		
		//exercice: HYPOTENUSE C = Math. sqrt (a*a+ b*b)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of side A:");
		double a= input.nextDouble();
		
		System.out.print("Enter the length of side B:");
		double b= input.nextDouble();
		
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		
		
		System.out.println("The hypotenuse (side c) is: " + c);
		
		input.close();
	}

}
