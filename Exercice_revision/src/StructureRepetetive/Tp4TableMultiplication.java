package StructureRepetetive;

import java.util.Scanner;

public class Tp4TableMultiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a nunber: ");
		int n=input.nextInt();
		int sum;
		for (int i = 0; i <=10; i++) {
			sum=n*i;
			System.out.println(i+" x "+n+" = "+sum);
		}
		input.close();
		
	}

}
