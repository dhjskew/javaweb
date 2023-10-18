package org.example.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("userName");
        String password = req.getParameter("pwdName");
        HttpSession session = req.getSession(true);
        if(username.equals("admin") && password.equals("111111")){
            req.setAttribute("msg", "登陆成功");
            session.setAttribute("userName",username);
            req.getRequestDispatcher("page2.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("login.html").forward(req, resp);
        }
    }
}
