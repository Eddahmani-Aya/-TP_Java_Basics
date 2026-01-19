package Instruction_base;

public class OVERLOADED_METHODS {
	public static void main(String[] args) {
		
		//Exemple 1
		System.out.println(add(1, 2));
		System.out.println(add(1, 2,3));
		
		//Exemple 2
		String pizza=bakepizza("flat bread ");
		System.out.println(pizza);
		
	}
	//Exemple 1
	static double add(double a,double b) {
		return a+b;
	}
	static double add(double a,double b, double c) {
		return a+b+c;
	}
	
	//Exemple 2
	static String bakepizza(String bread) {
		return bread + "pizza";
		
	}
	
}
