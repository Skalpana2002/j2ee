package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")

public class IndexServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=req.getParameter("myname");
		
		
		//System.out.println("Success"+name);
		
		PrintWriter pw=res.getWriter(); //present in servletResponse
		
		pw.print("<h1>Welcome....."+name+"</h1>"   ); // html tags are allowed inside java program with the help of PW
	
	    String phoneNo=req.getParameter("phone no");
	    String emailID=req.getParameter("email id");
	    String Address=req.getParameter("address");
	    
//	    System.out.println("Welcome"+phoneNo);	   
//	    System.out.println("Welcome"+emailID);
//        System.out.println("Welcome"+Address);
//	    
	    
	    
		pw.print("<h2>Welcome....."+phoneNo+"</h2>");
		pw.print("<h2>Welcome....."+emailID+"</h2>");
		pw.print("<h2>Welcome....."+Address+"</h2>");
	
	}
	

}
