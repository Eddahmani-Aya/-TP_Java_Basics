package StructureConditionnelle;

import java.util.Scanner;

public class Tp2Parité {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=input.nextInt();
		if (n%2==0) {
			System.out.println("Ce nombre "+n+" est paire");
		}
		else {
			System.out.println("Ce nombre "+n+" est impaire");
		}
		input.close();

	}
}
