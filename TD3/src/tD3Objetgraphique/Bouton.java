package tD3Objetgraphique;

import java.awt.Graphics;

public class Bouton extends Rectangle{
	private String text;
	public Bouton () {
		super();
		
	}
	public Bouton(int x, int y, int largeur, int hauteur,String text) {
		super(x,y,largeur, hauteur);
		this.text = text;
	}
	public Bouton(Bouton B) {
		super(B);
		this.text =B.text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public void tracer(Graphics g) {
		g.drawRect(x, y, largeur, hauteur);
        if(text != null) {
            g.drawString(text, x + 5, y + hauteur / 2);
        }
	}
	

}
