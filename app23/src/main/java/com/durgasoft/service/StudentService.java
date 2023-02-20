package com.durgasoft.service;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List; 
import com.durgasoft.beans.Student  ;

public interface StudentService {
	
	public void addStudent(Student std) ;
		
	
	public List<Student> getAllStudents() {
		
	}
}
