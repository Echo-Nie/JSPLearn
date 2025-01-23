<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>饿了么·我的订单</title>
<link href="/eshop/css/bootstrap.css" rel="stylesheet">
<script src="/eshop/js/jquery-3.3.1.min.js"></script>
<script src="/eshop/js/bootstrap.min.js"></script>
<style type="text/css">
    body {
        background-image: url('/eshop/images/background.jpg'); /* 背景图像路径 */
        background-size: cover; /* 让背景图像覆盖整个页面 */
        background-position: center; /* 背景图像居中 */
        background-repeat: no-repeat; /* 防止背景图像重复 */
        height: 100vh; /* 设置页面高度为视口高度 */
        margin: 0; /* 去掉默认的页面边距 */
        padding: 0; /* 去掉默认的页面内边距 */
    }
#listDiv {
	margin: 15px auto;
	width: 900px;
	height: 67%;
}

img {
	margin: 0;
	padding: 0;
	width: 100px;
}

.table tbody tr td {
	vertical-align: middle;
}
</style>
</head>
<body>
	<%@ include file="/common/top_bar.jsp"%>
	<div id="listDiv">
		<h3 style="text-align: center;">提交订单成功</h3>
		<br /> <br />
		<div>
			<a href="product_list" class="btn btn-primary btn-sm" role="button">&lt;&lt; 继续购物</a>

			<a href="order_detail?order_id=${orderId}" class="btn btn-primary btn-sm" role="button">查看订单详情 &gt;&gt;</a>

		</div>
		<br />


	</div>
</body>
</html>