package com.durgasoft.service;

import java.security.AlgorithmParametersSpi;
//import java.beans.Statement;
import java.sql.*;
//import java.=

public class UserService {
	Connection con= null ;
	Statement st = null ;
	ResultSet rs =null ;
	public UserService() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			st = con.createStatement();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String checkLogin(String uname, String upwd) {
		String status ="";
		
		try {
			rs = st.executeQuery("select *  from reg_users where uname='"+uname+"' and upwd='"+upwd+"')");
			boolean b = rs.next(); 
			
			if(b ==true ) {
				status = "success" ;
			}
			else {
				status = "failure" ;
			}
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace() ;
		}
		
		return status;
	}
	
	public String registration(String uname , String upwd, String uemail, String umobile) {
		
		String status="" ;
		
		try {
			rs = st.executeQuery("select * from reg_users where uname='"+uname+"'");
			boolean b = rs.next();
			
			if(b== true) {
				status = "existed" ;
			}
			else {
				int rowCount= st.executeUpdate("insert into reg_users values('"+uname+"'"+upwd+"'"+uemail+"'"+umobile+"')");
				
				if(rowCount == 1 ) {
					status = "success" ;
				}
				else {
					status = "failure" ;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return status ;
	}
}
