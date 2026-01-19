package méthodes;

import java.util.Scanner;

public class MéthodesParamètres {

	static int n1;
	static int n2;
	
	public static void main(String[] args) {
		lire();
		additionner(n1, n2);
		Soustraire(n1, n2);
	}
	
	public static void additionner(int a,int b) {
		int sum=a+b;
		System.out.println("la somme de "+a+" et "+b+" est :"+sum);
	}
	
	public static void lire () {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		n1=input.nextInt();
		System.out.print("Enter a Number:");
		n2=input.nextInt();

		input.close();
	}
	public static void Soustraire(int a,int b) {
		int sum=a-b;
		System.out.println("la Soustraction de "+a+" et "+b+" est :"+sum);
	}

}