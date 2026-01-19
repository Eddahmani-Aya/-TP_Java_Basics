package instructionBase;

import java.util.Scanner;

public class Tp4CarreCube {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		System.out.println("le caree de "+n+" est: "+(n*n));
		System.out.println("le cube de "+n+" est: "+(n*n*n));
		input.close();
		
	}
}
