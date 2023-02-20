package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cid = request.getParameter("cid" );
		String cname =request.getParameter("cname") ;
		String caddr = request.getParameter("caddr") ;
		String ctype = request.getParameter("caddr") ;
		String cemail = request.getParameter("cemail" );
		String cmobile = request.getParameter("cmobile") ;
		
		out.println("<html>");
		out.println("<h2 style ='color:red;' align='center'>Durga Banking Services </h2> ") ;
		out.println("<h3 style= 'color:blue;' align='center' >Customer Registration Details</h3> ") ;
		out.println("<table border='1' align='center' ");
		out.println("<tr><td>Customer Id </td><td>"+cid+"</td></tr>");
		out.println("<tr><td>Customer Name </td><td>"+cname+"</td></tr>");
		out.println("<tr><td>Customer Address </td><td>"+caddr+"</td></tr>");
		out.println("<tr><td>Customer Type</td><td>"+ctype+"</td></tr>");
		out.println("<tr><td>Customer   Email </td><td>"+cemail+"</td></tr>");
		out.println("<tr><td>Customer   Mobile Number  </td><td>"+cmobile+"</td></tr>");
		out.println("</table></body></html>");
		
	}

}
