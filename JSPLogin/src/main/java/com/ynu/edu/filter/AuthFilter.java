package com.ynu.edu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName AuthFilter
 * @Description 用户登录验证过滤器
 * @Author Echo-Nie
 * @Date 2025/1/18
 * @Version V1.0
 */
@WebFilter("/*") // 拦截所有请求
public class AuthFilter implements Filter {

    // 放行的指定页面
    private static final List<String> ALLOWED_PAGES = Arrays.asList(
            "/login.jsp", "/register.jsp"
    );

    // 放行的静态资源路径
    private static final List<String> ALLOWED_RESOURCES = Arrays.asList(
            "/css/", "/js/", "/images/"
    );

    // 放行的指定操作
    private static final List<String> ALLOWED_ACTIONS = Arrays.asList(
            "/login", "/register"
    );

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化方法，可以在这里做一些初始化工作
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 将 ServletRequest 和 ServletResponse 转换为 HttpServletRequest 和 HttpServletResponse
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 获取请求的 URI
        String requestURI = httpRequest.getRequestURI();
        String contextPath = httpRequest.getContextPath();
        String path = requestURI.substring(contextPath.length());

        // 检查是否为放行的指定页面
        if (ALLOWED_PAGES.contains(path)) {
            chain.doFilter(request, response);
            return;
        }

        // 检查是否为放行的静态资源
        if (isAllowedResource(path)) {
            chain.doFilter(request, response);
            return;
        }

        // 检查是否为放行的指定操作
        if (ALLOWED_ACTIONS.contains(path)) {
            chain.doFilter(request, response);
            return;
        }

        // 检查用户是否已登录
        HttpSession session = httpRequest.getSession(false); // 如果不存在 Session，则返回 null
        boolean isLoggedIn = (session != null && session.getAttribute("user") != null);

        if (isLoggedIn) {
            // 用户已登录，放行请求
            chain.doFilter(request, response);
        } else {
            // 用户未登录，重定向到登录页面
            httpResponse.sendRedirect(contextPath + "/login.jsp");
        }
    }

    @Override
    public void destroy() {
        // 销毁方法，可以在这里做一些清理工作
    }

    /**
     * 检查是否为放行的静态资源
     */
    private boolean isAllowedResource(String path) {
        for (String resource : ALLOWED_RESOURCES) {
            if (path.startsWith(resource)) {
                return true;
            }
        }
        return false;
    }
}