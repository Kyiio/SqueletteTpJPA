package fr.univaix.iut.progbd.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
    @NamedQuery(name = Module.FIND_ALL, query = "SELECT m FROM Module m"),
    @NamedQuery(name = Module.FIND_BY_LIBELLE, query = "SELECT m FROM Module m WHERE m.libelle = :flibelle"),
    @NamedQuery(name = Module.FIND_BY_DISCIPLINE, query = "SELECT m FROM Module m WHERE m.discipline = :fdiscipline"),
    @NamedQuery(name = Module.FIND_BY_RESPONSABLE, query = "SELECT m FROM Module m WHERE m.responsable = :fresponsable"),
})
public class Module implements Serializable {
	private static final long serialVersionUID = 8486949223422463337L;
	public static final String FIND_ALL = "findAllModules";
	public static final String FIND_BY_LIBELLE = "findModulesByLibelle";
	public static final String FIND_BY_DISCIPLINE = "findModulesByDiscipline";
	public static final String FIND_BY_RESPONSABLE = "findModulesByResponsable";
	@Id
	@GeneratedValue
	@Column(length = 7)
	private String code;
	@Column(length = 30)
	private String libelle;
	@Column(name = "H_COURS_PREV")
	private int hCoursPrev;
	@Column(name = "H_COURS_REA")
	private int hCoursRea;
	@Column(name = "H_TP_PREV")
	private int hTpPrev;
	@Column(name = "H_TP_REA")
	private int hTpRea;
	private String discipline;
	@Column(name = "COEFF_TEST")
	private int coefTest;
	@Column(name = "COEFF_CC")
	private int coefCc;

	@ManyToOne
	@JoinColumn(name = "CODEPERE")
	private Module pere;

	@ManyToOne
	@JoinColumn(name = "RESP")
	private Prof responsable;

	@OneToMany(targetEntity = Prof.class, mappedBy = "matSpec")
	private Collection<Prof> specialistes;

	@OneToMany(targetEntity = Notation.class, mappedBy = "module")
	private Collection<Notation> notations;

	@OneToMany(targetEntity = Enseignement.class, mappedBy = "module")
	private Collection<Enseignement> enseignements;

	public Module() {
	}

	public Module(String code) {
		super();
		this.code = code;
	}

	public Module(String code, String libelle, int hCoursPrev, int hCoursRea,
			int hTpPrev, int hTpRea, String discipline, int coefTest, int coefCc) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.hCoursPrev = hCoursPrev;
		this.hCoursRea = hCoursRea;
		this.hTpPrev = hTpPrev;
		this.hTpRea = hTpRea;
		this.discipline = discipline;
		this.coefTest = coefTest;
		this.coefCc = coefCc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (coefCc != other.coefCc)
			return false;
		if (coefTest != other.coefTest)
			return false;
		if (discipline == null) {
			if (other.discipline != null)
				return false;
		} else if (!discipline.equals(other.discipline))
			return false;
		if (notations == null) {
			if (other.notations != null)
				return false;
		} else if (!notations.equals(other.notations))
			return false;
		if (hCoursPrev != other.hCoursPrev)
			return false;
		if (hCoursRea != other.hCoursRea)
			return false;
		if (hTpPrev != other.hTpPrev)
			return false;
		if (hTpRea != other.hTpRea)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}

	public String getCode() {
		return code;
	}

	public int getCoefCc() {
		return coefCc;
	}

	public int getCoefTest() {
		return coefTest;
	}

	public String getDiscipline() {
		return discipline;
	}

	public Collection<Enseignement> getEnseignements() {
		return enseignements;
	}

	public int gethCoursPrev() {
		return hCoursPrev;
	}

	public int gethCoursRea() {
		return hCoursRea;
	}

	public int gethTpPrev() {
		return hTpPrev;
	}

	public int gethTpRea() {
		return hTpRea;
	}

	public String getLibelle() {
		return libelle;
	}

	public Collection<Notation> getNotations() {
		return notations;
	}

	public Module getPere() {
		return pere;
	}

	public Prof getResponsable() {
		return responsable;
	}

	public Collection<Prof> getSpecialistes() {
		return specialistes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + coefCc;
		result = prime * result + coefTest;
		result = prime * result
				+ ((discipline == null) ? 0 : discipline.hashCode());
		result = prime * result
				+ ((notations == null) ? 0 : notations.hashCode());
		result = prime * result + hCoursPrev;
		result = prime * result + hCoursRea;
		result = prime * result + hTpPrev;
		result = prime * result + hTpRea;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		return result;
	}

	public void setCoefCc(int coefCc) {
		this.coefCc = coefCc;
	}

	public void setCoefTest(int coeffTest) {
		this.coefTest = coeffTest;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public void setEnseignements(Collection<Enseignement> enseignements) {
		this.enseignements = enseignements;
	}

	public void sethCoursPrev(int hCoursPrev) {
		this.hCoursPrev = hCoursPrev;
	}

	public void sethCoursRea(int hCoursRea) {
		this.hCoursRea = hCoursRea;
	}

	public void sethTpPrev(int hTpPrev) {
		this.hTpPrev = hTpPrev;
	}

	public void sethTpRea(int hTpRea) {
		this.hTpRea = hTpRea;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setNotations(Collection<Notation> notations) {
		this.notations = notations;
	}

	public void setPere(Module pere) {
		this.pere = pere;
	}

	public void setResponsable(Prof responsable) {
		this.responsable = responsable;
	}

	public void setSpecialistes(Collection<Prof> specialistes) {
		this.specialistes = specialistes;
	}

	@Override
	public String toString() {
		return "Module ["
				+ (code != null ? "code=" + code + ", " : "")
				+ (libelle != null ? "libelle=" + libelle + ", " : "")
				+ "hCoursPrev="
				+ hCoursPrev
				+ ", hCoursRea="
				+ hCoursRea
				+ ", hTpPrev="
				+ hTpPrev
				+ ", hTpRea="
				+ hTpRea
				+ ", "
				+ (discipline != null ? "discipline=" + discipline + ", " : "")
				+ "coeffTest="
				+ coefTest
				+ ", coefCc="
				+ coefCc
				+ ", "
				+ (responsable != null ? "responsable="
						+ responsable.getNumProf() + ", " : "")
				+ (pere != null ? "pere=" + pere.getCode() : "") + "]";
	}
}
