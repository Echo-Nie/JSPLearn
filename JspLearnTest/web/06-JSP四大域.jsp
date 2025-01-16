<%--
  User: Echo-Nie
  Date: 2024/12/10
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP四大域</title>
</head>
<body>

<%
    /*page*/
//    本页面取得服务器跳转<jsp :forward>后无效
    pageContext.setAttribute("name1","zhangsan");

    /*request*/
//    服务器跳转有效，客户端跳转无效。
    request.setAttribute("name2","lisi");

    /*session*/
//    如果重新开新的浏览器，则无法取得之前设置的session
    session.setAttribute("name3","wangwu");

    /*application*/
//    服务器重启了，则无法取得了
    application.setAttribute("name4","liumazi");
%>

<%--JSP服务器跳转--%>
<%--<jsp:forward page="06-JSP四大域-2.jsp"></jsp:forward>--%>

<%--超链接跳转--%>
<a href="06-JSP四大域-2.jsp">跳转</a>
</body>
</html>
