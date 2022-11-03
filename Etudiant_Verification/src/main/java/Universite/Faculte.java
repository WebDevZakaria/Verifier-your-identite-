package Universite;

public class Faculte {
	int id_faculte;
	String nom_faculte; 
	Departement dep;
	
	public Faculte(int id_faculte, String nom_faculte) {
		super();
		this.id_faculte = id_faculte;
		this.nom_faculte = nom_faculte;
	}
	public Faculte(int id_faculte, String nom_faculte, Departement dep) {
		super();
		this.id_faculte = id_faculte;
		this.nom_faculte = nom_faculte;
		this.dep = dep;
	}
	public int getId_faculte() {
		return id_faculte;
	}
	public void setId_faculte(int id_faculte) {
		this.id_faculte = id_faculte;
	}
	public String getNom_faculte() {
		return nom_faculte;
	}
	public void setNom_faculte(String nom_faculte) {
		this.nom_faculte = nom_faculte;
	}
	
	public Departement getDep() {
		return dep;
	}
	public void setDep(Departement dep) {
		this.dep = dep;
	}
	
}
