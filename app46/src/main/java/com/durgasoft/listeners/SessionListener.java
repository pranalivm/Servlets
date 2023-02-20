package com.durgasoft.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

   
  
	
    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("Session created...");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	  System.out.println("Session destroyed...");
    }

	
    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	   System.out.println("Attribute added["+event.getName()+","+event.getValue()+"]");
    }

	
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    	System.out.println("Attribute removed["+event.getName()+","+event.getValue()+"]");
    }

	
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    	System.out.println("Attribute replaced ["+event.getName()+","+event.getValue()+"]");
    }
    
	
}
