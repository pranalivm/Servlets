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
import javax.servlet.http.HttpServletRequest;

import com.durgasoft.request.MyRequest;


@WebFilter("/reg")
public class MyFilter extends HttpFilter implements Filter {
    
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest hreq = (HttpServletRequest) request ;
		MyRequest mreq = new MyRequest(hreq) ;
		chain.doFilter(mreq, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
			}

}
