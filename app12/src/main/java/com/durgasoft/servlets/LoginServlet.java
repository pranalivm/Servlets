package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd") ;
		
		out.println("<html>");
		out.println("<body>");
		out.println("<br><br>");
		out.println("<h2 style= 'color:red;' align:'center'");
		
		if(uname.equals("durga") && upwd.equals("durga")) {  //it is not showing on web browser
			out.println("User login success") ;
		}
		else {
			out.println("User login Failure");
		}
		
		out.println("</h2>");
	
		out.println("<h3 align='center '>");
		out.println("<a href= './loginform.html'> |Login Page | </a>");
		out.println("</body></html>");
		
		
	}

}
