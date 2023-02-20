package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.durgasoft.beans.Student;
import com.durgasoft.factory.ConnectionFactory;
import com.durgasoft.factory.StudentServiceFactory;
import com.durgasoft.service.StudentService;



//Data not getting displayed in table , data didnt got added in db

@WebServlet("/add")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName("com.durgasoft.factory.ConnectionFactory");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String saddr = request.getParameter("saddr");
		
		Student std = null;
		
		StudentService stdService=  StudentServiceFactory.getStudentService();
		stdService.addStudent(std);
		
		List<Student> stdList = stdService.getAllStudents();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red; align='center'>Durga Software Solutions");
		out.println("<h3 style='color:blue ;' align='center'> Students Details </h3>");
		out.println("<table align='center' border='1' bgcolor='pink'>");
		out.println("<tr><th>sid</th> <th>sname</th> <th>saddr</th>");
		
		for(Student s:stdList) {
			out.println("<tr>");
			out.println("<td>"+s.getSid()+"</td>");
			out.println("<td>"+s.getSname()+"</td>");
			out.println("<td>"+s.getSaddr()+"</td>");
			out.println("</tr>");
			
		}
		
		out.println("</table></body></html>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/std_add_form.html") ;
		requestDispatcher.include(request, response);
		
		
		}
	
		@Override
		public void destroy() {
			ConnectionFactory.cleanUp() ;
		}

}
