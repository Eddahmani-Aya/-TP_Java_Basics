package StructureRepetetive;

import java.util.Scanner;

public class Tp3Puicance2Nbr {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter la base: ");
		int n1=input.nextInt();
		System.out.print("Enter la puissance: ");
		int n2=input.nextInt();
		int Resultat=1;
		for (int i = 1; i <= n2; i++) {
			Resultat*=n1;
		}
		System.out.println(n1+" a la puissance "+n2+" est : "+Resultat);
		input.close();
	}

}
