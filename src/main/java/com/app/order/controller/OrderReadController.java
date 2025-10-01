package com.app.order.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.OrderDAO;
import com.app.dto.OrderDTO;

public class OrderReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		
		
		OrderDAO orderDAO = new OrderDAO();
		OrderDTO orderDTO = new OrderDTO;
		
		Long id = Long.parseLong(req.getParameter("id")); 
		order = orderDAO.selectAll(id);
		OrderDTO orderDTO = null;
		
		req.setAttribute("orderList", orderList);
		req.setAttribute("orderJSON", new JSONObject(order));
		
		result.setPath("/order/order_read.jsp");
		return result;
	}

}
