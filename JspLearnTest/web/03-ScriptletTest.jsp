<%--
  Created by IntelliJ IDEA.
  User: Echo-Nie
  Date: 2024/12/9
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet</title>
</head>
<body>
<%--第一种：<%	%>：Java脚本段，可以定义局部变量，编写语句。--%>
<%--生成的代码在servlet的service方法体中--%>
<%
    String s = "hello";
//    将s输出到控制台
//    System.out.println(s);
    out.print(s);//将s输出到浏览器
    out.write("---");
    out.print("输出全局变量：num="+num);
    out.write("---");
%>

<%--第二种：<%!	%>：可以定义全局变量，方法，类。--%>
<%--生成的代码在servlet的类体中--%>
<%!
    //声明全局变量
    int num = 0;
    //没有sout
%>

<%--    第三种：<%=	%>：表达式，数据一个变量或者具体内容。    --%>
<%--    生成的代码在servlet的service方法体中，相当于out.print()    --%>
<%= s %>

</body>
</html>
