<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>外卖类别</title>
<link href="/eshop/css/bootstrap.css" rel="stylesheet">
<script src="/eshop/js/jquery-3.3.1.min.js"></script>
<script src="/eshop/js/bootstrap.min.js"></script>
<style type="text/css">
    .form-group, #main {
        margin: 0 auto;
        width: 300px;
    }
    #main {
        margin-top: 100px;
    }
    body {
        background-image: url('/eshop/images/background.jpg');
        background-size: cover;
        background-attachment: fixed;
        background-repeat: no-repeat;
        background-position: center center;
    }
</style>
</head>
<body>
<%@ include file="/common/top_bar.jsp" %>
<div id="main">
    <h4 style="text-align: center">新增类别</h4>
    <form action="/eshop/save_brand" method="post" class="input-group-sm">
        <div class="form-group input-group-sm">
            <label for="brand_name">类别名:</label>
            <span style="float: right;color:red;">${info}</span>
            <input type="text" name="brand_name" id="brand_name" class="form-control" maxlength="20" required/>
        </div>
        <br/>
        <button type="submit" class="btn btn-primary btn-block" id="bt">添加</button>
        <a href="/eshop/product_list" class="btn btn-primary btn-block" role="button">返回</a>
    </form>
</div>
</body>
</html>
