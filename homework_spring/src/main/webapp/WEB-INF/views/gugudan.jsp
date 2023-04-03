<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>
	<h1 style="font-size: 15;margin-left: 500px;">±¸±¸´Ü </h1>
	<table border="1">
		<%for (int i = 1; i< 10; i++) {%>
		<tr>
			<%for (int j = 1; j <10;j++)  {%>
			<th><%=j %> * <%=i %> = <%= i*j %></th>
			<%} %>
		</tr>
		<%} %>
	</table>
</body>
</html>