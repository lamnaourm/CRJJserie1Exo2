package ma.ismo.projet.classes;

public class Etudiant extends Personne {

	private String cne;

	public Etudiant(int id, String nom, String prenom, String cne) {
		super(id, nom, prenom);
		this.cne = cne;
	}

	@Override
	public String toString() {
		return String.format("Je suis %s %s mon CNE est: %s", nom.toUpperCase(), prenom,cne);
	}
	
	
	
	
}


