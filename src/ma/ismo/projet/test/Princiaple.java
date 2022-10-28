package ma.ismo.projet.test;

import ma.ismo.projet.classes.Employe;
import ma.ismo.projet.classes.Etudiant;
import ma.ismo.projet.classes.Professeur;

public class Princiaple {

	public static void main(String[] args) {
		
		
		Etudiant e1 = new Etudiant(1, "Nometud1", "Prenometud1", "8998989");
		Etudiant e2 = new Etudiant(2, "Nometud2", "Prenometud2", "67676767");
		
		Employe emp1 = new Employe(1, "NomEmp1", "PrenomEmp1", 565656.4);
		Employe emp2 = new Employe(2, "NomEmp2", "PrenomEmp2", 5632323.4);
		
		Professeur p1 = new Professeur(1, "NomProf1", "NomProf1", 323232, "TDI");
		Professeur p2 = new Professeur(2, "NomProf2", "NomProf2", 212121, "TRI");
		
		System.out.println("Etudiant 1 :" + e1);
		System.out.println("Etudiant 2 :" + e2);
		
		System.out.println("Employe 1 :" + emp1);
		System.out.println("Employe 2 :" + emp2);
		
		System.out.println("Professeur 1 :" + p1);
		System.out.println("Professeur 2 :" + p2);

	}

}
