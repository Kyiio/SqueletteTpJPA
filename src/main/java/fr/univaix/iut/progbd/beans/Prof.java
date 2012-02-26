package fr.univaix.iut.progbd.beans;

import java.io.Serializable;

public class Prof implements Serializable {

	private int numProf;
	private String nomProf;
	private String prenomProf;
	private String adrProf;
	private String cpProf;
	private String villeProf;
	private Module matSpec;

	private static final long serialVersionUID = -6687290105872706852L;

	public Prof() {
	}

	public String getAdrProf() {
		return adrProf;
	}

	public String getCpProf() {
		return cpProf;
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

	public void setAdrProf(String adrProf) {
		this.adrProf = adrProf;
	}

	public void setCpProf(String cpProf) {
		this.cpProf = cpProf;
	}

	public void setMatSpec(Module matSpec) {
		this.matSpec = matSpec;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public void setNumProf(int numProf) {
		this.numProf = numProf;
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
				+ (matSpec != null ? "matSpec=" + matSpec : "") + "]";
	}
}
