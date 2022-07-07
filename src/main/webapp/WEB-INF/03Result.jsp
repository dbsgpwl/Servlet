<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Resylt.JSP</h1>

			<%
				String email=request.getParameter("email");
				String pwd=request.getParameter("pwd");
				String addr1=request.getParameter("addr1");
				String addr2=request.getParameter("addr2");
				
				
				
			%>
			
			Email : <%=email %><br>
			PW :	 <%=pwd %><br>
			Addr1 : <%=addr1 %><br>
			Addr2 : <%=addr2 %><br>
</body>
</html>