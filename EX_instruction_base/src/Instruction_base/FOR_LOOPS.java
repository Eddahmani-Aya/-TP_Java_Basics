package Instruction_base;
import java.util.Scanner;

public class FOR_LOOPS {
	public static void main(String[] args) {
		
		//Example 1
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		//Example 2
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter how many time uou man to loop: ");
		int max= input.nextInt();
		
		for(int i=0;i<max;i++)
		{
			System.out.println(i+1);
		}
		
		input.close();
	}
}
