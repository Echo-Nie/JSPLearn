package com.ynu.edu.servlet;

import com.ynu.edu.util.OnlineUserCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 显示在线人数
 */
@WebServlet("/onlineUsers")
public class OnlineUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应内容类型
        resp.setContentType("text/html;charset=UTF-8");

        // 获取在线人数
        int onlineUsers = OnlineUserCounter.getOnlineUsers();

        // 输出在线人数
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>在线人数监控</title></head>");
        out.println("<body>");
        out.println("<h1>当前在线人数: " + onlineUsers + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}