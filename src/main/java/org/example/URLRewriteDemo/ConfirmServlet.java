package org.example.URLRewriteDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/ConfirmServlet", urlPatterns = { "/confirm" })
public class ConfirmServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//String customer = request.getParameter("customer");
		String customer = new String(request.getParameter("customer").getBytes("iso-8859-1"));
		//String address = request.getParameter("address");
		String address = new String(request.getParameter("address").getBytes("iso-8859-1"));
		session.setAttribute("A_customer", customer);
		session.setAttribute("A_address", address);		
		displayPage(request, response);
	}

	private void displayPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String[] books = (String[]) session.getAttribute("choosed");
		String customer = (String) session.getAttribute("A_customer");
		String address = (String) session.getAttribute("A_address");
		boolean conditon = (books != null) && (customer != null) && (address != null) && (!customer.equals("")) 
				&& (!address.equals(""));
		if (conditon) {
			System.out.println(conditon);
			System.out.println(!address.equals(""));
			System.out.println("customer=" + customer);
			System.out.println("address=" + address);

			out.println("<html><body>");
			out.println("<h2>订单确认</h2>");
			out.println("<table border=\"1\" width=\"68%\">");
			out.println("<tr>");
			out.println("<td>顾客姓名：</td>");
			out.println("<td>" + customer + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>地址：</td>");
			out.println("<td>" + address + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>订购书籍：</td>");
			out.println("<td>");
			for (int i = 0; i < books.length; i++) {
				out.println(books[i] + "<br>");
			}
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<p><input type=\"submit\" value=\"提交订单\"></p>");
			out.println("</html></body>");
		} else {
			out.println("<html><body>");
			out.println("<h2>无法从HTTP会话内取出所需信息！</h2>");
			out.println("</html></body>");
		}
		
	}

}
