

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.* ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/welcome" }, 
		initParams = { 
				@WebInitParam(name = "b", value = "BBB"), 
				@WebInitParam(name = "a", value = "AAA")
		})
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet loading") ;
	}

	public WelcomeServlet() {
		System.out.println("Servlet Instantiation") ;
	}
	
	@Override
	public void init() throws ServletException
	{
		System.out.println("Servlet Initialization") ;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter() ;
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Welcome to annotations in Servlets<br>");
		out.println("Logical name: "+config.getServletName()+"<br>") ;
		out.println("a---->"+config.getInitParameter("a")+"<br>");
		out.println("b---->"+config.getInitParameter("b")+"<br>");
		out.println("</h1></body></html>");
		}
	
	//getting compilation error
	
	@Override
	public void destroy() {
		System.out.println("Servlet Deinstantiation") ;
	}


}
