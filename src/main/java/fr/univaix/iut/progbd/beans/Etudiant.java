package fr.univaix.iut.progbd.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
    @NamedQuery(name = Etudiant.FIND_ALL, query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = Etudiant.FIND_BY_NAME, query = "SELECT e FROM Etudiant e WHERE e.nomEt = :fnomEt"),
    @NamedQuery(name = Etudiant.FIND_BY_GROUP, query = "SELECT e FROM Etudiant e WHERE e.groupe = :fgroupe"),
    @NamedQuery(name = Etudiant.FIND_BY_YEAR, query = "SELECT e FROM Etudiant e WHERE e.annee = :fannee"),
})
public class Etudiant implements Serializable {
	private static final long serialVersionUID = -496381555038558819L;
	public static final String FIND_ALL = "findAllEtudiants";
	public static final String FIND_BY_NAME  = "findEtudiantsByName";
	public static final String FIND_BY_GROUP = "findEtudiantsByGroup";
	public static final String FIND_BY_YEAR  = "findEtudiantsByYear";

	@Id
	@GeneratedValue
	@Column(name = "NUM_ET")
	private int numEt;

	@Column(name = "NOM_ET", length = 20)
	private String nomEt;
	@Column(name = "PRENOM_ET", length = 15)
	private String prenomEt;
	@Column(name = "CP_ET", length = 5)
	private String cpEt;
	@Column(name = "VILLE_ET", length = 20)
	private String villeEt;
	private int annee;
	private int groupe;

	@OneToMany(targetEntity = Notation.class, mappedBy = "etudiant")
	private Collection<Notation> notations;

	@OneToMany(targetEntity = Enseignement.class, mappedBy = "etudiant")
	private Collection<Enseignement> enseignements;

	public Etudiant() {
	}

	public Etudiant(int numEt) {
		super();
		this.numEt = numEt;
	}

	public Etudiant(int numEt, String nomEt, String prenomEt, String cpEt,
			String villeEt, int annee, int groupe) {
		this.numEt = numEt;
		this.nomEt = nomEt;
		this.prenomEt = prenomEt;
		this.cpEt = cpEt;
		this.villeEt = villeEt;
		this.annee = annee;
		this.groupe = groupe;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (annee != other.annee)
			return false;
		if (cpEt == null) {
			if (other.cpEt != null)
				return false;
		} else if (!cpEt.equals(other.cpEt))
			return false;
		if (groupe != other.groupe)
			return false;
		if (nomEt == null) {
			if (other.nomEt != null)
				return false;
		} else if (!nomEt.equals(other.nomEt))
			return false;
		if (numEt != other.numEt)
			return false;
		if (prenomEt == null) {
			if (other.prenomEt != null)
				return false;
		} else if (!prenomEt.equals(other.prenomEt))
			return false;
		if (villeEt == null) {
			if (other.villeEt != null)
				return false;
		} else if (!villeEt.equals(other.villeEt))
			return false;
		return true;
	}

	public int getAnnee() {
		return annee;
	}

	public String getCpEt() {
		return cpEt;
	}

	public Collection<Enseignement> getEnseignements() {
		return enseignements;
	}

	public int getGroupe() {
		return groupe;
	}

	public String getNomEt() {
		return nomEt;
	}

	public Collection<Notation> getNotations() {
		return notations;
	}

	public int getNumEt() {
		return numEt;
	}

	public String getPrenomEt() {
		return prenomEt;
	}

	public String getVilleEt() {
		return villeEt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + ((cpEt == null) ? 0 : cpEt.hashCode());
		result = prime * result + groupe;
		result = prime * result + ((nomEt == null) ? 0 : nomEt.hashCode());
		result = prime * result + numEt;
		result = prime * result
				+ ((prenomEt == null) ? 0 : prenomEt.hashCode());
		result = prime * result + ((villeEt == null) ? 0 : villeEt.hashCode());
		return result;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public void setCpEt(String cpEt) {
		this.cpEt = cpEt;
	}

	public void setEnseignements(Collection<Enseignement> enseignements) {
		this.enseignements = enseignements;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}

	public void setNotations(Collection<Notation> notations) {
		this.notations = notations;
	}

	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}

	public void setVilleEt(String villeEt) {
		this.villeEt = villeEt;
	}

	@Override
	public String toString() {
		return "Etudiant [" + "numEt=" + numEt + ", "
				+ (nomEt != null ? "nomEt=" + nomEt + ", " : "")
				+ (prenomEt != null ? "prenomEt=" + prenomEt + ", " : "")
				+ (cpEt != null ? "cpEt=" + cpEt + ", " : "")
				+ (villeEt != null ? "villeEt=" + villeEt + ", " : "")
				+ "annee=" + annee + ", groupe=" + groupe + "]";
	}

}
