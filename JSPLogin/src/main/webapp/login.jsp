<%--
  User: Echo-Nie
  Date: 2025/1/17
  Time: 1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div id="loginForm">
    <form action="login" method="post">
        <div class="form-group">
            <label for="uname">姓名：</label>
            <input type="text" id="uname" name="uname" value="${messageModel.object.userName}">
        </div>
        <div class="form-group">
            <label for="upwd">密码：</label>
            <input type="password" id="upwd" name="upwd" value="${messageModel.object.pwd}">
        </div>
        <span id="msg" style="font-size: 12px;color: red">${messageModel.msg}</span><br>
        <button type="submit" id="loginBtn">登录</button>
        <button type="button">注册</button>
    </form>
</div>

<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    <%--     登录表单验证
                1. 给登录按钮绑定点击事件
                2. 获取uname和upwd
                3. 判断是否为空（先姓名、后密码），span标签给出提示
                4. 都不为空，手动提交表单
    --%>
    $("#loginBtn").click(function () {
        //获取uname和pwd
        var uname = $("#uname").val();
        var upwd = $("#upwd").val();

        if (isEmpty(uname)) {
            $("#msg").html("用户名为空！");
            return;
        }
        if (isEmpty(upwd)) {
            $("#msg").html("密码为空！");
            return;
        }
        //都不为空才能登录
        $("#loginForm").submit();
    });


    /*
    判断字符串是否为空
    * */
    function isEmpty(str) {
        return str == null || str.trim() === "";

    }
</script>
</body>
</html>