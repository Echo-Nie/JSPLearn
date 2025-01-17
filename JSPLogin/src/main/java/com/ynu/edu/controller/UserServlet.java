package com.ynu.edu.controller;

import com.ynu.edu.service.UserService;
import com.ynu.edu.vo.MessageModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName UserServlet
 * @Description
 * @Author Echo-Nie
 * @Date 2025/1/17 14:15
 * @Version V1.0
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {
    //实例化UserService对象
    private UserService userService = new UserService();

    /**
     * @return void
     * @Author Echo-Nie
     * @Description 用户登录：
     * 1. 接受客户端请求（接收参数：name、pwd）
     * 2. 调用Service层的方法，返回MessageModel
     * 3. 判断MessageModel的状态码
     * if 失败：将消息模型对象设置到request作用域
     * if 成功：将消息模型中的用户信息设置到session中，重定向到index.jsp
     * 4. 请求转发跳转到登录页面
     * @Date 14:35 2025/1/17
     * @Param [request, response]
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1. 接受客户端请求（接收参数：name、pwd）
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
//        2. 调用Service层的方法，返回MessageModel
        MessageModel messageModel = userService.userLogin(uname, upwd);
//        3. 判断MessageModel的状态码
        if (messageModel.getCode().equals("200")) {//成功
            request.getSession().setAttribute("user", messageModel.getObject());
            response.sendRedirect("index.jsp"); // 使用重定向
        } else {//失败
            request.setAttribute("messageModel", messageModel);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
