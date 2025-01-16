<%--
  User: Echo-Nie
  Date: 2024/12/10
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login页面-简易版</title>
</head>
<body>
<%--action就是执行的行为，执行loginServlet这个行为--%>
<form action="loginServlet" method="post">
    姓名：<input type="text" name="uname"></br>
    密码：<input type="text" name="upwd"></br>
    <button>登录</button>
    <%--获取后台设置在作用域中的数据并且显示--%>
    <span style="color: dodgerblue;font-size: 12px"><%=request.getAttribute("msg")%></span>
</form>
</body>
</html>
