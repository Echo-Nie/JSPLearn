<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="css/logout.css">
</head>
<body>
<div class="container">
    <h1>欢迎来到首页！</h1>
    <p>当前用户：${user.userName}</p>
    <button class="logout-btn" onclick="logout()">退出登录</button>
</div>

<script>
    function logout() {
        // 获取按钮元素
        const logoutBtn = document.querySelector('.logout-btn');

        // 禁用按钮，防止重复点击
        logoutBtn.disabled = true;

        // 添加旋转动画
        logoutBtn.classList.add('rotate');

        // 发送请求到服务器，清除 session
        fetch('logout', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        }).then(response => {
            if (response.ok) {
                // 1 秒后跳转到登录页面
                setTimeout(() => {
                    window.location.href = 'login.jsp';
                }, 1000);
            } else {
                console.error('退出登录失败:', response.statusText);
                // 移除旋转动画并启用按钮
                logoutBtn.classList.remove('rotate');
                logoutBtn.disabled = false;
            }
        }).catch(error => {
            console.error('退出登录失败:', error);
            // 移除旋转动画并启用按钮
            logoutBtn.classList.remove('rotate');
            logoutBtn.disabled = false;
        });
    }
</script>
</body>
</html>