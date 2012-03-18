package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="ENSEIGNT")
@IdClass(EnseignementId.class)
@NamedQueries({
    @NamedQuery(name = Enseignement.FIND_ALL, query = "SELECT e FROM Enseignement e")
})
public class Enseignement implements Serializable {
	private static final long serialVersionUID = -6442060688949092286L;
	public static final String FIND_ALL = "findAllEnseignements";

	@Id
	@ManyToOne
	@JoinColumn(name="NUM_ET")
	private Etudiant etudiant;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CODE")
	private Module module;
	
	@Id
	@ManyToOne
	@JoinColumn(name="NUM_PROF")
	private Prof prof;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((etudiant == null) ? 0 : etudiant.hashCode());
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		result = prime * result + ((prof == null) ? 0 : prof.hashCode());
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
		Enseignement other = (Enseignement) obj;
		if (etudiant == null) {
			if (other.etudiant != null)
				return false;
		} else if (!etudiant.equals(other.etudiant))
			return false;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		if (prof == null) {
			if (other.prof != null)
				return false;
		} else if (!prof.equals(other.prof))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Enseignt ["
				+ (etudiant != null ? "etudiant=" + etudiant.getNumEt() + ", " : "")
				+ (module != null ? "module=" + module.getCode() + ", " : "")
				+ (prof != null ? "prof=" + prof : "") + "]";
	}
}
