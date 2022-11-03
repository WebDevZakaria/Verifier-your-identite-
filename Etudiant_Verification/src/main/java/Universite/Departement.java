package Universite;

public class Departement {
	int id_departement;
	String nom_departement;
	Specialite sp;
	
	public Departement(int id_departement, String nom_departement) {
		super();
		this.id_departement = id_departement;
		this.nom_departement = nom_departement;
	}
	public Departement(int id_departement, String nom_departement, Specialite sp) {
		super();
		this.id_departement = id_departement;
		this.nom_departement = nom_departement;
		this.sp = sp;
	}
	public int getId_departement() {
		return id_departement;
	}
	public void setId_departement(int id_departement) {
		this.id_departement = id_departement;
	}
	public String getnom_departement() {
		return nom_departement;
	}
	public void setnom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}
	public Specialite getSp() {
		return sp;
	}
	public void setSp(Specialite sp) {
		this.sp = sp;
	} 
	
	
}

