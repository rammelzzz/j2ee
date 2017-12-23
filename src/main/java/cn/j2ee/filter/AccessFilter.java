package cn.j2ee.filter;

import cn.j2ee.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by rammel on 2017/12/23.
 */
@Component
public class AccessFilter implements Filter{

    private Logger logger = Logger.getLogger(getClass());

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 拦截没有登陆的非法请求
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        User user = obj == null ? null : (User)obj;
        String url = request.getRequestURI();
        if(user == null && !url.contains("login.do")) {
            logger.error("没有权限访问该页面！重定向到登陆页面！");
            response.sendError(1, "您需要登陆后才能访问这个页面！");
            response.sendRedirect("/user/login.do");
        }
        logger.info("用户正在登陆或者已登陆...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
