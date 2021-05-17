package com.demoapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
for a class to become a servlet, it needs to extend HttpServlet and implement methods that will perform data processing with qualified names(i.e service(), doPost(), doGet(), etc..)
*/
public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		
		int sum = firstNumber + secondNumber;
		
		PrintWriter printWriter = res.getWriter();
		printWriter.println("Sum is: " + sum);
	}
}
