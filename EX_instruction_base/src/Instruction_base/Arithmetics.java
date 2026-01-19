package Instruction_base;

public class Arithmetics {
	public static void main(String[] args) {
		// Arithmetic operators
		//int x=10;
		//int y=2;
		//int  z;
		//z=x+y;
		//z=x-y;
		//z=x*y;
		//z=x/y;
		//z=x%y;
		//System.out.println(z);
		
		
		// Augmented Assignment Operators
		//int x=10;
		//int y=3;
		//x=x+y;
		//x+=y;
		//x-=y;
		//x*=y;
		//x/=y;
		//x%=y;
		//System.out.println(x);
		
		
		// Increment and Decrement Operators
		int x=1;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		// ORDER OF OPERATIONS [P-E-M-D-A-S]
		double result = 3 + 4 * (7 - 5) / 2.0;
		System.out.println(result);
	}
}
