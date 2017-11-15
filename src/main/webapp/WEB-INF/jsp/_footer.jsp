<%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/17
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String _footerPath = request.getContextPath();
    String _footerBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ _footerPath +"/";
%>
<script type="text/javascript" src="<%=_footerBasePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=_footerBasePath%>js/layer.js"></script>
<script type="text/javascript" src="<%=_footerBasePath%>js/H-ui.js"></script>
<script type="text/javascript" src="<%=_footerBasePath%>js/H-ui.admin.page.js"></script>
