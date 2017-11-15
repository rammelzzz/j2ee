<%--
  Created by IntelliJ IDEA.
  User: zclovecc
  Date: 2017/10/17
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String _menuPath = request.getContextPath();
    String _menuBasePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ _menuPath +"/";
%>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
        <dl id="menu-article">
            <dt><i class="Hui-iconfont">&#xe616;</i> 资讯管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>article-list.do" title="资讯管理">资讯管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-picture">
            <dt><i class="Hui-iconfont">&#xe613;</i> 图片管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>picture-list.do" title="图片管理">图片管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-product">
            <dt><i class="Hui-iconfont">&#xe620;</i> 产品管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>product-brand.do" title="品牌管理">品牌管理</a></li>
                    <li><a href="<%=_menuBasePath%>product-category.do" title="分类管理">分类管理</a></li>
                    <li><a href="<%=_menuBasePath%>product-list.do" title="产品管理">产品管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-comments">
            <dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="http://h-ui.duoshuo.com/admin/" title="评论列表">评论列表</a></li>
                    <li><a href="<%=_menuBasePath%>feed-back.do" title="意见反馈">意见反馈</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-member">
            <dt><i class="Hui-iconfont">&#xe60d;</i> 会员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>member-list.do" title="会员列表">会员列表</a></li>
                    <li><a href="<%=_menuBasePath%>member-del.do" title="删除的会员">删除的会员</a></li>
                    <li><a href="<%=_menuBasePath%>member-level.do" title="等级管理">等级管理</a></li>
                    <li><a href="<%=_menuBasePath%>member-scoreoperation.do" title="积分管理">积分管理</a></li>
                    <li><a href="<%=_menuBasePath%>member-record-browse.do" title="浏览记录">浏览记录</a></li>
                    <li><a href="<%=_menuBasePath%>member-record-download.do" title="下载记录">下载记录</a></li>
                    <li><a href="<%=_menuBasePath%>member-record-share.do" title="分享记录">分享记录</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-admin">
            <dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>admin-role.do" title="角色管理">角色管理</a></li>
                    <li><a href="<%=_menuBasePath%>admin-permission.do" title="权限管理">权限管理</a></li>
                    <li><a href="<%=_menuBasePath%>admin-list.do" title="管理员列表">管理员列表</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-system">
            <dt><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="<%=_menuBasePath%>system-base.do" title="系统设置">系统设置</a></li>
                    <li><a href="<%=_menuBasePath%>system-category.do" title="栏目管理">栏目管理</a></li>
                    <li><a href="<%=_menuBasePath%>system-shielding.do" title="屏蔽词">屏蔽词</a></li>
                    <li><a href="<%=_menuBasePath%>system-log.do" title="系统日志">系统日志</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
