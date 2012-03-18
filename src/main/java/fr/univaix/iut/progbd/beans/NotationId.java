package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

public class NotationId implements Serializable{
	private static final long serialVersionUID = 2134569236613153158L;

	private int etudiant;
	private String module;
	
	public NotationId() {
	}

	public NotationId(int etudiant, String module) {
		this.etudiant = etudiant;
		this.module = module;
	}

	public int getEtudiant() {
		return etudiant;
	}

	public String getModule() {
		return module;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + etudiant;
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotationId other = (NotationId) obj;
		if (etudiant != other.etudiant)
			return false;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		return true;
	}

}
