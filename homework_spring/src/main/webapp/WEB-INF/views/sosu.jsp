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
	
		for(int i = 2; i < 1000;i++) {
			boolean vb = true;
			for(int j =2; j<i; j++) {
				if(i%j == 0) {
					vb = false;
					break;
				}
				
			}
			if(vb) {
				out.print(i+" ");
			}
			
		}
	%>
</body>
</html>