package TD3personnel;

public class Personnel extends Personne  {
	protected String adresse;
	protected float salaire;
	public Personnel() {
		super();
	}
	public Personnel(String nom, byte age,String adresse, float salaire) {
		super(nom,age);
		this.adresse = adresse;
		this.salaire = salaire;
	}
	public Personnel(Personnel P) {
		super(P.nom,P.age);
		this.adresse = P.adresse;
		this.salaire = P.salaire;
	}
	public String getAdresse() {
		return adresse;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setPersonne(String nom, byte age,String adresse, float salaire) {
		super.setPersonne(nom, age);
		this.salaire = salaire;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return super.toString()+"Personnel [adresse=" + adresse + ", salaire=" + salaire + "]";
	}
	
	

}
