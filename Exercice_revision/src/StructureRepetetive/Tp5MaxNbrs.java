package StructureRepetetive;

import java.util.Scanner;

public class Tp5MaxNbrs {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter une serie des nombres: ");
		int   n1=input.nextInt();
		int  max=0;
		do {
			 n1=input.nextInt();
			 if(n1>max) {
				 max=n1;
			 }
		} while (n1!=0);
		System.out.println("Le maximum est "+max);
		input.close();
	}

}
