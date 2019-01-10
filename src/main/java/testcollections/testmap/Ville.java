package testcollections.testmap;

public class Ville {

	private String departement;
	private String nom;

	public Ville(String departement, String nom) {
		this.departement = departement;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	@Override
	public String toString() {
		return nom;
	}

}
