package ma.ismo.projet.classes;

public class Professeur extends Employe {
	
	private String specialite;

	public Professeur(int id, String nom, String prenom, double salaire, String specialite) {
		super(id, nom, prenom, salaire);
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return String.format("Je suis %s %s mon Salaire est: %.2f DH ma specialite : %s", nom.toUpperCase(), prenom,salaire, specialite);
	}
	
}
