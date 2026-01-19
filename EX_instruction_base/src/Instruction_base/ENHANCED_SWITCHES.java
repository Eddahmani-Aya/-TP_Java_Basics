package Instruction_base;

import java.util.Scanner;

public class ENHANCED_SWITCHES {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the day of the week: ");
		String day = input.nextLine();
		switch (day) {
		case "Monday":System.out.println("It is a weekday");
			break;
		case "Tuesday":System.out.println("It is a weekday");
			break;
		case "Wednesday":System.out.println("It is a weekday");
			break;
		case "Thursday":System.out.println("It is a weekday");
			break;
		case "Friday":System.out.println("It is a weekday");
			break;
		case "saturday":System.out.println("It is the weekend");
			break;
		case "Sunday":System.out.println("It is the weekdend");
			break;

		default: System.out.println(" is not day ");
			break;
		}
		input.close();
		
	}
}
