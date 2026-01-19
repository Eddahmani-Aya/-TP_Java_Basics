package TD3personnel;

public class TestPersonnel {
	public static void main(String[] args) {
		Personne[] personnes=new Personne[3];
		personnes[0]=new Personne("Aya",(byte) 18);
		personnes[1]=new Personnel("Marwa",(byte) 19,"Casa",5000);
		personnes[2]=new Enseignant("Hafsa",(byte) 20,"Casa",8000,"Informatique");
		
		for (Personne p : personnes) {
			System.out.println("Persone:");
            System.out.println(p.toString());
        }
	}

}
