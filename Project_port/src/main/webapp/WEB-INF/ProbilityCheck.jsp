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

		<input type="text" name="charange">(試行する回数)<br>
		 <input type="text" name="win">(当たる回数)<br> 
			
			
			 <input type="text" name="per">(確率(%))<br> 
		
			
			<input type="submit"value="送信">

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