package StructureRepetetive;

import java.util.Scanner;

public class Tp2Somme100Nbr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter nombre : ");
		int n=input.nextInt();
		int somme=0;
		for (int i = 1; i <= n; i++) {
			somme+=i;
		}
		System.out.println("la somme des entiers de 1 à "+n+" est: "+somme);
		input.close();
	}
}
