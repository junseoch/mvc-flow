package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductAddOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		Result result = new Result();
		ProductVO productVO = new ProductVO();
		ProductDAO productDAO = new ProductDAO();
		
		productVO.setProductName(req.getParameter("product"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
		
		productDAO.insert(productVO);
		
		result.setPath("list.jsp");
		return result;
		
	}
}
