<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp" %>
<%@page import="javax.servlet.jsp.jstl.*" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <!--<script type="text/javascript" src="lib/html5.js"></script>-->
    <!--<script type="text/javascript" src="lib/respond.min.js"></script>-->
    <!-- [endif]-->
    <link href="<%=basePath%>css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>css/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6] -->
    <%--<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>--%>
    <%--<script>DD_belatedPNG.fix('*');</script><![endif]-->--%>
    <title>登录</title>
    <script>
        var errorMsg = "${errorMsg}";
        if(errorMsg == null || errorMsg == "") {

        } else {
            alert(errorMsg);
        }
    </script>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" action="<%=basePath%>login.do" method="post">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont"></i></label>
                <div class="formControls col-xs-8">
                    <input name="username" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont"></i></label>
                <div class="formControls col-xs-8">
                    <input name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="verCode" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
                    <%--<img src="images/VerifyCode.aspx.png">--%>
                    <tr>
                        <td nowrap width="437"></td>
                        <td>
                            <a href='#' onclick="javascript:changeImg()">
                                <img id="img" src="<%=basePath%>authImage" />
                            </a>
                        </td>
                    </tr><br>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        使我保持登录状态</label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright bit by rammus</div>

<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/H-ui.js"></script>
<!-- 触发JS刷新-->
<script type="text/javascript">
    function changeImg(){
        var img = document.getElementById("img");
        img.src = "<%=basePath%>authImage?date=" + new Date();;
    }
</script>
<%--<script>--%>
    <%--var _hmt = _hmt || [];--%>
    <%--(function() {--%>
        <%--var hm = document.createElement("script");--%>
        <%--hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";--%>
        <%--var s = document.getElementsByTagName("script")[0];--%>
        <%--s.parentNode.insertBefore(hm, s);--%>
    <%--})();--%>
<%--</script>--%>
</body>
</html>
