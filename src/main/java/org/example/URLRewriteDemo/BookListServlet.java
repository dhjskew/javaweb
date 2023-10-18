package org.example.URLRewriteDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/BookListServlet", urlPatterns = {"/bookList"})
public class BookListServlet extends HttpServlet {       
    public BookListServlet() {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		displayPage(request,response);		
	}

	private void displayPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>选择购买书籍</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>选择购买书籍</h2>");
		out.println("<form action='" + response.encodeURL("address") + "' method='post'>");
		out.println("<table border='1' width='68%'>");
		out.println("<tr>");
		out.println("<th align='center'>书名</th>");
		out.println("<th align='center'>购买</th>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Android Application Develoment Practice Tutorial</td>");
		out.println("<td align='center'>");
		out.println("<input type='checkbox' name='buy' value='Android Application Develoment Practice Tutorial'>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Software Project Management</td>");
		out.println("<td align='center'>");
		out.println("<input type='checkbox' name='buy' value='Software Project Management'>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Agile Software Development</td>");
		out.println("<td align='center'>");
		out.println("<input type='checkbox' name='buy' value='Agile Software Development'>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Information Technology Project Management</td>");
		out.println("<td align='center'>");
		out.println("<input type='checkbox' name='buy' value='Information Technology Project Management'>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("<p><input type='submit' value='下一步'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}	
}
