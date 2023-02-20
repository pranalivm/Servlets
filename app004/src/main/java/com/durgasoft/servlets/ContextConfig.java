package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;


public class ContextConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response)throws ServletException , IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext() ;
		String lname = context.getServletContextName();
		
		String driverClass = context.getInitParameter("driverClass") ;
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username"); 
		String password = context.getInitParameter("password") ;
		
		Enumeration e = context.getInitParameterNames() ;
		String paramNames = "" ;
		
		while(e.hasMoreElements()) {
			
			paramNames= paramNames + e.nextElement() + "<br>" ;
 		}
		
		context.setAttribute("cid", "C-111") ;
		context.setAttribute("cname", "Java");
		context.setAttribute("ccost", 100000) ;
		
		String cid =(String)context.getAttribute("cid") ;
		String cname = (String)context.getAttribute("cname") ;
		int ccost = (Integer) context.getAttribute("ccost") ;
		
		e= context.getAttributeNames();
		
		String attrNames ="" ;
		
		while(e.hasMoreElements()) {
			attrNames = attrNames + e.nextElement() + "<br>" ;
			
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
		
		out.println("Course id: "+cid+"<br>");
		out.println("Course name: "+cname+"<br>");
		out.println("Course cost: "+ccost+"<br>"); 
		out.println("Attributes names: "+ccost+"<br>") ;
		out.println(attrNames);
		out.println("</h2></body></html>");
	}

}
