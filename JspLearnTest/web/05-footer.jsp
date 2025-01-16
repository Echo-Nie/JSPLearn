<%--
  Created by IntelliJ IDEA.
  User: Echo-Nie
  Date: 2024/12/9
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Footer底部</title>
</head>
<body>
<%
    int num = 11;

    //获取动态包含传递的参数
    String uname = request.getParameter("uname");
    String msg = request.getParameter("msg");
    out.print(uname+" "+msg);
%>
-------------<br>
这是尾部<br>
-------------<br>
</body>
</html>
