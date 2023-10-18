package org.example.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProcessOneServlet", urlPatterns = { "/ProcessOne" })
public class ProcessOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcessOneServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String[] selectedBooks = request.getParameterValues("buy");		
		session.setAttribute("choosed", selectedBooks);
		response.sendRedirect("./address.jsp");
	}

}
