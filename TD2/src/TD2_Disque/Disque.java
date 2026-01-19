package TD2_Disque;


public class Disque {
	private float diametre ;
	public Disque() {
		
	}
	public Disque(float diametre) {
		this.diametre=diametre;
	}
	public Disque(Disque D) {
		this.diametre=D.diametre;
	}
	public float getDiametre() {
		return diametre;
	}
	public void setDiametre(float diametre) {
		this.diametre = diametre;
	}
	public float perimetre(float diametre) {
		return (float) (Math.PI * diametre);
	}
	public float surface(float diametre) {
		return (float) (Math.PI *  Math.pow((diametre/2),2));
			
	}
	public float rayon(float diametre)  {
		return (float)  diametre/2;
	}
	public void afficher() {
		System.out.println("le périmètre:"+perimetre(diametre));
		System.out.println("la surface:"+surface(diametre));
		System.out.println("le rayon"+rayon(diametre));
		System.out.println();

	}
}
