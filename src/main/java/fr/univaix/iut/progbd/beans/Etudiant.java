package fr.univaix.iut.progbd.beans;

import java.io.Serializable;
import java.util.Map;

public class Etudiant implements Serializable {

	private int numEt;
	private String nomEt;
	private String prenomEt;
	private String cpEt;
	private String villeEt;
	private int annee;
	private int groupe;
	
	
	private static final long serialVersionUID = -496381555038558819L;

	public Etudiant() {
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

	public void addNote(Module module, Note note) {
		//notation.creerLien(module, this, note);
	}

	public int getAnnee() {
		return annee;
	}

	public String getCpEt() {
		return cpEt;
	}

	public int getGroupe() {
		return groupe;
	}

	public String getNomEt() {
		return nomEt;
	}

	public Note getNote(Module module) {
		return null;
	}

	public Map<Module, Note> getNotes() {
		return null;
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

	public Note removeNote(Module module) {
		return null;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public void setCpEt(String cpEt) {
		this.cpEt = cpEt;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}

	public void setNumEt(int numEt) {
		this.numEt = numEt;
	}

	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}

	public void setVilleEt(String villeEt) {
		this.villeEt = villeEt;
	}

	@Override
	public String toString() {
		return "Etudiant [numEt=" + numEt + ", "
				+ (nomEt != null ? "nomEt=" + nomEt + ", " : "")
				+ (prenomEt != null ? "prenomEt=" + prenomEt + ", " : "")
				+ (cpEt != null ? "cpEt=" + cpEt + ", " : "")
				+ (villeEt != null ? "villeEt=" + villeEt + ", " : "")
				+ "annee=" + annee + ", groupe=" + groupe + ", "
				+ "notes=" + getNotes()  
				+ "]";
	}
}
