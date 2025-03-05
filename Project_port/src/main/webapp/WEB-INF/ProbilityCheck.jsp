<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String errorMsg = (String) request.getAttribute("errorMsg");


%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>サイトへようこそ</h1>
	<h1>計算</h1>

	<form action="ProbilityCheck" method="post">

		<input type="text" name="charange">(回試行して)<br> <input
			type="text" name="win">(回当たる)<br> <input type="submit"
			value="送信">

	</form>

	<%
	if (errorMsg != null) {
	%>
	<p><%=errorMsg%></p>

	<%
	}
	%>

</body>
</html>