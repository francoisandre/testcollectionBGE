package testcollections.testcomparator;

import java.util.Comparator;

public class DepartementComparator implements Comparator < Ville > {

	public int compare(Ville o1, Ville o2) {
		return o1.getDepartement().compareTo(o2.getDepartement());
	}

}
