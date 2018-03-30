
<%@ page import="java.io.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
				HttpSession s = request.getSession();
				s.setAttribute("username", null);
				HttpServletResponse httpResponse = (HttpServletResponse)response;

				response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
				httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
				httpResponse.setDateHeader("Expires", 0);
				response.setHeader("Cache-control","no-store");
				session.removeAttribute("username");
				session.invalidate();// Proxies.
			
		
		%>alert("Successfully logged out!");
		<%
	request.getRequestDispatcher("index.jsp").forward(request, response);	%>
</body>
</html>