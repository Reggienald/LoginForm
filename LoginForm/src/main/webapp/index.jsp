<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page errorPage = "login.jsp" %>    
    
<%@ page import="Model.Bean" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<% if(session.getAttribute("Checked-in") == null) {
		response.sendRedirect("login.jsp");
}%>

<h1>Välkommen! <%= session.getValue("username") %></h1>
<h2>Bästa smeknamn till Redon?: <%if(session.getAttribute("nickname") == null){
	out.print("This is where your fav nickname will show up");
	}else{
		out.print(session.getValue("nickname"));
	}
	%> </h2><br>


	<form action="updateServlet" method="POST">
		<select name="nicknames">
			<option>Red</option>
			<option>Reggie</option>
			<option>Shaqe</option>
		</select>
		<input type="submit" value="submit">
	</form>


<form action="SessionRemoveServlet" method="POST"> 

		<input type="submit" value="Sign Out">	
	
	</form>
 




</body>
</html>