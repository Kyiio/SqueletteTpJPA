package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

public class Enseignement implements Serializable {

	private Etudiant etudiant;
	private Module module;
	private Prof prof;

	private static final long serialVersionUID = -6442060688949092286L;

	public Enseignement() {
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public Module getModule() {
		return module;
	}

	public Prof getProf() {
		return prof;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Enseignt ["
				+ (etudiant != null ? "etudiant=" + etudiant + ", " : "")
				+ (module != null ? "module=" + module + ", " : "")
				+ (prof != null ? "prof=" + prof : "") + "]";
	}
}
