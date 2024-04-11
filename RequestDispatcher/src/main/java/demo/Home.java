package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/home")
public class Home extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username= req.getParameter("myname");
		
		PrintWriter pw =res.getWriter();
		pw.println("login succesfull ");
		pw.print("welcome "+username);
		
	}

}
