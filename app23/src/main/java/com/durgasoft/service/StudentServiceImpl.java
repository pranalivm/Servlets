package com.durgasoft.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.durgasoft.beans.Student;
import com.durgasoft.factory.ConnectionFactory;

public class StudentServiceImpl implements StudentService{
	Connection con;
	Statement st;
	ResultSet rs ;
	
	
	public StudentServiceImpl() {
//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
//			st = con.createStatement();
//			
//		} catch(Exception e) {
//			e.printStackTrace() ;
//			
//		}
//		
	}
	
	public void addStudent(Student std) {
		try {
			Connection con = ConnectionFactory.getConnection() ;
			Statement st = con.createStatement() ;
			st.executeUpdate("insert into student values(')"+std.getSid()+"','"+std.getSname()+"','"+std.getSaddr()+"')");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Student> getAllStudents() {
		List<Student> stdList = null ;
		try {
			 rs = st.executeQuery("select * from student ");
			 stdList =new ArrayList<Student>() ;
			 
			 while(rs.next()) {
				 Student std= new Student() ;
				 std.setSid(rs.getString("sid"));
				 std.setSname(rs.getString("sname"));
				 std.setSaddr(rs.getString("saddr"));
				 
				 stdList.add(std) ;
			 }
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return stdList ;
	}

}
