package Universite;

public class Formation {
	int id_formation;
	String type_formation;
	public Formation(int id_formation, String type_formation) {
		super();
		this.id_formation = id_formation;
		this.type_formation = type_formation;
	}
	public int getId_formation() {
		return id_formation;
	}
	public void setId_formation(int id_formation) {
		this.id_formation = id_formation;
	}
	public String getType_formation() {
		return type_formation;
	}
	public void setType_formation(String type_formation) {
		this.type_formation = type_formation;
	}



}
