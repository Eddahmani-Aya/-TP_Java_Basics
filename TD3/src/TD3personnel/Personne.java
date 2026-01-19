package TD3personnel;

public class Personne {
	protected String nom;
	protected byte age;
	public  Personne() {
		
	}
	public Personne(String nom, byte age) {
		this.nom = nom;
		this.age = age;
	}
	public Personne(Personne P) {
		this.nom = P.nom;
		this.age = P.age;
	}
	public String getNom() {
		return nom;
	}
	
	public byte getAge() {
		return age;
	}
	public void setPersonne(String nom, byte age) {
		this.nom = nom;
		this.age = age;
	}
	public String toString() {
		return "nom=" + nom + ", age=" + age + "";
	}
	
	
	
	

}
