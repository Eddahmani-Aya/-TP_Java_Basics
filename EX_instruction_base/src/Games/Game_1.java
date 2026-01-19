package Games;

import java.util.Scanner;

public class Game_1 {
	public static void main(String[] args) {
		//Mad libs game
		Scanner input=new Scanner(System.in);
		String adjct1;
		String noun1;
		String adjct2;
		String verb1;
		String adjct3;
		
		System.out.print("Enter an adjective (description): ");
		adjct1=input.nextLine();
		System.out.print("Enter a noun (animal or person): ");
		noun1=input.nextLine();
		System.out.print("Enter an adjective (description): ");
		adjct2=input.nextLine();
		System.out.print("Enter a verb end with -ing (action): ");
		verb1=input.nextLine();
		System.out.print("Enter an adjective (description): ");
		adjct3=input.nextLine();
		
		System.out.println("Today I went to a " +adjct1+ " zoo.");
		System.out.println("In an exhibit, I saw a " + noun1 + ".");
		System.out.println(noun1 + " was " + adjct2 + " and " +verb1+"!");
		System.out.println("I was " + adjct3 + "!");
		
		input.close();
	}

}
