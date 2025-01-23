package com.ynu.edu.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.ynu.edu.bean.User;

/**
 * @ClassName CheckLoginFilter
 * @Description 全局拦截器
 * @Author Echo-Nie
 * @Date 2024/12/9 13:26
 * @Version V1.0
 */

@WebFilter(filterName = "CheckLoginFilter", urlPatterns = "/*")
public class CheckLoginFilter implements Filter {

    private static final String[] ALLOWED_PATHS = {"/login", "/login.jsp", "/register", "/register.jsp", "/js/jquery-3.3.1.min.js", "/js/bootstrap.min.js", "/css/bootstrap.css", "/images/background.jpg"};

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String path = req.getServletPath();
        System.out.println(path);
        boolean allowed = Arrays.asList(ALLOWED_PATHS).contains(path);
        User user = (User) session.getAttribute("CURRENT_USER");
        if (!allowed && user == null) {
            ((HttpServletResponse) response).sendRedirect("/eshop/login.jsp");
            return;
        }
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
