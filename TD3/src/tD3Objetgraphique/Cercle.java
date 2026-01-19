package tD3Objetgraphique;

import java.awt.Graphics;

public class Cercle extends ObjetGraphique{
	private int rayon;
	public Cercle()
	{
		super();
	}
	
	public Cercle(int x, int y ,int rayon) {
		super(x,y, 2*rayon, 2*rayon);
		this.rayon = rayon;
	}
	public Cercle(Cercle C) {
		super(C);
		this.rayon = C.rayon;
	}
	
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public void tracer(Graphics g) {
		g.drawOval(x, y, largeur, hauteur);		
	}

}
