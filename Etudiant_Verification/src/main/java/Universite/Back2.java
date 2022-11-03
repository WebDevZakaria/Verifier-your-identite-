package Universite;
	import java.sql.*;
	
	public class Back2 {

	public static Etudiant getinfoe(int matricule) {
		Connection con = Connections.ready();
		Etudiant ss=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT matricule,nom_etudiant,prenom_etudiant,sexe,date_naissance,anne_inscription FROM etudiant where matricule="+matricule);
			while(rs.next()) {
				ss=new Etudiant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
			}
		}catch(Exception e){ System.out.println(e);}
		return ss;	
	}

	public static int get_id_faculte(int matricule) {
		Connection con = Connections.ready();
		int k = 0;	
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_faculte FROM etudiant where matricule="+matricule);
			while(rs.next()) {k=rs.getInt(1);}
		}catch(Exception e){ System.out.println(e);}
		return k;
	}
	
	public static Faculte get_faculte(int id_faculte) {
		Connection con = Connections.ready();
		Faculte ff=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_faculte,nom_faculte FROM faculte where id_faculte="+id_faculte);
			while(rs.next()) {
				ff = new Faculte(rs.getInt(1),rs.getString(2));}
		}catch(Exception e){ System.out.println(e);}
		return ff;
	}
	public static int get_id_departement(int id_faculte) {
		Connection con = Connections.ready();
		int ff=0;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_departement FROM faculte where id_faculte="+id_faculte);
			while(rs.next()) {
				ff = rs.getInt(1);}
		}catch(Exception e){ System.out.println(e);}
		return ff;
	}
	public static Departement get_departement(int id_departement) {
		Connection con = Connections.ready();
		Departement ss=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_departement,nom_departement FROM departement where id_departement="+id_departement);
			while(rs.next()) {
			ss = new Departement(rs.getInt(1),rs.getString(2));}
		}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static int getid_specislite(int id_departement) {
		Connection con = Connections.ready();
		int ss=0;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_specialite FROM departement where id_departement="+id_departement);
			while(rs.next()) {
				ss = rs.getInt(1);}
		}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static Specialite get_specialite(int id_specialite) {
		Connection con = Connections.ready();
		Specialite ss=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_specialite,nom_specialite FROM specialite where id_specialite="+id_specialite);
			while(rs.next()) {
				ss = new Specialite(rs.getInt(1),rs.getString(2));}
			}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static int getid_niveau(int id_specialite) {
		Connection con = Connections.ready();
		int ss=0;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_niveau FROM specialite where id_specialite="+id_specialite);
			while(rs.next()) {
				ss = rs.getInt(1);}
		}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static String get_niveau(int id_niveau) {
		Connection con = Connections.ready();
		String ss=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT nom_niveau FROM niveau where id_niveau="+id_niveau);
			while(rs.next()) {
				ss = rs.getString(1);}
			}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static int getid_formation(int id_specialite) {
		Connection con = Connections.ready();
		int ss=0;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT id_formation FROM specialite where id_specialite="+id_specialite);
			while(rs.next()) {
				ss = rs.getInt(1);}
		}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	public static String get_formation(int id_formation) {
		Connection con = Connections.ready();
		String ss=null;
		try {
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("SELECT type_formation FROM formation where id_formation="+id_formation);
			while(rs.next()) {
				ss = rs.getString(1);}
			}catch(Exception e){ System.out.println(e);}
		return ss;
	}
	
	public static void Add_Niveau(Niveau n) {
		
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO niveau (id_niveau,nom_niveau) VALUES (?,?)");
			prepareStatement.setInt(1, n.id_niveau);
			prepareStatement.setString(2,n.nom_niveau);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
	}
	public static void Add_Formation(Formation f) {
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO formation (id_formation,type_formation) VALUES (?,?)");
			prepareStatement.setInt(1, f.id_formation);
			prepareStatement.setString(2,f.type_formation);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
	}
	public static void Add_Specialite(Specialite s) {
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO specialite (id_specialite,nom_specialite,id_niveau,id_formation) VALUES (?,?,?,?)");
			prepareStatement.setInt(1, s.id_specialite);
			prepareStatement.setString(2, s.nom_specialite);
			prepareStatement.setInt(3, s.niveau.id_niveau);
			prepareStatement.setInt(4, s.formation.id_formation);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
	}
	public static void Add_Departement(Departement d) {
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO departement (id_departement,nom_departement,id_specialite) VALUES (?,?,?)");
			prepareStatement.setInt(1, d.id_departement);
			prepareStatement.setString(2, d.nom_departement);
			prepareStatement.setInt(3, d.sp.id_specialite);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
	}
	public static void Add_Faculte(Faculte f) {
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO faculte (id_faculte,nom_faculte,id_departement) VALUES (?,?,?)");
			prepareStatement.setInt(1, f.id_faculte);
			prepareStatement.setString(2, f.nom_faculte);
			prepareStatement.setInt(3, f.dep.id_departement);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
	}
	public static void Add_Etudiant(Etudiant e) {;
		Connection con = Connections.ready();
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO etudiant (matricule,nom_etudiant,prenom_etudiant,sexe,prenom_pere,nom_mere,prenom_mere,date_naissance,id_faculte,anne_inscription) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,? )");
			prepareStatement.setInt(1, e.matricule);
			prepareStatement.setString(2, e.nom);
			prepareStatement.setString(3, e.prenom);
			prepareStatement.setString(4, e.sexe);
			prepareStatement.setString(5, e.prenom_pere);
			prepareStatement.setString(6, e.nom_mere);
			prepareStatement.setString(7, e.prenom_mere);
			prepareStatement.setString(8, e.date_naissance);
			prepareStatement.setInt(9, e.fac.id_faculte);
			prepareStatement.setInt(10, e.annee_inscription);
			prepareStatement.execute();
		}catch(Exception ex){ System.out.println(ex);}
		}

	}