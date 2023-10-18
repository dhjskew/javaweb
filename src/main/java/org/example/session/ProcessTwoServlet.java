package org.example.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProcessTwoServlet", urlPatterns = { "/ProcessTwo" })
public class ProcessTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcessTwoServlet() {
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
		//String customer = request.getParameter("customer");
		String customer = new String(request.getParameter("customer").getBytes("iso-8859-1"));
		//String address = request.getParameter("address");
		String address = new String(request.getParameter("address").getBytes("iso-8859-1"));
		session.setAttribute("A_customer", customer);
		session.setAttribute("A_address", address);
		//response.sendRedirect("Confirm");
		request.getRequestDispatcher("confirm.jsp").forward(request, response);
	}

}
