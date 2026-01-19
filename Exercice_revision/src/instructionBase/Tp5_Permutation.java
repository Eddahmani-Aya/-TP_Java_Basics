package instructionBase;

import java.util.Scanner;

public class Tp5_Permutation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number1: ");
		int n1=input.nextInt();
		System.out.print("Enter a Number2: ");
		int n2=input.nextInt();
		System.out.println("Number1: "+n1+" Number2: "+n2);
		int tmp=n1;
		n1=n2;
		n2=tmp;
		System.out.println("Number1: "+n1+" Number2: "+n2);
		input.close();
		
	}
}
