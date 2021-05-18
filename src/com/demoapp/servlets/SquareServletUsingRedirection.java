package com.demoapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
		value = "/squareRedirection",
		initParams = {
				@WebInitParam(name = "name", value = "Ivan ServletConfig Version")
				}
		)
public class SquareServletUsingRedirection extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//using session in storing client information
//		HttpSession session = req.getSession();
//		int sum = (int) session.getAttribute("sum");
		
		//using cookie in storing client information
		int sum = 0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		
		int squared = sum * sum;
		
		//getting stored data from ServletContext configured from web.xml
		ServletContext servletContext = getServletContext();
		String nameFromServletContext = servletContext.getInitParameter("name");
		String phoneFromServletContext = servletContext.getInitParameter("phone");
		
		ServletConfig servletConfig = getServletConfig();
		String nameFromServletConfig = servletConfig.getInitParameter("name");
		
		PrintWriter pw = res.getWriter();
		pw.println("Hi " + nameFromServletContext + "!, " + "How's your phone, " + phoneFromServletContext + "?");
		pw.println("Hi " + nameFromServletConfig + "!");
		pw.println("Square of sum is: " + squared);
	}
}
