package com.ynu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginService
 * @Description
 * @Author Echo-Nie
 * @Date 2024/12/10 9:46
 * @Version V1.0
 */

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置客户端编码格式
        request.setCharacterEncoding("UTF-8");
        //接收客户端传参
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        //判断传参为空
        if (uname == null || "".equals(uname.trim())) {
            //提示用户信息
            request.setAttribute("msg", "用户姓名不能为空");
            //请求转发跳转到loginTest.jsp
            request.getRequestDispatcher("07-loginTest.jsp").forward(request, response);
            return;
        } else if (upwd == null || "".equals(upwd.trim())) {
            //提示用户信息
            request.setAttribute("msg", "密码不能为空");
            //请求转发跳转到login.jsp
            request.getRequestDispatcher("07-loginTest.jsp").forward(request, response);
            return;
        }

        //判断账号密码是否正确
        if(!"nyx".equals(uname)){
            //提示用户名错误
            request.setAttribute("msg","用户名错误，登录失败");
            request.getRequestDispatcher("07-loginTest.jsp").forward(request, response);
            return;
        }
        //判断密码
        if(!"nyx".equals(upwd)){
            request.setAttribute("msg","密码错误，登录失败");
            request.getRequestDispatcher("07-loginTest.jsp").forward(request, response);
            return;
        }
        //登录成功
        //设置登录时的信息到session作用域
        request.getSession().setAttribute("uname",uname);
        //跳转到登录页面
        response.sendRedirect("07-index.jsp");

    }
}
