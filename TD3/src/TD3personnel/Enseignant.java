package TD3personnel;

public class Enseignant extends Personnel {
	private String matiereEnseignant;
	public Enseignant() {
		super();
	}
	public Enseignant(String nom, byte age,String adresse, float salaire,String matiereEnseignant) {
		super(nom,age, adresse, salaire);
		this.matiereEnseignant = matiereEnseignant;
	}
	public Enseignant(Enseignant E) {
		super(E.nom,E.age,E.adresse,E.salaire);
		this.matiereEnseignant = E.matiereEnseignant;
	}
	public String getMatiereEnseignant() {
		return matiereEnseignant;
	}
	public void setEnseignant(String nom, byte age,String adresse, float salaire,String matiereEnseignant) {
		super.setPersonne(nom, age, adresse, salaire);
		this.matiereEnseignant = matiereEnseignant;
	}
	@Override
	public String toString() {
		return super.toString()+"Enseignant [matiereEnseignant=" + matiereEnseignant + "]";
	}
	

}
