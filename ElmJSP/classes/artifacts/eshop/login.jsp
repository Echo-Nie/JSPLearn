<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>饿了么Servlet版本</title>
<link href="./css/bootstrap.css" rel="stylesheet">
<script src="./js/jquery-3.3.1.min.js"></script>
<script src="/eshop/js/bootstrap.min.js"></script>
<style type="text/css">
    body {
        background-image: url('./images/background.jpg');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        margin: 0;
    }
    #title {
        text-align: center;
        margin-top: 30px;
        font-size: 2em;
        color: white;
        text-shadow: 2px 2px 4px #000000;
    }
    div {
        margin: 0 auto;
        width: 300px;
    }
    #main {
        margin-top: 50px;
        background: rgba(255, 255, 255, 0.8);
        padding: 20px;
        border-radius: 10px;
    }
    .form-control {
        width: 250px;
        margin-left: 0;
    }
</style>
</head>
<body>
<div id="title">中级实训Servlet版本项目</div>
<div id="main">
    <h4 style="text-align: center">登录</h4>
    <span style="color: red;">${errMsg}</span>
    <%
        session.invalidate();
    %>
    <form action="login" method="post" class="input-group-sm">
        <div class="form-group input-group-sm">
            <label for="login_name">账号:</label>
            <input type="text" name="login_name" id="login_name" class="form-control" required/>
        </div>
        <div class="form-group input-group-sm">
            <label for="password">密码:</label>
            <input type="password" name="password" id="password" class="form-control" required/>
        </div>
        <a href="register.jsp">注册账号</a>
        <button type="submit" class="btn btn-primary btn-block">登录</button>
    </form>
</div>
</body>
</html>
