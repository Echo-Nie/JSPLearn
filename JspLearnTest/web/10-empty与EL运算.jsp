<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.ynu.po.User" %><%--
  User: Echo-Nie
  Date: 2024/12/11
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>10-empty与EL运算.jsp</title>
    <%--
        empty
            判断域对象是否为空，为空返回true，否则为false
                ${empty 限域变量名}
            判断对象是否不为空
                ${!empty 限域变量名}
         对于字符串：
            不存在返回true
            有值返回false
            空串true
            null也是true

          对于List：
            null返回true
            没有长度size的也返回true

          对于Map：
            null返回true
            空Map对象返回true

          对于JAVABean：
             null返回true
             空对象返回false
    --%>

</head>
<body>
<%
    //字符串
    request.setAttribute("str1", "abc");
    request.setAttribute("str2", "");
    request.setAttribute("str3", null);
    //List
    List list1 = new ArrayList<>();
    List list2 = null;
    List list3 = new ArrayList<>();
    list3.add(1);
    request.setAttribute("list1", list1);
    request.setAttribute("list2", list2);
    request.setAttribute("list3", list3);

    //Map
    Map map = new HashMap<>();
    Map map1 = null;
    Map map2 = new HashMap<>();
    map2.put(1, 2);
    request.setAttribute("map", map);
    request.setAttribute("map1", map1);
    request.setAttribute("map2", map2);

    //JAVABean
    User user = null;
    User user1 = new User();
    User user2 = new User(1, "nyx", "123");
    request.setAttribute("user", user);
    request.setAttribute("user1", user1);
    request.setAttribute("user2", user2);


%>
<h4>判断字符串是否不存在</h4>
${empty str}返回true<br>
${empty str1}返回false<br>
${empty str2}返回true<br>
${empty str3}返回true<br>
<br>

<h4>判断List是否为空</h4>
${empty list1}返回true<br>
${empty list2}返回true<br>
${empty list3}返回false<br>

<h4>判断Map是否为空</h4>
${empty map}返回true<br>
${empty map1}返回true<br>
${empty map2}返回false<br>

<h4>判断JAVABean</h4>
${empty user}返回true<br>
${empty user1}返回false<br>
${empty user2}返回false<br>
-----------------------比较两个值是否相等，==或eq----------------
<%
    request.setAttribute("a", 10);
    request.setAttribute("b", 2);
    request.setAttribute("c", "aa");
    request.setAttribute("d", "bb");
%>
${a==b}
${c==d}
${c eq d}
${a ==5}
${c =="aa"}

<br>
</body>
</html>
