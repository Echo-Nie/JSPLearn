<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的订单</title>
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
<%@ include file="/common/top_bar.jsp" %>
<div id="listDiv">
    <div>
        <span><strong>订单号:${order.id}</strong></span>
        <div style="float: right;">
            <a href="list_order" class="btn btn-primary btn-sm"
               role="button">返回</a>
        </div>
    </div>
    <br/>
    <table class="table table-bordered table-sm table-hover" style="width: 900px; text-align: center;">
        <thead>
        <tr>
            <th>商品名</th>
            <th>展示图</th>
            <th>单价</th>
            <th>数量</th>
            <th>小计</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orderItems}" var="orderItem">
            <tr>
                <td>${orderItem.productName}</td>
                <td><img src="images/${orderItem.productImage}"></td>
                <td>${orderItem.productPrice}</td>
                <td>${orderItem.quantity}</td>
                <td>${orderItem.totalPrice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <span style="font-size: 18px; float: right; margin-right: 20px;">
        	总计: ${order.payment} 元 
    </span>

</div>
</body>
</html>