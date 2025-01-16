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
    <title>JSP基础语法</title>
</head>
<body>
<pre>
    JSP有两种的注释：显示注释和隐式注释
        1. 显示注释：能够在客户端中查看的注释： &lt;!-- HTML 风格注释 --&gt;
        <!--HTML风格注释-->
        2. 隐式注释：不能在客户端看到的注释：
            2.1 <%--JSP自己的注释--%>&lt;%-- JSP自己的注释 --%&gt;
            2.2  JAVA注释:    //单行与多行
<%--  JAVA脚本段  --%>
<%
    //这是单行注释
    /*这是多行注释*/
%>
</pre>

</body>
</html>
