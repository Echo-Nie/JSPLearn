package com.ynu.edu.servlet.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynu.edu.bean.Order;
import com.ynu.edu.bean.OrderItem;
import com.ynu.edu.bean.User;
import com.ynu.edu.dao.OrderDAO;
import com.ynu.edu.dao.OrderItemDAO;

/**
 * @ClassName ListOrdersServlet
 * @Description 根据用户查询订单
 * @Author Echo-Nie
 * @Date 2024/12/9 14:35
 * @Version V1.0
 */
@WebServlet("/order_detail")
public class OrderDetailServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private OrderItemDAO orderItemDAO;
	private OrderDAO orderDAO;
	
	@Override
	public void init() throws ServletException {
		orderItemDAO = new OrderItemDAO();
		orderDAO = new OrderDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		User user = (User)req.getSession().getAttribute("CURRENT_USER");
		String orderIdStr = req.getParameter("order_id");
		// 获取当前订单下所有订单项
		List<OrderItem> orderItems = orderItemDAO.ListOrderItemsByUserIdAndOrderId(user.getId(), Integer.parseInt(orderIdStr));
		req.setAttribute("orderItems", orderItems);
		// 获取当前订单的信息
		Order order = orderDAO.getOrderById(Integer.parseInt(orderIdStr));
		req.setAttribute("order", order);
		req.getRequestDispatcher("/portal/order_detail.jsp").forward(req, resp);	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
