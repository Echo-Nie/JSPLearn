<%@ page import="com.ynu.po.User" %><%--
  User: Echo-Nie
  Date: 2024/12/12
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL的使用</title>
    <%--
        首先拷贝两个jar包到web-INF的lib目录下；再导入jst和standard的jar包到项目中
    --%>
</head>
<body>
<c:if test="${1==1}">
    Hello JSTL
</c:if>
<%
    request.setAttribute("num", 10);
    request.setAttribute("num1", 10);
%>


<c:if test="${num>0}">
    数据大于0
</c:if>

<br>
<c:if test="${num>100}" var="flag" scope="request"></c:if>
${flag}--${pageScope.flag}${requestScope.flag}--${sessionScope.flag}

<c:if test="${num1>20}" var="flag1" scope="request"></c:if>
${flag1}--${requestScope.flag1}--${sessionScope.flag1}
<%--    false--false--  --%>
<%--
    test条件判断，操作的是域对象，接受返回结果是boolean类型的值
    var是限域对象，存放在作用域中的变量名，用来接受判断结果的值
    scope是限域变量名的范围，page-request-session-application
--%>

<%--         Choose-When-Otherwise                                        --%>
<%
    request.setAttribute("TestChoose", 70);
%>
<c:choose>
    <c:when test="${TestChoose<60}">
        <h1>TestChoose小于60</h1>
    </c:when>
    <c:when test="${TestChoose==60}">
        <h1>TestChoose等于60</h1>
    </c:when>
    <c:when test="${TestChoose>60&&Tes<=70}">
        <h1>TestChoose在60-70之间</h1>
    </c:when>
    <c:otherwise>
        <h1>TestChoose大于70了</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
