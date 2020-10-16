<%--
  Created by IntelliJ IDEA.
  User: qianghj
  Date: 2020/9/29
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<link rel="icon" href="data:image/ico;base64,aWNv">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>商品信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
</head>
<body>


        <form action="product">
            <input type="text" name="keyword" value="${keyword}">
            <input type="submit" value="搜索">
        </form>



        <ul class="select">
            <li class="select-list">
                <dl id="select1">
                    <dt>品牌：</dt>
                    <dd class="select-all selected"><a href="#">全部</a></dd>
                    <dd><a href="#">小米</a></dd>
                    <dd><a href="#">创维</a></dd>
                    <dd><a href="#">康佳</a></dd>
                    <dd><a href="#">三星</a></dd>
                    <dd><a href="#">惠普</a></dd>
                    <dd><a href="#">LG</a></dd>
                    <dd><a href="#">TCL</a></dd>
                </dl>
            </li>
            <li class="select-list">
                <dl id="select2">
                    <dt>颜色：</dt>
                    <dd class="select-all selected"><a href="#">全部</a></dd>
                    <dd><a href="#">黑色</a></dd>
                    <dd><a href="#">灰色</a></dd>
                    <dd><a href="#">白色</a></dd>
                    <dd><a href="#">银色</a></dd>
                    <dd><a href="#">红色</a></dd>
                </dl>
            </li>
            <li class="select-list">
                <dl id="select3">
                    <dt>尺寸：</dt>
                    <dd class="select-all selected"><a href="#">全部</a></dd>
                    <dd><a href="#">40</a></dd>
                    <dd><a href="#">42</a></dd>
                    <dd><a href="#">45</a></dd>
                    <dd><a href="#">50</a></dd>
                </dl>
            </li>
            <li class="select-result">
                <dl>
                    <dt>已选条件：</dt>
                    <dd class="select-no">暂时没有选择过滤条件</dd>
                    <dd class="select-text"></dd>
                </dl>
            </li>
        </ul>




        <%-- 没有商品--%>
        <c:if test="${empty productList}">
            ${msg}
        </c:if>


        <%-- 有商品--%>
        <c:if test="${!empty productList}">
            <ul>

                <c:forEach var="product" items="${productList}">

                    <li>
                        商品ID:<a href="${pageContext.request.contextPath}/product?option=1&id=${product.proId}" >${product.proId}</a>,
                        名称：<a href="" >${product.proName}</a>,
                        编号：${product.proNum}，
                        价格：${product.proPrice}，
                        生产地址：${product.proAddress}，
                        生产日期： <fmt:formatDate value="${product.proDate}" pattern="yyyy-MM-dd"></fmt:formatDate>


                        <a href="${pageContext.request.contextPath}/product?option=4&id=${product.proId}">删除</a>
                        <a href="${pageContext.request.contextPath}/product?option=5&id=${product.proId}">编辑</a>

                    </li>


                </c:forEach>


            </ul>

            <c:if test="${pageInfo.pageNum !=1}">

                <a href="${pageContext.request.contextPath}/product?option=6&page=1">首页</a>
                <a href="${pageContext.request.contextPath}/product?option=6&page=${pageInfo.pageNum-1}">上一页</a>
            </c:if>

            <span>当前是第 ${pageInfo.pageNum} 页</span>


            <c:if test="${pageInfo.pageNum !=pageInfo.pages}">
                <a href="${pageContext.request.contextPath}/product?option=6&page=${pageInfo.pageNum+1}">下一页</a>
                <a href="${pageContext.request.contextPath}/product?option=6&page=${pageInfo.pages}">最后一页</a>
            </c:if>

            <span>共${pageInfo.pages}页</span>
            <span>共${pageInfo.total}条商品记录</span>

        </c:if>


</body>
</html>
