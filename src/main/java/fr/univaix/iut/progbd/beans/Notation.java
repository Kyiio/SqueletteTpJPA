package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@IdClass(NotationId.class)
@NamedQueries({
    @NamedQuery(name = Notation.FIND_ALL, query = "SELECT n FROM Notation n")
})
public class Notation implements Serializable {
	private static final long serialVersionUID = -2942677360143690724L;
	public static final String FIND_ALL = "findAllNotations";
	
	@Id
	@ManyToOne
	@JoinColumn(name="NUM_ET")
	private Etudiant etudiant;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CODE")
	private Module module;
	
	@Column(name="MOY_TEST")
	private int noteTest;
	@Column(name="MOY_CC")
	private int noteCc;

	public Notation() {
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public Module getModule() {
		return module;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
	public int getNoteCc() {
		return noteCc;
	}

	public int getNoteTest() {
		return noteTest;
	}

	public void setNoteCc(int noteCc) {
		this.noteCc = noteCc;
	}

	public void setNoteTest(int noteTest) {
		this.noteTest = noteTest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((etudiant == null) ? 0 : etudiant.hashCode());
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		result = prime * result + noteCc;
		result = prime * result + noteTest;
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
		Notation other = (Notation) obj;
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
		if (noteCc != other.noteCc)
			return false;
		if (noteTest != other.noteTest)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Notation ["
				+ (etudiant != null ? "etudiant=" + etudiant.getNumEt() + ", " : "")
				+ (module != null ? "module=" + module.getCode() + ", " : "")
				+ "noteTest=" + noteTest + ", noteCc=" + noteCc + "]";
	}

	
	
}
