package com.ynu.edu.controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * @ClassName LogoutServlet
 * @Description 退出登录
 * @Author Echo-Nie
 * @Date 2025/1/17 17:58
 * @Version V1.0
 */

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 清除 session
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // 销毁 session
        }
        response.setStatus(HttpServletResponse.SC_OK); // 返回成功状态
    }
}