package Instruction_base;

public class TERNARY_OPERATOR {
	public static void main(String[] args) {
		// ternary operator ? = Return 1 of 2 values if a condition is true
		// variable = (condition) ? ifTrue : ifFalse;
		int score = 70;
		if(score >= 60){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//Method ternary operator
		String passOrFail = (score >= 60) ? "PASS": "FAIL";
		System.out.println(passOrFail);
	}
}
