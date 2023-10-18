package org.example.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/wo")
public class test01 extends HttpServlet {
    String message;
    @Override
    public void init() throws ServletException {
        message="baai";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Enumeration<String> headerNames = req.getHeaderNames();
        PrintWriter out = resp.getWriter();
        while (headerNames.hasMoreElements()) {
            String paramName = headerNames.nextElement();
            String paramValue = req.getHeader(paramName);
            out.println("<h1>" + paramName +"  :::"+ paramValue + "</h1>" + "<br>");
        }
    }

    @Override
    public void destroy() {

    }
}
