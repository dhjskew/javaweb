# Servlet跳转

1.创建web项目。File-》New-》Dynamic Web Project-》输入项目名称ServletDemo2-》点击Finish按钮。

2.在工作区WebContent文件夹下创建页面form.html, page2.jsp。右键WebContent-》New-》修改文件名为page2.jsp-》点击Finish按钮。-》在body标签中加入

```
<h1>这是page2.jsp</h1>
<%=request.getParameter("username") %>,<%=request.getAttribute("msg") %>
```

3.创建Servlet处理表单数据。展开工作区代码文件夹Java Resource-》右键src文件夹-》New-》Servlet-》输入包名cn.edu.lntu-》输入类名FormServlet-》点击Next按钮，可以在URL Mappings区域内看到默认的访问该Servlet的url地址后缀，默认url后缀即为Servlet名，建议此处不要修改。-》点击Next按钮，可以看到doGet和doPost方法已经被默认被勾选，意味着eclipse创建Servlet代码时自动生成doGet和doPost方法代码框架。-》点击Finish按钮。

4.重写doPost方法完成页面的请求转发。删除掉原有的doGet(request, response);语句，添加自己编写的代码。

```
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		request.setAttribute("msg", "注册成功");
		request.getRequestDispatcher("page2.jsp").forward(request, response);
	}

```

注：方法最开始的两行语句response.setContentType("text/html;charset=UTF-8");和request.setCharacterEncoding("utf-8");是固定写法，用于解决Servlet在接收和响应页面数据默认按照英文编码解析而导致的乱码问题。request.getRequestDispatcher("page2.jsp")返回的是请求跳转对象RequestDispatcher，该对象里封装了跳转地址"page2.jsp"，RequestDispatcher默认会到网站根目录去找这个页面。请求转发是一种发生在服务器端的带数据跳转。

5.在form.html中更改<form>标签的action属性值，该值要设置为=="/项目名/servlet名"==的格式，此例为"/ServletDemo2/FormServlet"，注意值的字母大小写和项目名与servlet名大小写要一致。

6.运行程序。在工作区右键form.html-》Run As-》Run on Server-》点击Finish按钮。

7.修改doPost方法完成页面的重定向。

```
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
//		request.setAttribute("msg", "注册成功");
//		request.getRequestDispatcher("page2.jsp").forward(request, response);
		response.sendRedirect("page2.jsp");
	}
```

注：response.sendRedirect("page2.jsp");也会默认到网站根目录下去寻找page2.jsp。重定向实质通过浏览器发了两次请求，第一次请求里包含的表单数据被web服务器丢弃。第二次发出的请求不携带第一次请求的数据。

8.运行程序。在工作区右键form.html-》Run As-》Run on Server-》点击Finish按钮。



