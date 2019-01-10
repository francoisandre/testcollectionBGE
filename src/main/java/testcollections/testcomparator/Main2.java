package testcollections.testcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Rhone", "Lyon");
		Ville ville2 = new Ville("Var", "Toulon");
		Ville ville3 = new Ville("Gard", "Nimes");
		Ville ville4 = new Ville("Landes", "Dax");
		Ville ville5 = new Ville("Gard", "Ales");
		Ville ville6 = new Ville("Rhone", "Vienne");
		Ville ville7 = new Ville("Landes", "Bayonne");

		List < Ville > mesVilles = new ArrayList < Ville >();
		mesVilles.add(ville1);
		mesVilles.add(ville2);
		mesVilles.add(ville3);
		mesVilles.add(ville4);
		mesVilles.add(ville5);
		mesVilles.add(ville6);
		mesVilles.add(ville7);

		Comparator < Ville > villeComparator = new Comparator < Ville >() {
			public int compare(Ville o1, Ville o2) {
				return o1.getNom().compareTo(o2.getNom());
			}
		};

		Collections.sort(mesVilles, villeComparator);

		Ville superVille = new Ville("Ariege", "Foix") {

			@Override
			public String toString() {
				return "C'est super " + getNom();
			}
		};

		System.out.println(superVille.toString());
	}

}
