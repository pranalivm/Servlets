package com.durgasoft.listener;

//import java.awt.Event;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    
    public void attributeAdded(ServletContextAttributeEvent event)  { 
        System.out.println("Attribute added ["+event.getName()+","+event.getValue()+"]");
    }


    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    	 System.out.println("Attribute removed ["+event.getName()+","+event.getValue()+"]");
    }

    public void contextDestroyed(ServletContextEvent event)  { 
    	 System.out.println("Context Object Destroyed....");
    }

    public void attributeReplaced(ServletContextAttributeEvent event)  { 
         
    	 System.out.println("Attribute replaced  ["+event.getName()+","+event.getValue()+"]");
    }

    public void contextInitialized(ServletContextEvent event)  { 
    	 System.out.println("Context Object Created .... ");
    }
	
}
