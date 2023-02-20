package com.durgasoft.factory;

import com.durgasoft.service.StudentService;
import com.durgasoft.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static StudentService stdService ; 
	
	static {
		stdService = new StudentServiceImpl() ;
	}
	
	public static StudentService getStudentService() {
		return stdService;
		
	}
}
