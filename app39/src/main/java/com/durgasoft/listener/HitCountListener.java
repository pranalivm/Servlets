package com.durgasoft.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class HitCountListener implements ServletRequestListener {
	int count =0 ;

    public void requestDestroyed(ServletRequestEvent sre)  { 
         System.out.println("Request Destroyed");
    }

    public void requestInitialized(ServletRequestEvent event)  { 
    	count = count + 1 ;
    	event.getServletContext().setAttribute("count", count);
    	System.out.println("Request created ...") ;
    }
	
}
