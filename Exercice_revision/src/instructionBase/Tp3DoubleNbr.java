package instructionBase;

import java.util.Scanner;

public class Tp3DoubleNbr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=input.nextInt();
		System.out.println("le double de "+n+" est: "+(n*2));
		input.close();
		
	}

}

