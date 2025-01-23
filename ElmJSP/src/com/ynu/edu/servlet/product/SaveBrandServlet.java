package com.ynu.edu.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ynu.edu.bean.Brand;
import com.ynu.edu.dao.BrandDAO;
/**
 * @ClassName SaveBrandServlet
 * @Description 类别添加
 * @Author Echo-Nie
 * @Date 2024/12/9 15:01
 * @Version V1.0
 */
@WebServlet("/save_brand")
public class SaveBrandServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private BrandDAO brandDAO;

	@Override
	public void init() throws ServletException {
		brandDAO = new BrandDAO();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String brandName = req.getParameter("brand_name");
		if (brandDAO.getBrandByName(brandName) != null) {
			req.setAttribute("info", "该外卖类别已存在");
			req.getRequestDispatcher("/backend/brand_edit.jsp").forward(req, resp);
		} else {
			Brand brand = new Brand();
			brand.setName(brandName);
			brandDAO.insertBrand(brand);
			req.setAttribute("info", "添加类别成功");
			req.getRequestDispatcher("/backend/brand_edit.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
