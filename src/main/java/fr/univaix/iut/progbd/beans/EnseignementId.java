package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

public class EnseignementId implements Serializable {
	private static final long serialVersionUID = 6188754395979965952L;
	
	int etudiant;
	String module;
	int prof;

	public EnseignementId() {
		super();
	}

	public EnseignementId(int etudiant, String module, int prof) {
		super();
		this.etudiant = etudiant;
		this.module = module;
		this.prof = prof;
	}

	public int getEtudiant() {
		return etudiant;
	}

	public String getModule() {
		return module;
	}

	public int getProf() {
		return prof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + etudiant;
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		result = prime * result + prof;
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
		EnseignementId other = (EnseignementId) obj;
		if (etudiant != other.etudiant)
			return false;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		if (prof != other.prof)
			return false;
		return true;
	}

}
