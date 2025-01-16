<%--
  Created by IntelliJ IDEA.
  User: Echo-Nie
  Date: 2024/12/9
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include</title>
    <%--
        include静态包含：<%@include file="05-header.jsp" %>
        特点：
        1、将内容进行直接替换
        2、静态包含只会生成一个源码文件，最终内容均在jspService方法中
        3、因为是一个源码文件，所以不能出现同名变量
        4、运行效率高一点，但是耦合高不灵活
    --%>
</head>
<body>
<%@include file="05-header.jsp" %>
<h2>主体部分</h2>
<%
    int num = 10;
    out.print(num);
%>
<%@include file="05-footer.jsp" %>
</body>
</html>
