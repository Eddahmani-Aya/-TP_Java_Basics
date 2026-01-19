package StructureRepetetive;

import java.util.Scanner;

public class Tp6Factorielle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter une serie des nombres: ");
		int   n1=input.nextInt();
		int f=1;
		for (int i = 1; i <= n1; i++) {
			f*=i;
		}
		System.out.println("le factorielle de "+n1+" est : "+f);
		input.close();
	}

}
