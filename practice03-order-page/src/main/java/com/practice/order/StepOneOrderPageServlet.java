package com.practice.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class StepOneOrderPageServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String product = request.getParameter("product");
		int number = Integer.parseInt(request.getParameter("number"));
		
		System.out.println("상품 : " + product);
		System.out.println("수량 : " + number);
		
		
		request.setAttribute("userName", "brakio🦕");
		
		RequestDispatcher rd = request.getRequestDispatcher("print");
		
		rd.forward(request, response);
	}

}
