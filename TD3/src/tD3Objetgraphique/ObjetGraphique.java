package tD3Objetgraphique;

import java.awt.Graphics;

public abstract class ObjetGraphique {
	protected int x,y, largeur, hauteur ;
	public ObjetGraphique() {
		
	}
	public ObjetGraphique(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public ObjetGraphique(ObjetGraphique O) {
		this.x = O.x;
		this.y = O.y;
		this.largeur = O.largeur;
		this.hauteur = O.hauteur;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public int getHauteur() {
		return hauteur;
	}
	public void setObjetGraphique(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void setTaille(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void deplacer(int nx, int ny) {
		this.x += nx;
	    this.y += ny;
	}
	public abstract void tracer(Graphics g);


	
	
	
}
