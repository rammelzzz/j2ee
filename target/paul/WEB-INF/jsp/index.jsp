<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/16
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp"%>
<html>
<head>
    <%@include file="_meta.jsp" %>
    <title>首页</title>
</head>
<body>
    <!-- header -->
    <%@ include file="_header.jsp" %>
    <!-- menu -->
    <%@ include file="_menu.jsp"%>

    <section class="Hui-article-box">
        <nav class="breadcrumb"><i class="Hui-iconfont"></i> <a href="/" class="maincolor">首页</a>
            <span class="c-999 en">&gt;</span>
            <span class="c-666">我的桌面</span>
            <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
        <div class="Hui-article">
            <article class="cl pd-20">
                <p class="f-20 text-success">欢迎使用R-ui.admin
                    <span class="f-14">v1.0</span>
                    管理系统</p>
                <p>登录次数：18 </p>
                <p>上次登录IP：222.35.131.79.1  上次登录时间：2014-6-14 11:19:55</p>
                <table class="table table-border table-bordered table-bg">
                    <thead>
                    <tr>
                        <th colspan="7" scope="col">信息统计</th>
                    </tr>
                    <tr class="text-c">
                        <th>统计</th>
                        <th>资讯库</th>
                        <th>图片库</th>
                        <th>产品库</th>
                        <th>用户</th>
                        <th>管理员</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="text-c">
                        <td>总数</td>
                        <td>92</td>
                        <td>9</td>
                        <td>0</td>
                        <td>8</td>
                        <td>20</td>
                    </tr>
                    <tr class="text-c">
                        <td>今日</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                    </tr>
                    <tr class="text-c">
                        <td>昨日</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                    </tr>
                    <tr class="text-c">
                        <td>本周</td>
                        <td>2</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                    </tr>
                    <tr class="text-c">
                        <td>本月</td>
                        <td>2</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                        <td>0</td>
                    </tr>
                    </tbody>
                </table>
                <table class="table table-border table-bordered table-bg mt-20">
                    <thead>
                    <tr>
                        <th colspan="2" scope="col">服务器信息</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th width="30%">服务器计算机名</th>
                        <td><span id="lbServerName">rammus7</span></td>
                    </tr>
                    <tr>
                        <td>服务器IP地址</td>
                        <td>39.106.46.228</td>
                    </tr>
                    <tr>
                        <td>服务器域名</td>
                        <td>www.zclove.cc</td>
                    </tr>
                    <tr>
                        <td>服务器端口 </td>
                        <td>8080</td>
                    </tr>
                    <tr>
                        <td>本文件所在文件夹 </td>
                        <td>~/user/develop/tomcat/apache-tomcat-9.0.1/</td>
                    </tr>
                    <tr>
                        <td>服务器操作系统 </td>
                        <td>CentOS7</td>
                    </tr>
                    <tr>
                        <td>服务器的语言种类 </td>
                        <td>Chinese (People's Republic of China)/English</td>
                    </tr>
                    <tr>
                        <td>服务器当前时间 </td>
                        <td><%=new Date()%></td>
                    </tr>
                    <tr>
                        <td>CPU 总数 </td>
                        <td>1</td>
                    </tr>
                    <tr>
                        <td>当前系统用户名 </td>
                        <td>NETWORK SERVICE</td>
                    </tr>
                    </tbody>
                </table>
            </article>
            <footer class="footer">
                <p>感谢jQuery、layer、laypage、Validform、UEditor、My97DatePicker、iconfont、Datatables、WebUploaded、icheck、highcharts、bootstrap-Switch<br> Copyright &copy;2017 Rammus7 All Rights Reserved.<br> 本后台系统由<a href="http://www.h-ui.net/" target="_blank" title="H-ui前端框架">H-ui前端框架</a>提供前端技术支持</p>
            </footer>
        </div>
    </section>

    <!-- footer -->
    <%@include file="_footer.jsp"%>
</body>
</html>
