<%--
  Created by IntelliJ IDEA.
  User: 21279
  Date: 2023/9/24
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>订单确认</h1><br>
    <table>
        <tbody>
        <tr>
            <td>顾客姓名:</td>
            <td><%= session.getAttribute("A_customer")%></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><%=session.getAttribute("A_address")%></td>
        </tr>
        <tr>
            <td>订购书籍:</td>
            <td>
                <%String[] choosed = (String[]) session.getAttribute("choosed");%>
                <%for (int i = 0; i < choosed.length; i++){ %>
                <%= choosed[i]%><br>
                <%}%>
            </td>
        </tbody>
    </table>

</body>
</html>
