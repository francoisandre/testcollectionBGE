package testensemble;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Toulouse");
		Ville ville1b = new Ville("toulouse");
		Ville ville2 = new Ville("Toulouse");

		Set < Ville > mesVilles = new HashSet < Ville >();
		mesVilles.add(ville1);
		mesVilles.add(ville1b);

		boolean tmp = mesVilles.contains(ville1);
		System.out.println("L'élément est présent: " + tmp);

		tmp = mesVilles.contains(ville2);
		System.out.println("L'élément est présent: " + tmp);

		System.out.println(mesVilles.size());

		Ville ville3 = new Ville("Perpignan");
		mesVilles.add(ville3);
		ville3.setNom("Toulouse");

		System.out.println("Ensemble fourbe");

		for (Ville ville : mesVilles) {
			System.out.println(ville.getNom());
		}

		Set < Ville > autreEnsemble = new HashSet < Ville >();
		autreEnsemble.addAll(mesVilles);
		System.out.println("Ensemble apeuré");
		for (Ville ville : autreEnsemble) {
			System.out.println(ville.getNom());
		}

	}

}
