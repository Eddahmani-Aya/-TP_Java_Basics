package Instruction_base;
import java.util.Scanner;

public class Substrings {
	public static void main(String[] args) {
		/**
		String email="Neeko123@gmail.com";
		//String username = email. substring(0,8);
		String username = email. substring(0,email.indexOf("@"));
		String domaine=email.substring(email.indexOf("@"));
		System.out.println(username);
		System.out.println(domaine);
		*/
		
		//EXERCICE
		
		Scanner scanner = new Scanner(System.in);
		
		String email;
		String username;
		String domain;
		
		System.out.print("Enter your email: ");
		
		email = scanner.nextLine();
		if (email.contains("@")) {
			username = email. substring(0, email.indexOf("@"));
			domain = email.substring(email.indexOf("@") + 1);
			
			System.out.println(username);
			System.out .println(domain);
			
			
		}else {
			System.out.println("Emails must contain @");
		}
		
		scanner.close();
	}
}
