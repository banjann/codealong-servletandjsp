package com.demoapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServletUsingRedirection extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		int sum = (int) session.getAttribute("sum");
		
		int squared = sum * sum;
		
		PrintWriter pw = res.getWriter();
		pw.println("Square of sum is: " + squared);
	}
}