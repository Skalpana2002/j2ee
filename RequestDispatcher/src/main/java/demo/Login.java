package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("myname");
		String password=req.getParameter("mypass");
		
		if(username.equals("ram") && (password.equals("123")))
		{
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req,  res);
		}
		else
		{
			res.setContentType("text/html");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			PrintWriter pw = res.getWriter();
			pw.print("incorrect password or username");
			rd.include(req, res);
		}
	}

}
