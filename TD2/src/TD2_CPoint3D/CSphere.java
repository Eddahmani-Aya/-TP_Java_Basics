package TD2_CPoint3D;

public class CSphere {
	private CPoint3D centre;
	private float rayon ;
	public  CSphere() {
		
	}
	public  CSphere(float x, float y,float z,float rayon) {
		this.centre=new CPoint3D(x, y, z);
		this.rayon=rayon;
	}
	public  CSphere(CPoint3D centre,float rayon) {
		this.centre=new CPoint3D(centre);
		this.rayon=rayon;
	}
	public float getRayon() {
		return rayon;
	}
	public CPoint3D getCentre() {
		return centre;
	}
	public void setCentre(CPoint3D centre,float rayon) {
		this.centre = centre;
		this.rayon=rayon;
	}
	public double surface() {
		return (4 * Math.PI * Math.pow(rayon, 2));
	}
	public double volume() {
		return ((4/3) * Math.PI * Math.pow(rayon, 3));
	}
	public void afficher() {
        System.out.println("Centre : (" + centre.getX() + ", " + centre.getY() + ", " + centre.getZ() + ")");
		System.out.println("Rayon : " + rayon);
		System.out.println("la surface est :"+surface());
		System.out.println("le volume est :"+volume());
	}


}
