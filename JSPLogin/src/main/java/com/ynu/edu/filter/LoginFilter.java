package com.ynu.edu.filter;

import com.ynu.edu.vo.MessageModel;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName LoginFilter
 * @Description 登录过滤器
 * @Author Echo-Nie
 * @Date 2025/1/17 15:00
 * @Version V1.0
 */
@WebFilter("/login")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 将ServletRequest和ServletResponse转换为HttpServletRequest和HttpServletResponse
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 1. 预处理：检查用户是否已经登录
        HttpSession session = httpRequest.getSession();
        if (session.getAttribute("user") != null) {
            // 如果用户已经登录，直接重定向到首页，避免重复登录
            httpResponse.sendRedirect("index.jsp");
            return; // 结束过滤链，不再继续执行后续的Filter和Servlet
        }

        // 2. 继续执行后续的Filter和Servlet
        chain.doFilter(request, response);

        // 3. 后处理：在响应返回给客户端之前，可以做一些额外的工作
        httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0
        httpResponse.setDateHeader("Expires", 0);
    }

    @Override
    public void destroy() {
        // 销毁
    }
}