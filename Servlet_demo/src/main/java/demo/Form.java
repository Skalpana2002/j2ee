package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/form")
public class Form extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("myname");
		String phone = req.getParameter("number");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		
		
		PrintWriter pw = res.getWriter();
		pw.print("<h1>welcome "+name+"</h1>");
		pw.print("welcome "+phone);
		pw.print("welcome "+email);
		pw.print("welcome "+address);
	}

}
