package com.durgasoft.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.durgasoft.beans.Student;
public class StudentService {
	
	Connection con= null ;
	Statement st = null ;
	ResultSet rs = null ;
	
	public StudentService() {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe","system","root");
			st = con.createStatement() ;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Student getStudent(String sid) {
		
		Student std=null ;
		try {
			rs = st.executeQuery("select * from student where sid = '"+sid+"'"); 
			boolean b= rs.next();
			
			if(b==true) {
				std = new Student() ;
				std.setSid(rs.getString("sid"));
				std.setSname(rs.getString("sname"));
				std.setSaddr(rs.getString("saddr"));
				
			} else {
				std = null ;
			}
			
		} catch(Exception e) {
			e.printStackTrace() ;
			
		}
		return std;
		
	}

	public String  updateStudent(Student std) {
		
		String status ="" ;
		try {
			int rowCount = st.executeUpdate("update student set sname='"+std.getSname()+"',saddr='"+std.getSaddr()+"' where sid='"+std.getSid()+"'");
			if(rowCount == 1) {
				status ="success" ;
			} else {
				status ="failure" ;
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return status ;
		
	}
}















