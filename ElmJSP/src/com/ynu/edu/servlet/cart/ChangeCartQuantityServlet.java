package com.ynu.edu.servlet.cart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynu.edu.dao.CartDAO;

/**
 * @ClassName ChangeCartQuantityServlet
 * @Description 改变购物车里面的商品数量
 * @Author Echo-Nie
 * @Date 2024/12/9 13:57
 * @Version V1.0
 */
@WebServlet("/change_quantity")
public class ChangeCartQuantityServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private CartDAO cartDAO;

    @Override
    public void init() throws ServletException {
        cartDAO = new CartDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String quantityStr = req.getParameter("quantity");
        String cartIdStr = req.getParameter("cart_id");
        // 更新cart的数量
        cartDAO.updateQuantityByCartId(Integer.parseInt(cartIdStr), Integer.parseInt(quantityStr));
        resp.sendRedirect("list_cart");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
