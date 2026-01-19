package Instruction_base;


public class String_methods {

	public static void main(String[] args) {
		
		String name="Neeko aya";
		
		//int length=name.length();
		//char letter= name.charAt(0);
		//int index=name.indexOf("a");
		//int lastindex=name.lastIndexOf("a");
		//name=name.toUpperCase();
		//name=name.toLowerCase();
		//name=name.trim();
		//name=name.replace("o","a")
		//isEmpty()
		System.out.println(name.isEmpty());
		if (name.isEmpty()) {
			System.out.println("your name is empty");
		}
		else {
			System.out.println("Hello "+name);
		}
		
		//contains()
		if (name.contains(" ")) {
			System.out.println("your name contains a space");
		}
		else {
			System.out.println("your name dosen't contains a space\"");
		}
		
		//equals
		if (name.equals("password")) {
			System.out.println("Your name can't be password");
		}
		else {
			System.out.println("Hello "+name);
		}
		
		
		//equalsIgnoreCase
		if (name.equalsIgnoreCase("password")) {
			System.out.println("Your name can't be password");
		}
		else {
			System.out.println("Hello "+name);
		}
	}
}
