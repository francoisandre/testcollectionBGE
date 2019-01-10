package testcollections.test1;

public class Ville {
	private String nom;

	public Ville(String nom) {
		this.nom = nom;
		System.out.println("");
	}

	/**
	 * Retourne la valeur du nom de la ville
	 *
	 * @return Une chaine eventuellement nulle
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		// Ici je fais ça pour telle raison
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ville other = (Ville) obj;
		if (nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!nom.equals(other.nom)) {
			return false;
		}
		return true;
	}

}
