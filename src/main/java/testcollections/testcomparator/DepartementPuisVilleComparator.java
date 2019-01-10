package testcollections.testcomparator;

import java.util.Comparator;

public class DepartementPuisVilleComparator implements Comparator < Ville > {

	public int compare(Ville v1, Ville v2) {

		int tmp = v1.getDepartement().compareTo(v2.getDepartement());
		if (tmp != 0) {
			return tmp;
		}
		return v1.getNom().compareTo(v2.getNom());
	}

}
