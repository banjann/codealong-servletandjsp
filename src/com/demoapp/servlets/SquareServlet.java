package com.demoapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int toSquare = (int) req.getAttribute("to-square");
		int squared = toSquare * toSquare;
		
		PrintWriter printWriter = res.getWriter();
		printWriter.println("Squared of sum is: " + squared);
	}
}
