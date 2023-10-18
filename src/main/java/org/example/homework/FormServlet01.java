package org.example.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/FormServlet01")
public class FormServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // 设置响应到客户端MIME类型和字符编码方式
        resp.setContentType("text/html;charset=UTF-8");

        // 设置request对象的解码方式
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String home = req.getParameter("home");
        String info = req.getParameter("info");


        // 获取输出流
        PrintWriter out = resp.getWriter();
        out.println("<p>用户名：" + username + "</p>");
        out.println("<p>密码：" + password + "</p>");
        out.println("<p>性别：" + sex + "</p>");
        out.println("<p>家乡：" + home + "</p>");
        out.println("<p>爱好：");

        // 获取参数名为“hobby”的值
        String[] hobbys = req.getParameterValues("hobby");
        for (int i = 0; i < hobbys.length; i++) {
            if (i < hobbys.length - 1)
                out.println(hobbys[i] + "，");
            else
                out.println(hobbys[i] + "");
        }
        out.println("</p>");
        out.println("<p>自我介绍：" + info + "</p>");
        out.close();
    }
}
