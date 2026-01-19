package Instruction_base;
import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//type of next
		System.out.print("enter your name: ");
		String name=input.nextLine();
		
		
		System.out.print("enter your age: ");
		int age =input.nextInt();
		
		System.out.print("What your gpa: ");
		double gpe =input.nextDouble();

		System.out.println("are you a student (true/false): ");
		boolean isStudent=input.nextBoolean();
		
		
		
		
		//affichage
		System.out.println("Hello "+name);
		System.out.println("-------------------------------");

		System.out.println("You are "+age);
		System.out.println("-------------------------------");

		System.out.println("Your gpe is "+gpe);
		System.out.println("-------------------------------");

		if (isStudent) {

			System.out.println("you are a Student ");
		}
		else {

			System.out.println("you aren't a Student  ");
		}
		//Exercice:calculate area of a rectangle
		double width=0;
		double height=0;
		double area=0;
		
		System.out.print("Enter a width of a rectangle : ");
		width =input.nextDouble();
		
		System.out.print("Enter a height of a rectangle : ");
		height =input.nextDouble();
		
		area=width*height;
		System.out.println("the area of a rectangle is: "+area);
		/*System.out.print("enter your age: ");
		int age =input.nextInt();
		input.nextLine();//hna drna hadi bach mytrach lina mochikl bach itscana lina name 
		System.out.print("enter your name: ");
		String name=input.nextLine();
		
		System.out.println("You are "+age);
		System.out.println("-------------------------------");
		
		System.out.println("Hello "+name);
		System.out.println("-------------------------------");*/
		

		input.close();
	}

}
