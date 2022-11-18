package com.hnd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class third extends  HttpServlet {
	
	int count; 
	private ServletConfig config;
	public void init(ServletConfig config) throws ServletException {
		 this.config=config;
		count=0;
		}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		 response.setContentType("text/html");  
//		 count=0;   
		 PrintWriter out = response.getWriter();  
		 ServletContext context= config.getServletContext();
		 Object company = context.getInitParameter("company");
		 String username = config.getInitParameter("username");
		 String password = config.getInitParameter("password");
		 out.println(username);
		 out.println(password);
		 out.println(company);
//		 ServletContext context=getServletContext();  
//		    out.println(context.getInitParameter("company")); 
//		    ServletConfig config=getServletConfig(); 
//		    out.println(config.getInitParameter("username"));
//		    out.println(config.getInitParameter("password"));
		          out.print(count++);
	}

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

