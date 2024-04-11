package Httpservlet;

import java.io.IOException;
import java.io.PrintWriter;l,

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/text")
public class Text extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("name");
		String password = req.getParameter("psw");
		
		if(name.equals("ram") && (password.equals("123")))
		{
			resp.sendRedirect("home.html");
		}
		else
		{
			resp.setContentType("text/html");
			RequestDispatcher rd = req.getRequestDispatcher("text.html");
			PrintWriter pw = resp.getWriter();
			pw.print("incorrect password or username");
			rd.include(req, resp);
		}
	}

}
