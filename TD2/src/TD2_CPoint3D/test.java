package TD2_CPoint3D;

public class test {

	public static void main(String[] args) {

		CPoint3D P1= new CPoint3D(2, 5, 7);
		CPoint3D P2= new CPoint3D(5,9,16);
		P1.afficher();
		P2.afficher();
		double d= P1.distance(P2);
		System.out.println("La distance entre p1 et p2 est : " + d);
		System.out.println("Les deux points sont-ils égaux ? " + P1.egal(P2));
	}

}
