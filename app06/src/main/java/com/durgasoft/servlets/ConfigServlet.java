package com.durgasoft.servlets;

import java.io.*;
import java.util.* ;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;

// not giving output



public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException , IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig() ;
		
		String lname = config.getServletName();
		String driverClass = config.getInitParameter("driverClass") ;
		String url = config.getInitParameter("url") ;
		String username = config.getInitParameter("username") ;
		String password = config.getInitParameter("password") ;
		
		Enumeration e = config.getInitParameterNames() ;
		String paramNames = "" ;
		
		while(e.hasMoreElements()) {
			paramNames = paramNames + e.nextElement()  + "<br" ;
			
			
		}
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2");
		out.println("Logical name: "+lname+"<br>");
		out.println("Driver class: "+driverClass+"<br>");
		out.println("Driver URL: "+url+"<br>");
		out.println("Username: "+username+"<br>");
		out.println("Password: "+password+"<br>");
		out.println("Initialization parameter Names: <br>");
		out.println(paramNames);
		out.println("</h2></body></html>");
	}
}
