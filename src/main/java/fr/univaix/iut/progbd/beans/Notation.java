package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

public class Notation implements Serializable {

	private Etudiant etudiant;
	private Module module;
	private Note note;

	private static final long serialVersionUID = -2942677360143690724L;

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

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return String.format("Notation [etudiant=%s, module=%s, note=%s]",
				etudiant, module, note);
	}
}
