package com.durgasoft.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;

import com.durgasoft.response.MyResponse;


@WebFilter("/hello")
public class MyFilter extends HttpFilter implements Filter {
  
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse hres = (HttpServletResponse )response ;
		MyResponse mres = new MyResponse(hres) ;
		
 		
		chain.doFilter(request, mres);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
