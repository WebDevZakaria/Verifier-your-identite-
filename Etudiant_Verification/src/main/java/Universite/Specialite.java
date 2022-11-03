package Universite;

public class Specialite {
	int id_specialite;
	String nom_specialite;
	Niveau niveau;  
	Formation formation;
	
	public Specialite(int id_specialite, String nom_specialite) {
		super();
		this.id_specialite = id_specialite;
		this.nom_specialite = nom_specialite;
	}
	public Specialite(int id_specialite, String nom_specialite, Niveau niveau, Formation formation) {
		super();
		this.id_specialite = id_specialite;
		this.nom_specialite = nom_specialite;
		this.niveau = niveau;
		this.formation = formation;
	}
	public int getId_specialite() {
		return id_specialite;
	}
	public void setId_specialite(int id_specialite) {
		this.id_specialite = id_specialite;
	}
	public String getNom() {
		return nom_specialite;
	}
	public void setNom(String nom_specialite) {
		this.nom_specialite = nom_specialite;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}  
	

}
