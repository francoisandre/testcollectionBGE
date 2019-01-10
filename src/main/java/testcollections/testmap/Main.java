package testcollections.testmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map < String, String > proprietes = new HashMap < String, String >();
		proprietes.put("url", "http://localhost/login.php");
		proprietes.put("login", "admin");
		proprietes.put("password", "1234");

		connecte(proprietes);

	}

	private static void connecte(Map < String, String > proprietes) {
		String motDePasse = proprietes.get("password");
		if (motDePasse == null) {
			System.out.println("Impossible de se connecter");
		} else {
			System.out.println("Connexion...");
		}

		Set < String > keySet = proprietes.keySet();
		for (String cle : keySet) {
			System.out.println("La valeur de la clé " + cle + " est " + proprietes.get(cle));
		}
	}

}
