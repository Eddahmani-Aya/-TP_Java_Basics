package StructureConditionnelle;

import java.util.Scanner;

public class SwitchConditions {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter nombre 1: ");
		int n1=input.nextInt();
		System.out.print("Enter nombre 2: ");
		int n2=input.nextInt();
		System.out.println("Choisis l'opération");
			System.out.println("1 pour addition");
			System.out.println("2 pour Sustraction");
			System.out.println("3 pour Multiplication");
			System.out.println("4 pour Division");
		int op=input.nextInt();
		int resultat=0;
		switch (op) {
		case 1: resultat=n1+n2;
			break;
		case 2: resultat=n1-n2;
		break;
		case 3: resultat=n1*n2;
		break;
		case 4: resultat=n1/n2;
		break;
		
		default:System.out.println("operation inccorect");
			break;
		}
		System.out.println("le resultat est: "+resultat);
		input.close();
	}
}
