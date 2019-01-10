package testcollections.testcomparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ville implements Comparable < Ville > {

	private String departement;
	private String nom;

	public Ville(String departement, String nom) {
		this.departement = departement;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public String getDepartement() {
		return departement;
	}

	public int compareTo(Ville o) {
		return getNom().compareTo(o.getNom());
	}

	public List < Ville > trie(List < Ville > listeATrier) {
		Collections.sort(listeATrier, new ComparateurInterne());
		return listeATrier;
	}

	private class ComparateurInterne implements Comparator < Ville > {

		public int compare(Ville o1, Ville o2) {
			return o1.getNom().compareTo(o2.getNom());
		}

	}

}
