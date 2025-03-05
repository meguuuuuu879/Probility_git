<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="Model.Mathema"%>

<%
Mathema math = (Mathema) request.getAttribute("math");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
	

		<%=math.getCharange()%>回試行して<br>
		
		<%=math.getWin()%>回以上当たる確率は<br>
		<%=math.getAnswer()%>%です<br>


	</p>




</body>
</html>　