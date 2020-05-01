<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-01
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mvc返回json格式数据</title>
</head>
<script src="../static/js/jquery/jquery-3.4.1.js"></script>
<body>
    <h3>请求首页成功</h3>
    <div>
        <span><a href="javascript:void(0)" id="returnJson" onclick="getUserJson()">点击请求实例</a></span>
    </div>
</body>
<script>
    function getUserJson() {
        var url = '../returnJson';
        var args = {};
        $.post(url, args, function (data) {
            console.log(data)
        });
    }
</script>
</html>
