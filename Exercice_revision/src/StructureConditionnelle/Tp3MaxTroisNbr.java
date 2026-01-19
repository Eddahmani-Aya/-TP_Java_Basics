package StructureConditionnelle;

import java.util.Scanner;

public class Tp3MaxTroisNbr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number1: ");
		double n1=input.nextInt();
		System.out.print("Enter a Number2: ");
		double n2=input.nextInt();
		System.out.print("Enter a Number3: ");
		double n3=input.nextInt();
		double max=0;
		if (n1>n2 && n1>n3) {
			max=n1;
		}else if (n2>n3) {
			max=n2;
		}
		else {
			max=n3;
		}
		System.out.println("le max de deux nombres est "+max);
		input.close();

	}

}
