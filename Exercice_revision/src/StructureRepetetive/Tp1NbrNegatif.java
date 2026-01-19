package StructureRepetetive;

import java.util.Scanner;

public class Tp1NbrNegatif {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1;
		do {
			System.out.print("Enter nombre negatif: ");
			 n1=input.nextInt();
		} while (n1>0);
		
		input.close();
	}
}
