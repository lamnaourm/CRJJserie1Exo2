package ma.ismo.projet.classes;

public class Employe extends Personne{

	protected double salaire;

	public Employe(int id, String nom, String prenom, double salaire) {
		super(id, nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return String.format("Je suis %s %s mon Salaire est: %.2f DH", nom.toUpperCase(), prenom,salaire);
	}
	
	
}
