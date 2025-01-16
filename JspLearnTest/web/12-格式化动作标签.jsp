<%@ page import="java.util.Date" %><%--
  User: Echo-Nie
  Date: 2025/1/17
  Time: 0:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:formatNumber value="10" type="currency" var="num"/> ${num} <br>
<fmt:formatNumber value="10" type="percent" /><br>
<fmt:formatNumber value="10" type="currency" /><br>
<%--设置时区--%>
<fmt:setLocale value="en_US"/>
<fmt:formatNumber value="10" type="currency"/>
<br><br><br>
<%--格式化日期--%>
<%
    request.setAttribute("myDate",new Date());
%>
${myDate} <br>
<fmt:formatDate value="${myDate}"/> <br>
<fmt:formatDate value="${myDate}" type="date"/> <br>
<fmt:formatDate value="${myDate}" type="time"/> <br>
<fmt:formatDate value="${myDate}" type="both"/> <br>
<fmt:formatDate value="${myDate}" type="both"/> <br>
<fmt:formatDate value="${myDate}" type="both" dateStyle="FULL"/> <br>
<fmt:formatDate value="${myDate}" type="both" dateStyle="short"/> <br>
<fmt:formatDate value="${myDate}" pattern="yyyy-MM-dd"/> <br>

<%--parseNumber的使用--%>
<%--<fmt:setLocale value="zh_CN"/>--%>
<%--转换回中国时区，就可以用￥--%>
<fmt:parseNumber value="100"/><br>
<fmt:parseNumber value="100" type="number"/><br>
<fmt:parseNumber value="100%" type="percent"/><br>
<fmt:parseNumber value="$10.00" type="currency"/><br>
<%--因为前面设置了US时区，这里不能用“￥”，会报错，必须用对应时区的货币标识符才可以--%>

<fmt:parseDate value="2024-12-11" type="date"/><br>
<fmt:parseDate value="2024/12/11" pattern="yyyy/MM/dd"/><br>

</body>
</html>
