package com.ynu.edu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName ServletListener01
 * @Description
 * @Author Echo-Nie
 * @Date 2025/1/17 23:06
 * @Version V1.0
 */
@WebServlet("/s01")
public class ServletListener01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet-Listener01 Create...");
        HttpSession httpSession = req.getSession();

    }
}
