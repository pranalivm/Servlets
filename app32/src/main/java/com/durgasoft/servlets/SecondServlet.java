package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html") ;
		PrintWriter out = response.getWriter();
		
		String cid = request.getParameter("cid") ;
		String cname = request.getParameter("cname");
		String caddr = request.getParameter("caddr");
		String ctype= request.getParameter("ctype") ;
		
				
		
		out.println("<html>" ) ;
		out.println("<h2 style ='color:red;' align='center'>Durga Banking Services </h2> ") ;
		out.println("<h3 style= 'color:blue;' align='center' >Customer Registration Form</h3> ") ;
		out.println("<form method='POST' action='./display' ");
		out.println("<table align='center' > ");
		out.println("<tr><td>Customer Email </td><td><input type='text' name='cemail' /></td></tr><br>");
		out.println("<tr><td>Customer Mobile </td><td><input type='text' name='cmobile' /></td></tr><br>");
		out.println("<tr><td><input type= 'submit ' value='Display' /></td></tr>");
		out.println("<input type='hidden' name='cid' value=' "+cid+"'/>");
		out.println("<input type = 'hidden' name='cname' value='"+cname+"'/>");
		out.println("<input type='hidden' name='caddr' value=' "+caddr+"'/>");
		out.println("<input type = 'hidden' name='ctype' value='"+ctype+"'/>");
		out.println("<tr><td><input type='submit' value='Display' /></td></tr>");
		out.println("</table></form></body></html>");
	}

}
