<%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/16
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String _headerPath = request.getContextPath();
    String _headerBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ _headerPath +"/";
%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<%=_headerBasePath%>css/homepage.css">
    <title>首页</title>
</head>
<body>
<div class="header">
    <div class="header-main">
        <div style="height:10px;"></div>
        <div class="login-register">
            <div id="register" class="header-register">
                <a>注册</a>
            </div>
            <div id="login">
            </div>
        </div>
        <div class="header-logo">
            <a href=""><img src="<%=_headerBasePath%>image/head-logo.jpg"></a>
        </div>
        <div class="header-title">
            <a href="" class="NBA">NBA保罗乔治</a>
            <a href="" class="com">PaulGeorge.com/China</a>
        </div>
    </div>
</div>
<div class="wrap">
    <div class="header-menu">
        <ul class="nav-menu">
            <li><a href="">首页</a></li>
            <li><a href="">乔治简介</a></li>
            <li><a href="">高清美图</a></li>
            <li><a href="">球鞋周边</a></li>
            <li><a href="">NBA新闻</a></li>
            <li><a href="http://china.nba.com/rulebook/">犯规手册</a></li>
            <li><a href="">关于作者</a></li>
        </ul>
    </div>
</div>

</body>
</html>

<script>
    var isLogin = true;
    var username = "${username}";
    if(username == null || username == "") {
        isLogin = false;
    }
    if(isLogin) {
        document.getElementById("register").innerHTML="<a>注销</a>";
        document.getElementById("login").innerHTML="<div class='hasLogined'><a>" + username + "</a></div>";
    }
    else {
        document.getElementById("login").innerHTML="<div class='header-login'><a>登录</a></div>";
    }
</script>
