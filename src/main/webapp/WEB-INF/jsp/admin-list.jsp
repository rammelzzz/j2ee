<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/17
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="_meta.jsp" %>
    <title>管理员列表</title>
</head>
<body>
<!-- header -->
<%@ include file="_header.jsp" %>
<!-- menu -->
<%@ include file="_menu.jsp"%>

<section class="Hui-article-box">
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页
        <span class="c-gray en">&gt;</span>
        管理员管理
        <span class="c-gray en">&gt;</span>
        管理员列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a> </nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="text-c"> 日期范围：
                <form action="" method="GET">
                    <input type="text"  onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;" name="dateMin">
                    -
                    <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;" name="dataMax">
                    <input type="text" class="input-text" style="width:250px" placeholder="输入管理员名称" id="name" name="name">
                    <button type="submit" class="btn btn-success" id="submit" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
                </form>
            </div>
            <div class="cl pd-5 bg-1 bk-gray mt-20">
                <span class="l"> <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="admin_add('添加管理员','admin-add.html','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a> </span>
                <span class="r">共有数据：<strong>54</strong> 条</span>
            </div>
            <table class="table table-border table-bordered table-bg">
                <thead>
                <tr>
                    <th scope="col" colspan="9">员工列表</th>
                </tr>
                <tr class="text-c">
                    <th width="25"><input type="checkbox" name="all" valu e=""></th>
                    <th width="40">ID</th>
                    <th width="150">登录名</th>
                    <th width="90">手机</th>
                    <th width="150">邮箱</th>
                    <th>角色</th>
                    <th width="130">加入时间</th>
                    <th width="100">是否已启用</th>
                    <th width="100">操作</th>
                </tr>
                </thead>
                <tbody>
                <tr class="text-c">
                <c:forEach items="userList" var="user">
                    <td><input type="checkbox" value="1" name="${user.name}"></td>
                    <td>1</td>
                    <td>${user.name}</td>
                    <td>${user.mobile}</td>
                    <td>${user.email}</td>
                    <td>${user.role}</td>
                    <td>${user.createTime}</td>
                    <td class="td-status"><span class="label label-success radius">
                        <c:if test="${user.status == 1}">
                            已启用
                        </c:if>
                        <c:otherwise>
                            已停用
                        </c:otherwise>
                    </span>
                    </td>
                    <td class="td-manage"><a style="text-decoration:none" onClick="admin_stop(this,'10001')    " href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="admin_edit('管理员编辑','admin-add.html','1','800','500')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                </c:forEach>
                </tbody>
            </table>
        </article>
    </div>
</section>


</body>
</html>
