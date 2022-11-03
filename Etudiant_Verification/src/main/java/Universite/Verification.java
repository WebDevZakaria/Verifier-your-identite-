package Universite;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Verification")
public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Verification() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mat = Integer.parseInt(request.getParameter("matricule"));
		String ee = null;
		Etudiant x =Back2.getinfoe(mat);
		int id_fac=Back2.get_id_faculte(mat);
		Faculte fx=Back2.get_faculte(id_fac);
		int id_dep=Back2.get_id_departement(id_fac);
		Departement dx=Back2.get_departement(id_dep);
		int id_sp=Back2.getid_specislite(id_dep);
		Specialite sx=Back2.get_specialite(id_sp);
		int id_niv=Back2.getid_niveau(id_sp);
		String nx=Back2.get_niveau(id_niv);
		int id_for=Back2.getid_formation(id_sp);
		String tfx=Back2.get_formation(id_for);
		if(x == null) {
			ee= "Non Existe";
			}
		else{
			ee="nom:"+x.nom+"\n"+"prenom:"+x.prenom+"\n"+"sexe:"+x.sexe+"\n"+"data_naissance:"+x.date_naissance+"\n"
					+"date_inscription:"+x.annee_inscription+"\n"+"faculte:"+fx.nom_faculte+"\n"
					+"departement:"+dx.nom_departement+"\n"+"specialite:"+sx.nom_specialite+"\n"
					+"niveau:"+nx+"\n"+"formation:"+tfx;
			}
		response.getWriter().append(ee);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
