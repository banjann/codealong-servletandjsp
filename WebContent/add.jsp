<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		int firstNumber = Integer.parseInt(request.getParameter("num1"));
		int secondNumber = Integer.parseInt(request.getParameter("num2"));
			
		int quotient = firstNumber / secondNumber;
		
		out.println("Sum is: " + quotient);
		
		//exception handling in JSP, it will call the errorPage stated above if an exception has been thrown
	%>
</body>
</html>