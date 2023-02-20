package com.durgasoft.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper{
	
	HttpServletRequest request ;
	
	public MyRequest(HttpServletRequest request ) {
		super(request) ;
		this.request = request; 
		
	
	}
	
	@Override
	public String getParameter(String name) {
		String val ="" ;
		
		val = request.getParameter(name) ;
		
		if(name.equals("uemail")) {
			
			if(!val.endsWith("@durgasoft.com")) {
				val = val + "@durgasoft.com" ;
			}
		}
		
		return val ;
	}

}
