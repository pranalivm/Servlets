package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//welcome.html is somewhere else 

@WebServlet("/hutch")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h3 align='center' >");
//		out.println("To get services from Hutch<br>");
//		out.println("Click on <br>");
//		out.println("<a href='http://localhost:1010/vodafoneapp/welcome.html>|CC@vodafonr.com|</a>'");
//		out.println("</h3></body></html>");
		
		
		response.sendRedirect("http://localhost:1010/vodafoneapp/welcome.html");
		
	}

}
