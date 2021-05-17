package com.demoapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
for a class to become a servlet, it needs to extend HttpServlet and implement methods that will perform data processing with qualified names(i.e 
*/
public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		
		int sum = firstNumber + secondNumber;
		
/*
you can call a servlet from a servlet using RequestDispatcher (interface) from the HttpServletRequest and indicate the URL of the servlet to be called. also, you can setAttribute to pass a parameter to the servlet
and call get the parameter using getAttribute from the servlet to be called. and it is important to forward the request and request via the dispatcher

NOTE: the client won't be notified that another servlet was called by servlet "serving" its request
*/
		req.setAttribute("to-square", sum);
		RequestDispatcher dispatcher = req.getRequestDispatcher("squared");
		dispatcher.forward(req, res);
	}
}
