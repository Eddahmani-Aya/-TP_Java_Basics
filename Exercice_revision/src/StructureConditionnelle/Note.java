package StructureConditionnelle;

import java.util.Scanner;

public class Note {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ur Note:");
		int note=input.nextInt();
		if (note>=10) {
			System.out.println("vous avez la moyenne");
		}else {
			System.out.println("vous n'avez pas la moyenne");
		}
		input.close();
	}

}
