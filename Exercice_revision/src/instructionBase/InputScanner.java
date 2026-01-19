package instructionBase;

import java.util.*;

public class InputScanner {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String nom=input.nextLine();
		System.out.println("Hello "+nom);
		input.close();
	}
}
