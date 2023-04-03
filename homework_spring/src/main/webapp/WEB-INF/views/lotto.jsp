<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		boolean Check =true;
		int a[] = new int[6];
		int number=0;
		for (;;) {
			int lotto = (int)(Math.random()*100)+1;
			a[number] = lotto;
			if(Check == false)
				for(int j = 0; j <a.length; j++) {
					if(a[j] == lotto) {
						lotto = (int)(Math.random()*100)+1;
					}
				}
			Check = true;
			out.print(number+1 + "번째 숫자 : "+lotto);
			number=number+1;
			out.print("<br>");
			
		}
		
	%>
</body>
</html>