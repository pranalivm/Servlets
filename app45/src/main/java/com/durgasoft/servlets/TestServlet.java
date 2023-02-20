package com.durgasoft.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("<h1>TestServlet with ServletContext Listener </h1>");
		ServletContext context = getServletContext() ;
		
		context.setAttribute("A", "AAA");
		context.setAttribute("B","BBB") ;
		context.setAttribute("C", "CCC");
		context.setAttribute("B","XXX") ;
		context.removeAttribute("C") ;
	}

}
