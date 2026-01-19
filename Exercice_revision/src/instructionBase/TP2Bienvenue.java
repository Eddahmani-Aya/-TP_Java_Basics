package instructionBase;

import java.util.Scanner;

public class TP2Bienvenue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String nom=input.nextLine();
		System.out.println("Bienvenue "+nom);
		input.close();

	}

}
