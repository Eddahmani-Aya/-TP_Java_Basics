package StructureRepetetive;

public class Tp7AffichageBoucle {

	public static void main(String[] args) {
		int comp=0;
		for (int i = 20; i >=0; i--) {
				System.out.print(" "+i+" ");
		
			comp++;
			if(comp==3) {
				System.out.println("");
				comp=0;
			}
			
		}

	}

}
