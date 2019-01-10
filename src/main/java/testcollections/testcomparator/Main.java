package testcollections.testcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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

		System.out.println("Selon ordre insertion");
		for (Ville ville : mesVilles) {
			System.out.println(ville.getDepartement() + "- " + ville.getNom());
		}

		DepartementComparator comparateur1 = new DepartementComparator();
		Collections.sort(mesVilles, comparateur1);

		System.out.println("Selon tri nom departement");
		for (Ville ville : mesVilles) {
			System.out.println(ville.getDepartement() + "- " + ville.getNom());
		}

		Collections.sort(mesVilles, new VilleComparator());

		System.out.println("Selon tri nom ville");
		for (Ville ville : mesVilles) {
			System.out.println(ville.getDepartement() + "- " + ville.getNom());
		}

		Collections.sort(mesVilles, new DepartementPuisVilleComparator());

		System.out.println("Selon tri nom dept/ nom ville");
		for (Ville ville : mesVilles) {
			System.out.println(ville.getDepartement() + "- " + ville.getNom());
		}

		DepartementPuisVilleComparator comparator = new DepartementPuisVilleComparator();
		comparator.compare(ville3, ville5);

		System.out.println(ville3.compareTo(ville5));

		Collections.sort(mesVilles);

		System.out.println("Tri selon ordre naturel");
		for (Ville ville : mesVilles) {
			System.out.println(ville.getDepartement() + "- " + ville.getNom());
		}

	}

}
