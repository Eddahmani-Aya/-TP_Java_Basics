package TD2_CPoint3D;

public class Segment3D {
	private CPoint3D origine;
	private CPoint3D extremite;
	public  Segment3D(float x1,float y1,float z1,float x2,float y2,float z2) {
		this.origine=new CPoint3D(x1, y1, z1);;
		this.extremite=new CPoint3D(x2, y2, z2);
	}
	public  Segment3D(CPoint3D origine,CPoint3D extremite) {
		this.origine=new CPoint3D(origine);
		this.extremite=new CPoint3D(extremite);
	}
	public double longueur() {
		return origine.distance(extremite);
	}
	
	public CPoint3D getOrigine() {
		return origine;
	}
	public CPoint3D getExtremite() {
		return extremite;
	}
	public void setSegment(CPoint3D origine,CPoint3D extremite) {
		this.origine=new CPoint3D(origine);
		this.extremite = new CPoint3D(extremite);		
	}
	public void afficher() {
		System.out.println("Origine : (" + origine.getX() + ", " + origine.getY() + ", " + origine.getZ() + ")");
	    System.out.println("Extrémité : (" + extremite.getX() + ", " + extremite.getY() + ", " + extremite.getZ() + ")");
		System.out.println("longueur du segment es :"+longueur());
		
	}
	
}
