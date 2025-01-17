package com.ynu.edu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassName FilterTest1
 * @Description 过滤器测试
 * @Author Echo-Nie
 * @Date 2025/1/17 21:48
 * @Version V1.0
 */
@WebFilter("/ser01")
public class FilterTest1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterTest1 init...");
    }
    
    /**
    * @Author Echo-Nie
    * @Description 过滤方法
    * @Date 21:51 2025/1/17
    * @Param [servletRequest, servletResponse, filterChain]
    * @return void
    **/
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行资源
        filterChain.doFilter(servletRequest,servletResponse);
        //如果不放行的话这里就一直被拦截，永远不会进入Servlet01
    }

    @Override
    public void destroy() {
        System.out.println("FilterTest1 destroy...");
    }
}
