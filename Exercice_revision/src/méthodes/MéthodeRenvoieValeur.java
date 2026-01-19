package méthodes;

import java.util.Scanner;

public class MéthodeRenvoieValeur {
	static double n1,n2,n3;
	static double Moyenne;
	
	public static void main(String[] args) {
		
		lire ();
		moyenne(n1,n2,n3);
		afficherMoyenne();
	}
	public static void lire () {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number1:");
		n1=input.nextInt();
		System.out.print("Enter a Number2:");
		n2=input.nextInt();
		System.out.print("Enter a Number3:");
		n3=input.nextInt();
		input.close();
	}
	
	public static double moyenne(double a,double b,double c) {
		Moyenne=(a+b+c)/3;
		return Moyenne;
	}
	public static void afficherMoyenne() {
		System.out.println("la moyenne des trois notes est "+Moyenne);
	}
}
