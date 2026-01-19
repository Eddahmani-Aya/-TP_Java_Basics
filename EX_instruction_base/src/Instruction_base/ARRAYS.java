package Instruction_base;

import java.util.Scanner;

public class ARRAYS {
	public static void main(String[] args) {
		
		String[] fruits= {"apple","orange","banana","coconut"};
		
		//Learn ARRAYS in java
		System.out.println("Learn ARRAYS in java");
		//fruits[0]="pineapple";
		//int numOfFruits= fruits.length;
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] +" ");
		}
		
		
		for(String fruit : fruits ) {
			
			System.out.println(fruit);
		}
		
		//Enter USER INPUT into an ARRAY! 
		System.out.println("-------------------------------");
		System.out.println("Enter USER INPUT into an ARRAY! ");
		Scanner input = new Scanner(System.in);
		
		System.out.print("    What # of food do you want?: ");
		int size =input.nextInt();
		input.nextLine();
		
		String[] foods = new String[size];
		
		for (int i = 0; i < foods.length; i++) {
			System.out.printf("    Enter a food %d: ",i+1);
			foods[i]=input.nextLine();
		}
		
		
		for(String food : foods ) {
			
			System.out.println(food);
		}
		
		
		//How to SEARCH an ARRAY easy! 
		System.out.println("-------------------------------");
		System.out.println("How to SEARCH an ARRAY easy!");
		
		System.out.print("    Enter how many number u want : ");
		int Nbr =input.nextInt();
		input.nextLine();
		
		int[] Numbers = new int [Nbr];
		boolean isfound =false;
		
		for (int i = 0; i < Numbers.length; i++) {
			System.out.printf("    Enter a N[%d]: ",i+1);
			Numbers[i]=input.nextInt();
		}
		
		System.out.print("    Enter a number u want to target  : ");
		int target =input.nextInt();
		     
		for (int i = 0; i < Numbers.length; i++) {
			if (target == Numbers[i]) {
				System.out.printf("    Element found at index: %d\n", i+1);
				isfound=true;
				break;
			}
		}
		if (!isfound) {
			System.out.printf("    Element not found in the array    \n");
		}
		
		input.close();
	}
	
}
