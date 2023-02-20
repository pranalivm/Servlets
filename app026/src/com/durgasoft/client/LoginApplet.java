package com.durgasoft.client;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.net.URLConnection;
import java.net.URLConnection;

import javax.print.DocFlavor.URL;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class LoginApplet extends Applet implements ActionListener {
	
	Label l1, l2 ;
	TextField tf1, tf2 ;
	Button b ;
	String data="" ;
	
	@Override 
	public void init() {
		this.setSize(500,500);
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout());
		
		l1 = new Label("User name") ;
		l2 = new Label("Password") ;
		tf1 = new TextField(15 ) ;
		tf2 = new TextField(15) ;
		tf2.setEchoChar('*');
		
		b = new Button("Login") ;
		b.addActionListener(this);
		
		Font f = new Font("consolas", Font.BOLD, 20) ;
		
		l1.setFont(f) ;
		l2.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		b.setFont(f);
		
		this.add(l1);
		this.add(l2) ;
		this.add(tf1) ;
		this.add(tf2) ;
		this.add(b) ;

	}

	@Override
	public void actionPerformed(ActionEvent a0) {
		
		try {
			String uname = tf1.getText();
			String upwd = tf2.getText();
			URL url = new URL("http://localhost:1010/app25/login?uname="+uname+"&upwd="+upwd);
			URLConnection uc = ((Object) url).openConnection() ; //ERROR
			uc.setDoInput(true) ;
			uc.setDoOutput(true) ;
			
			InputStream is = uc.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(is)) ;
			data = br.readLine() ;
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		Font f = new Font("consolas", Font.BOLD, 35) ;
		g.setFont(f);
		g.drawString("status: "+data, 50, 200) ;
	}
	
}
