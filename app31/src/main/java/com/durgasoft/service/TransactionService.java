package com.durgasoft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionService {
	
	Connection con;
	Statement st;
	
	public TransactionService() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			st = con.createStatement();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int deposit(String accNo , int depAmt) {
		
		int totalAmt = 0 ;
		try {
			int rowCount= st.executeUpdate("update account set balance = balance + "+depAmt+" where accno = '"+accNo+"'");
			ResultSet rs = st.executeQuery("select * from account where accno ='"+accNo+"'");
			rs.next();
			
			totalAmt = rs.getInt("balance") ;
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return totalAmt ;
	}
	
}
