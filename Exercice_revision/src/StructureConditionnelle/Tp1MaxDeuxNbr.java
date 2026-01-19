package StructureConditionnelle;

import java.util.Scanner;

public class Tp1MaxDeuxNbr {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number1: ");
		double n1=input.nextInt();
		System.out.print("Enter a Number2: ");
		double n2=input.nextInt();
		double max=0;
		if (n1>n2) {
			max=n1;
		}
		else {
			max=n2;
		}
		System.out.println("le max de deux nombres est "+max);
		input.close();

	}

}
