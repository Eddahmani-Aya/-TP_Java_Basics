package TD2_CPoint3D;

public class CPoint3D {
	private float x,y,z;
	public CPoint3D() {
		
	}
	public CPoint3D(float x, float y,float z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public CPoint3D(CPoint3D P) {
		this.x=P.x;
		this.y=P.y;
		this.z=P.z;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public void setPoint(float x, float y,float z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void deplacer(float dx, float dy,float dz) {
		this.x+=dx;
		this.y+=dy;
		this.z+=dz;
	}
	public double distance() {
		return Math.sqrt(x * x + y * y + z * z);
	}
	 public double distance(CPoint3D p) {
	        double dx = x - p.x;
	        double dy = y - p.y;
	        double dz = z - p.z;
	        return Math.sqrt(dx * dx + dy * dy + dz * dz);
	  }
	 public boolean egal(CPoint3D p) {
		 return (this.x == p.x && this.y == p.y && this.z == p.z);
	 }
	 public void afficher() {
	        System.out.println("Point : (" + x + ", " + y + ", " + z + ")");
	        System.out.println("Distance à l'origine : " + distance());
	        System.out.println();
	    }
	
}
