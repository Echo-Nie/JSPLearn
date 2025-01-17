package com.ynu.edu.servlet;

import com.ynu.edu.util.OnlineUserCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取当前 Session
        HttpSession session = req.getSession(false);
        if (session != null) {
            // 销毁 Session
            session.invalidate();
            // 减少在线人数
            OnlineUserCounter.decrement();
        }

        // 重定向到首页
        resp.sendRedirect("index.jsp");
    }
}