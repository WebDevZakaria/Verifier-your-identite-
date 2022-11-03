package Universite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")

public class AddS extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
       
    public AddS() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	int test=0;
		//int id_niveau=1;
		//int id_niveau = 1,id_formation=1;
		int matricule = Integer.parseInt(request.getParameter("matricule"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date_naissance = request.getParameter("date_naissance");
		String sexe = request.getParameter("sexe");
		String prenom_pere = request.getParameter("prenom_pere");
		String prenom_mere = request.getParameter("prenom_mere");
		String nom_mere = request.getParameter("nom_mere");
		String faculte = request.getParameter("faculte");
		String departement = request.getParameter("departement");
		String specialite= request.getParameter("specialite");
		String niveau = request.getParameter("niveau");
		String formation = request.getParameter("formation");
		int annee_inscription = Integer.parseInt(request.getParameter("annee_inscription"));
		
		//switch(niveau) {case"M2":id_niveau=1;break; case"M1":id_niveau=2;break; case"L3":id_niveau=3;break;}
		//switch(formation) {case"LMD":id_formation=1;break;  default:id_formation=2;}
		//switch(specialite) {case"GL":id_specialite=1;break;case"SI":id_specialite=2;break;case"RSD":id_specialite=3;break;}
		//switch(departement) {case"TLSI":id_departement=1;break;case"IFA":id_departement=2;break;}
		//switch(faculte) {case"NTIC":id_faculte=1;}	*/
		
		
		
		
		
		
		//String ni = request.getParameter("ni");
		//if(ni.equalsIgnoreCase("M1")) {id_n=2;}
		//Etudiant y=new Etudiant(m,n,p,dn,se,pp,pm,nm,new Faculte(id_F,nf,new Departement(id_D,nd,new Specialite(id_S,s,
			//	new Niveau(id_N,ni),new Formation(id_FF,f)))),ai);
		//Etudiant x=Back2.Add_Etudiant(new Etudiant(m,n,p,dn,se,pp,nm,pm,new Faculte(id_F,nf,new Departement(id_D,nd,
				//new Specialite(id_S,s,new Niveau(id_N,ni),new Formation(id_FF,nf)))),ai));
		Niveau nn=new Niveau(matricule,niveau);
		Back2.Add_Niveau(nn);
		Formation ff=new Formation(matricule,formation);
		Back2.Add_Formation(ff);
		//Back2.Add_Formation(ff);
		Specialite ss=new Specialite(matricule,specialite,nn,ff);
		Back2.Add_Specialite(ss);
		Departement dd = new Departement(matricule,departement,ss);
		Back2.Add_Departement(dd);
		Faculte fff=new Faculte(matricule,faculte,dd);
		Back2.Add_Faculte(fff);
		Etudiant z=new Etudiant(matricule,nom,prenom,sexe,date_naissance,prenom_pere,nom_mere,prenom_mere,fff,annee_inscription);
		Back2.Add_Etudiant(z);
		
		//test=Back2.Add_Niveau(n);
		//test=Back2.Add_Etudiant(y);
		//System.out.println(matricule+""+nom+""+prenom+""+sexe+""+date_naissance+""+nom_mere+""+prenom_mere+""+prenom_pere+""+annee_inscription);
		//response.sendRedirect("NewFile.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
