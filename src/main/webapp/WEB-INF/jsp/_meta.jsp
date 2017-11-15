<%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/17
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String _menuPath = request.getContextPath();
    String _menuBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ _menuPath +"/";
%>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=_menuBasePath%>js/html5shiv.js"></script>
    <script type="text/javascript" src="<%=_menuBasePath%>js/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="<%=_menuBasePath%>css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=_menuBasePath%>css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="<%=_menuBasePath%>css/iconfont.css" />

    <link rel="stylesheet" type="text/css" href="<%=_menuBasePath%>css/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="<%=_menuBasePath%>css/style.css" />
    <%--<!--[if IE 6]>--%>
    <%--<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>--%>
    <%--<script>DD_belatedPNG.fix('*');</script><![endif]-->--%>
