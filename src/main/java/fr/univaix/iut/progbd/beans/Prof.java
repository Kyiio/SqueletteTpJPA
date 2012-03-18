package fr.univaix.iut.progbd.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = Prof.FIND_ALL, query = "SELECT p FROM Prof p"),
    @NamedQuery(name = Prof.FIND_BY_NAME, query = "SELECT p FROM Prof p WHERE p.nomProf = :fnomProf"),
    @NamedQuery(name = Prof.FIND_BY_MAT_SPEC, query = "SELECT p FROM Prof p WHERE p.matSpec = :fmatSpec"),
})
public class Prof implements Serializable {
	private static final long serialVersionUID = -6687290105872706852L;
	public static final String FIND_ALL = "findAllProfs";
	public static final String FIND_BY_NAME = "findProfsByName";
	public static final String FIND_BY_MAT_SPEC = "findProfsByMatSpec";
	@Id
	@GeneratedValue
	@Column(name = "NUM_PROF")
	private int numProf;
	@Column(name = "NOM_PROF", length = 30)
	private String nomProf;
	@Column(name = "PRENOM_PROF", length = 20)
	private String prenomProf;
	@Column(name = "ADR_PROF", length = 40)
	private String adrProf;
	@Column(name = "CP_PROF", length = 5)
	private String cpProf;
	@Column(name = "VILLE_PROF", length = 30)
	private String villeProf;

	@ManyToOne
	@JoinColumn(name = "MAT_SPEC")
	private Module matSpec;

	@OneToMany(targetEntity = Enseignement.class, mappedBy = "prof")
	private Collection<Enseignement> enseignements;

	public Prof() {
	}

	public Prof(int numProf) {
		super();
		this.numProf = numProf;
	}

	public Prof(int numProf, String nomProf, String prenomProf, String adrProf,
			String cpProf, String villeProf, Module matSpec) {
		super();
		this.numProf = numProf;
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.adrProf = adrProf;
		this.cpProf = cpProf;
		this.villeProf = villeProf;
		this.matSpec = matSpec;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prof other = (Prof) obj;
		if (adrProf == null) {
			if (other.adrProf != null)
				return false;
		} else if (!adrProf.equals(other.adrProf))
			return false;
		if (cpProf == null) {
			if (other.cpProf != null)
				return false;
		} else if (!cpProf.equals(other.cpProf))
			return false;
		if (nomProf == null) {
			if (other.nomProf != null)
				return false;
		} else if (!nomProf.equals(other.nomProf))
			return false;
		if (numProf != other.numProf)
			return false;
		if (prenomProf == null) {
			if (other.prenomProf != null)
				return false;
		} else if (!prenomProf.equals(other.prenomProf))
			return false;
		if (villeProf == null) {
			if (other.villeProf != null)
				return false;
		} else if (!villeProf.equals(other.villeProf))
			return false;
		return true;
	}

	public String getAdrProf() {
		return adrProf;
	}

	public String getCpProf() {
		return cpProf;
	}

	public Collection<Enseignement> getEnseignements() {
		return enseignements;
	}

	public Module getMatSpec() {
		return matSpec;
	}

	public String getNomProf() {
		return nomProf;
	}

	public int getNumProf() {
		return numProf;
	}

	public String getPrenomProf() {
		return prenomProf;
	}

	public String getVilleProf() {
		return villeProf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adrProf == null) ? 0 : adrProf.hashCode());
		result = prime * result + ((cpProf == null) ? 0 : cpProf.hashCode());
		result = prime * result + ((nomProf == null) ? 0 : nomProf.hashCode());
		result = prime * result + numProf;
		result = prime * result
				+ ((prenomProf == null) ? 0 : prenomProf.hashCode());
		result = prime * result
				+ ((villeProf == null) ? 0 : villeProf.hashCode());
		return result;
	}

	public void setAdrProf(String adrProf) {
		this.adrProf = adrProf;
	}

	public void setCpProf(String cpProf) {
		this.cpProf = cpProf;
	}

	public void setEnseignements(Collection<Enseignement> enseignements) {
		this.enseignements = enseignements;
	}

	public void setMatSpec(Module matSpec) {
		this.matSpec = matSpec;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public void setPrenomProf(String prenomProf) {
		this.prenomProf = prenomProf;
	}

	public void setVilleProf(String villeProf) {
		this.villeProf = villeProf;
	}

	@Override
	public String toString() {
		return "Prof [numProf=" + numProf + ", "
				+ (nomProf != null ? "nomProf=" + nomProf + ", " : "")
				+ (prenomProf != null ? "prenomProf=" + prenomProf + ", " : "")
				+ (adrProf != null ? "adrProf=" + adrProf + ", " : "")
				+ (cpProf != null ? "cpProf=" + cpProf + ", " : "")
				+ (villeProf != null ? "villeProf=" + villeProf + ", " : "")
				+ (matSpec != null ? "matSpec=" + matSpec.getCode() : "") + "]";
	}
}
