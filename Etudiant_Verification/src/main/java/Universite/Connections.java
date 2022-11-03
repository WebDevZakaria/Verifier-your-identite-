
package Universite;

import java.sql.*;  

class Connections{
Connection con=null;
public Connections(){  
}
public static Connection ready() {
	Connection con=null;
	try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		String dbURL1 = "jdbc:oracle:thin:khaledd/1999@localhost:1521:xe";
		con = DriverManager.getConnection(dbURL1);
		}catch(Exception e){ System.out.println(e);}
	return con;
}
}  