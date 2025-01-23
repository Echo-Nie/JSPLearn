package com.ynu.edu.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynu.edu.dao.ProductDAO;
/**
 * @ClassName DeleteProductServlet
 * @Description 数据库删除
 * @Author Echo-Nie
 * @Date 2024/12/9 14:55
 * @Version V1.0
 */
@WebServlet("/del_product")
public class DeleteProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO;
	
	@Override
	public void init() throws ServletException {
		productDAO = new ProductDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String idStr = req.getParameter("id");
		// 根据商品id删除数据库中的商品
		productDAO.deleteProductById(Integer.parseInt(idStr));
		resp.sendRedirect("product_list");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
