package com.ynu.edu.servlet.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynu.edu.bean.Brand;
import com.ynu.edu.bean.Product;
import com.ynu.edu.dao.BrandDAO;
import com.ynu.edu.dao.ProductDAO;
/**
 * @ClassName EditProductServlet
 * @Description 数据库编辑
 * @Author Echo-Nie
 * @Date 2024/12/9 14:31
 * @Version V1.0
 */
@WebServlet("/edit_product")
public class EditProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO;
	private BrandDAO brandDAO;
	
	@Override
	public void init() throws ServletException {
		productDAO = new ProductDAO();
		brandDAO = new BrandDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String idStr = req.getParameter("id");
		// 判断是编辑商品还是新增商品
		if(idStr != null && !"".equals(idStr)) {
			// 编辑商品,原始信息回显
			Product product = productDAO.getProductById(Integer.parseInt(idStr));
			req.setAttribute("prod", product);
		}
		List<Brand> brands = brandDAO.listBrands();
		req.setAttribute("brands", brands);
		// 请求转发到编辑页面
		req.getRequestDispatcher("/backend/product_edit.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
