package testcollections.testmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		Map < String, List < Ville > > resultat = new HashMap < String, List < Ville > >();
		for (Ville ville : mesVilles) {
			String departement = ville.getDepartement();
			if (resultat.containsKey(departement)) {
				List < Ville > list = resultat.get(departement);
				list.add(ville);
			} else {
				List < Ville > list = new ArrayList < Ville >();
				list.add(ville);
				resultat.put(departement, list);
			}
		}

		System.out.println("Avant modification");
		System.out.println(mesVilles);

		ville3.setNom("PasNimes");

		System.out.println("Après modification");
		System.out.println(mesVilles);
	}

}
