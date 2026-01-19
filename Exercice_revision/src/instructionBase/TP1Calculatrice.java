package instructionBase;

import java.util.Scanner;


public class TP1Calculatrice {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter nombre 1: ");
		int n1=input.nextInt();
		System.out.print("Enter nombre 2: ");
		int n2=input.nextInt();
		double resultat;
		resultat=n1+n2;
		System.out.println("la somme: "+resultat);
		resultat=n1-n2;
		System.out.println("la difference: "+resultat);
		resultat=n1*n2;
		System.out.println("le produit: "+resultat);
		resultat=(double)n1/n2;
		System.out.println("le Quotient: "+resultat);
		resultat=n1%n2;
		System.out.println("le reste de la division entière: "+resultat);
		input.close();
	}
}
