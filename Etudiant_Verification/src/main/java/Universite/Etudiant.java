package Universite;

public class Etudiant {
	int matricule;
	String nom;
	String prenom;
	String sexe;
	String date_naissance;
	String prenom_pere;
	String nom_mere;
	String prenom_mere;
	Faculte fac; 	
	int annee_inscription;
	
	public Etudiant(int matricule,String nom, String prenom,String sexe,String date_naissance,int annee_inscription) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.annee_inscription = annee_inscription;	
	}
	public Etudiant(int matricule, String nom, String prenom, String sexe, String date_naissance, String prenom_pere,
			String nom_mere, String prenom_mere, Faculte fac, int annee_inscription) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.prenom_pere = prenom_pere;
		this.nom_mere = nom_mere;
		this.prenom_mere = prenom_mere;
		this.fac = fac;
		this.annee_inscription =annee_inscription;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getPrenom_pere() {
		return prenom_pere;
	}
	public void setPrenom_pere(String prenom_pere) {
		this.prenom_pere = prenom_pere;
	}
	public String getNom_mere() {
		return nom_mere;
	}
	public void setNom_mere(String nom_mere) {
		this.nom_mere = nom_mere;
	}
	public String getPrenom_mere() {
		return prenom_mere;
	}
	public void setPrenom_mere(String prenom_mere) {
		this.prenom_mere = prenom_mere;
	}
	public Faculte getFac() {
		return fac;
	}
	public void setFac(Faculte fac) {
		this.fac = fac;
	}
	public int getDernier_annee_inscription() {
		return annee_inscription;
	}
	public void setDernier_annee_inscription(int dernier_annee_inscription) {
		this.annee_inscription = dernier_annee_inscription;
	}
}
