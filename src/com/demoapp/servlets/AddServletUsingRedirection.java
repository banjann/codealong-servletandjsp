package com.demoapp.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServletUsingRedirection extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		
		int sum = firstNumber + secondNumber;
		
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		
		res.sendRedirect("squareRedirection");
	}
}
