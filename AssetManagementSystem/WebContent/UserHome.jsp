<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
	if (session.getAttribute("username") == null) {

		request.getRequestDispatcher("index.jsp").forward(request, response);
	} else {
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<right><a href="http://profile.jsp"><%
		out.println(session.getAttribute("username"));
	%>
	</a></right>
	<center>
		<h1>HOME</h1>
	</center>
	
	<a href="logout.jsp">Logout</a>
	
	
</body>
<%
	}
%>
</html>