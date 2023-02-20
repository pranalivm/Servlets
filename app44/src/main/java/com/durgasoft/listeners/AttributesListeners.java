package com.durgasoft.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AttributesListeners implements ServletRequestAttributeListener {

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
        System.out.println("Attribute removed ["+srae.getName()+" ,"+srae.getValue()+"]" ) ;
        
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
        
    	System.out.println("Attribute added ["+srae.getName()+", "+srae.getValue()+"]");
    	
    }


    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         
    	System.out.println("Attribute replaced ["+srae.getName()+","+srae.getValue()+"]");
   }
	
}
