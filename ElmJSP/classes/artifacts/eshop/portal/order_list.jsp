<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>饿了么·订单列表</title>
<link href="/eshop/css/bootstrap.css" rel="stylesheet">
<script src="/eshop/js/jquery-3.3.1.min.js"></script>
<script src="/eshop/js/bootstrap.min.js"></script>
<style type="text/css">
    body {
        background-image: url('/eshop/images/background.jpg');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        margin: 0;
        padding: 0;
    }

    #listDiv {
        margin: 50px auto;
        width: 1000px;
        height: 80%;
        background-color: rgba(255, 255, 255, 1);
        padding: 20px;
        border-radius: 10px;
    }

    .table tbody tr td {
        vertical-align: middle;
    }
</style>
</head>
<body>
<%@ include file="/common/top_bar.jsp" %>
<div id="listDiv">
    <table class="table table-bordered table-sm table-hover" style="width: 900px; text-align: center;">
        <thead>
        <tr>
            <th>订单号</th>
            <th>订单金额</th>
            <th>下单时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${pageInfo.list}" var="order">
                <tr>
                    
                    <td>${order.id}</td>
                    <td>${order.payment}</td>
                    <td><fmt:formatDate value="${order.payTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>
                        <a href="order_detail?order_id=${order.id}"
                           class="btn btn-primary btn-sm" role="button">订单详情</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <span style="font-size: 18px;">
        第&nbsp;${pageInfo.currentPage}&nbsp;/&nbsp;${pageInfo.totalPage}&nbsp;页
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总订单数 ${pageInfo.totalCount}

    </span>
    <ul class="pagination" style="float: right;">
        <li class="page-item"><a class="page-link" href="list_order?currentPage=1" >&laquo;</a></li>
        <li class="page-item"><a class="page-link" href="list_order?currentPage=${pageInfo.prePage}" >上一页</a></li>
        <li class="page-item"><a class="page-link" href="list_order?currentPage=${pageInfo.nextPage}" >下一页</a></li>
        <li class="page-item"><a class="page-link" href="list_order?currentPage=${pageInfo.totalPage}" >&raquo;</a></li>
    </ul>

</div>
</body>
</html>
