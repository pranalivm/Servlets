package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Getting error in loading descripter 
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html ") ;
			PrintWriter out = response.getWriter();
			
			String uname= request.getParameter("uname") ;
			String upwd= request.getParameter("upwd") ;
			int uage= Integer.parseInt(request.getParameter("uname")) ;
			String uemail = request.getParameter("uemail") ;
			String umobile = request.getParameter("umobile") ; 
			

			out.println("<html>");
			out.println("<h2 style ='color:red;' align='center'>Durga Banking Services </h2> ") ;
			out.println("<h3 style= 'color:blue;' align='center' >User Registration Details</h3> ") ;
			out.println("<table border='1' align='center' bgcolor='cyan' ");
			out.println("<tr><td>User Name </td><td>"+uname+"</td></tr>");
			out.println("<tr><td>USer Password </td><td>"+upwd+"</td></tr>");
			out.println("<tr><td>User Age </td><td>"+uage+"</td></tr>");
			out.println("<tr><td>User Email </td><td>"+uemail+"</td></tr>");
			out.println("<tr><td>User Mobile </td><td>"+umobile+"</td></tr>");
			
			out.println("</table></body></html>");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
