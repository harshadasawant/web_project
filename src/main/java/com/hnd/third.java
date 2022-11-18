package com.hnd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class third extends  HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
	 try{  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    //creating submit button  
//		    out.print("<form action='fourth' method='post'>");  
//		    out.print("<input type='submit' value='Submit'>");  
//		    out.print("</form>");  
//		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }  
}

