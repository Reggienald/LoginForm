package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Bean;


@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		
		
		Bean b = new Bean(uname, pword);
		
		if(b.getName().equals("unknown") && b.getPassword().equals("unknown")) {
			response.sendRedirect("login.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(20);			
			session.setAttribute("Checked-in", "true");
			session.setAttribute("username", b.getName());
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}