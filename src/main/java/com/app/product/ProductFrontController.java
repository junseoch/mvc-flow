package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.member.controller.MemberJoinController;
import com.app.member.controller.MemberJoinOkController;
import com.app.member.controller.MemberLoginController;
import com.app.member.controller.MemberLoginOkController;
import com.app.member.controller.MemberLogoutOkController;

public class ProductFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		System.out.println("요청 들어옴");
		
		Result result = null;
		if(target.equals("add")) {
			
		} else if(target.equals("add-ok")) {
			
		} else if(target.equals("list")) {
			
		} else if(target.equals("edit")) {
			
		} else if(target.equals("edit-ok")) {
			
		} else if(target.equals("read")) {
			
		} else if(target.equals("remove")) {
			
		} else {
			
		}
		
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			} else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
