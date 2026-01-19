package Games;

import java.util.Scanner;

public class SHOPPING_CART {

	public static void main(String[] args) {
		// SHOPPING CART PROGRAM
		Scanner input =new Scanner(System.in);
		
		String item;
		double price;
		int Quantity;
		char currency ='$';
		double total;
		
		System.out.print("What item would you like to buy?: ");
		item=input.nextLine();
		System.out.print("What is the price for each?: ");
		price=input.nextDouble();
		System.out.print("How many would you like?: ");
		Quantity=input.nextInt();
		
		total = price * Quantity;
		
		System.out.println("-------------------");
		System.out.println("\nYou have bought " + Quantity + " " + item +"/s");
		System.out.println("Your total is " + currency + total) ;
		
		input.close();
		
	}
}
