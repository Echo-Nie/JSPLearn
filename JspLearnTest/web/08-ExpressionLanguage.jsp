<%--
  User: Echo-Nie
  Date: 2024/12/10
  Time: 16:11
  To change this template use File | Settings | File Templates.
  Description：
  EL表达式
    作用:简化JSP代码
    格式:
        ${域对象的名称}
    操作对象:
        EL表达式一般操作的是域对象，不能操作局部变量。
    操作范围:
        page范围在当前页面
        request范围在一次请求
        session范围在一次会话
        application范围在整个应用程序
     可通过pageScope、
     PS：如果EL表达式获取的域对象值为空，默认是空串；
     EL表达式默认从小到大的范围去找，找到即可，如果四个范围都没找到，显示空字符串。
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
<%--设置数据--%>
<%
    pageContext.setAttribute("uname", "zs");
    request.setAttribute("uname", "ls");
    session.setAttribute("uname", "ww");
    application.setAttribute("uname", "zl");

//    局部变量
    String str = "hello";
%>
<%--获取数据--%>
获取局部变量：${str} </br>
获取域对象：${uname}<br>

<%--
输出如下：
获取局部变量：
获取域对象：zs
--%>

<%--获取指定域的数据--%>
<br>获取指定域的数据：<br>
&nbsp;&nbsp;page域数据：${pageScope.uname}<br>
&nbsp;&nbsp;request域数据：${requestScope.uname}<br>
&nbsp;&nbsp;session域数据：${sessionScope.uname}<br>
&nbsp;&nbsp;application域数据：${applicationScope.uname}<br>
</body>
</html>
