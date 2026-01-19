package Instruction_base;

import java.util.Scanner;

public class WHILE_LOOPS {
	public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			
			String name = "";
			String response = "";
			
			//Exemple 1
			while(name.isEmpty()) {
				System.out.print("Enter your name: ");
				name = scanner.nextLine();
			}
			System.out.println("Hello " + name);
			
			//Exemple 2
			while(!response. equals("Q")){
					System.out.println("You are playing a game");
					System.out.print("Press Q to quit: ");
				
					response = scanner. next().toUpperCase();
				}
			System.out.println("END !!" );
			
			scanner.close();
	}

}
