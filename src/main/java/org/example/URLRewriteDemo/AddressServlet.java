package org.example.URLRewriteDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/AddressServlet", urlPatterns = { "/address" })
public class AddressServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String[] selectedBooks = request.getParameterValues("buy");
		session.setAttribute("choosed", selectedBooks);
		displayPage(request, response);
	}

	private void displayPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>邮寄地址</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");

		out.println("</head>");
		out.println("<body>");
		out.println("<h2>输入邮寄地址</h2>");
		out.println("<form action='" + response.encodeURL("confirm") + "' method='post'>");
		out.println("<table border='1' width='68%'>");
		
		out.println("<tr>");		
		out.println("<td>姓名：</td>");
		out.println("<td><input type='text' name='customer' size='30'></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>邮寄地址：</td>");
		out.println("<td><input type='text' name='address' size='66'></td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("<p><input type='submit' value='下一步'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
