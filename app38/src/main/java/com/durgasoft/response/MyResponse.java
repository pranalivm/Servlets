package com.durgasoft.response;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper{
	
	HttpServletResponse response ; 
	
	public MyResponse(HttpServletResponse response) {
		super(response) ;
		this.response = response ;
		
		
	}
	
	@Override 
	public void setContentType(String type ) {
		
		if(! type.equals("text/html")) {
			type = "text/html " ;
		}
		
		response.setContentType(type) ;
	}
	
}
