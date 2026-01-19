package méthodes;

public class Surcharge {

	public static void main(String[] args) {
		int x = additionner(5, 10) ;
		System.out.println(x) ;
		double n = additionner(5, 10.3) ;
		System.out.println(n) ;
		int m = additionner(5, 10,1) ;
		System.out.println(m) ;
		
	}
	public static int additionner(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static double additionner(double a,double b) {
		double sum=a+b;
		return sum;
	}
	public static int additionner(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
}
