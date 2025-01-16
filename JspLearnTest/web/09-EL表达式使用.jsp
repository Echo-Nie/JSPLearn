<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.ynu.po.User" %><%--
  User: Echo-Nie
  Date: 2024/12/10
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用</title>
    <%--
        EL表达式的使用：
            获取List：
                获取List的size：${list.size()}
                获取list的下标：list[i]
                注意：list代表的是限域变量名
             获取Map：
             获取map中指定key的value：${map.key}或者${map["key"]}
    --%>
</head>
<body>
<h2>List示例</h2><br>
<%
    //List
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list", list);

    //Map
    Map map = new HashMap<>();
    map.put("aaa", "111");
    map.put("bbb", 111);
    map.put("ccc", 33);
    request.setAttribute("map", map);

    //JavaBean
    User user = new User(1, "nyx", "123");
    request.setAttribute("user", user);
%>
<h4>获取List</h4>
获取list的size：${list.size()};<br>
获取list的指定下标值list[1]：${list[1]}<br>

<h4>获取Map</h4>
获取map指定的key的value：${map.aaa} 或者 ${map["bbb"]};

<h4>获取JAVABean</h4>
${user}<br>
获取JAVABean中属性：uname=${user.uname}或者getUname=${user.getUname()}
<%--
输出如下：
com.ynu.po.User@62adb472
获取JAVABean中属性：uname=nyx或者getUname=nyx
--%>
<h2></h2>
</body>
</html>
