<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/10/17
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
</head>
<body>
<a href="http://localhost:8080/qr/generate?content=http://localhost:8080/a.jsp" ><input type="submit"  value="生成电子票" onclick="qr()"></a>
<%--<script>--%>
<%--    function qr() {--%>

<%--        $.ajax({--%>
<%--            url:"/qr/generate?content=https://github.com/YunkunWen/QRdemo",--%>
<%--            responseType: 'arraybuffer',--%>
<%--            method: "GET",--%>
<%--            data: content,--%>
<%--            success: function (res) {--%>
<%--            // if (res.status === 0) {--%>

<%--            // location.reload();--%>
<%--            // } else {--%>

<%--            // }--%>
<%--                console.log(res);--%>

<%--            }--%>
<%--        })--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
