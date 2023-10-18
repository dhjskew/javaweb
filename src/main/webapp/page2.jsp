<%--
  Created by IntelliJ IDEA.
  User: 21279
  Date: 2023/9/11
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

    <h1>adhjhsdu</h1>
        <% if (request.getParameter("userName")!=null) { %>
        <%= request.getParameter("userName") %>
        <%= session.getAttribute("userName")%>
        <%= request.getParameter("msg") %>
        <% } else { %>

        <% } %>

    </body>
</html>