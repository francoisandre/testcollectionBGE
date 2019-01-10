package testcollections.testcomparator;

import java.util.Comparator;

public class VilleComparator implements Comparator < Ville > {

	public int compare(Ville o1, Ville o2) {
		return o1.getNom().compareTo(o2.getNom());
	}

}
