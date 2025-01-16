<%--
  User: Echo-Nie
  Date: 2024/12/9
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include动态包含</title>
</head>
<%--
使用动态包含：
    <jsp:include page="url">
        <jsp:param name="参数名" value="参数值"/>
    </jsp:include>
    注意：name不支持表达式；value支持表达式

    获取参数：
        request.getParameter(name);通过指定参数获取变量名字
--%>
<jsp:include page="05-header.jsp"></jsp:include>
<h2>主体内容</h2>
<%
    int a = 10;
%>
<jsp:include page="05-footer.jsp"></jsp:include>
<%--第一次footer的时候，没有传参，所以取到的是null--%>
<%--动态包含传参--%>
<%
    String str = "hello";
%>
<%--第二次footer的时候传参，所以取到的是admin和hello--%>
<jsp:include page="05-footer.jsp">
    <jsp:param name="uname" value="admin"/>
    <jsp:param name="msg" value="<%=str%>"/>
</jsp:include>


<%--page也不用写死的--%>
<%
String url = "05-footer.jsp";
%>
<jsp:include page="<%=url%>>"></jsp:include>

<body>

</body>
</html>
