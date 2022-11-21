package com.hnd;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fourth  extends HttpServlet {  
	  
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie cook[] = request.getCookies();  
	    for(int i=0; i<cook.length;i++) {
	    	out.println(cook[i].getName()+"  "+cook[i].getValue());
	    }
 
	  
	    out.close();  
	  
	         }catch(Exception e){System.out.println(e);}  
	    }  
}
