<%--
  User: Echo-Nie
  Date: 2024/12/10
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP四大域-2</title>
</head>
<body>

<%
  //获取域对象中的值
  out.println("page域："+pageContext.getAttribute("name1")+"</br>");
  out.println("request域："+request.getAttribute("name2")+"</br>");
  out.println("session域："+session.getAttribute("name3")+"</br>");
  out.println("application域："+application.getAttribute("name4")+"</br>");
%>
</body>
</html>
