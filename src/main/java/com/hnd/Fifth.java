package com.hnd;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class Fifth extends HttpServlet {  
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
	        try{  
	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        HttpSession session=request.getSession();  
	        session.setAttribute("sname",n);  
//	        session.invalidate();
	        out.print("<a href='sixth'>visit</a>");  
	                  
	        out.close();  
	  
	                }catch(Exception e){System.out.println(e);}  
	    }  
	  
}
