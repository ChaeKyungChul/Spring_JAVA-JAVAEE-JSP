<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     이름 : <%=session.getAttribute("name") %>
   <br>
   소속국가 : <%=session.getAttribute("nation") %>
   <br>
   세션 지속 시간 : <%=session.getMaxInactiveInterval() %>
   
   세션종료 : <a href="invalidate.jsp">호일동</a>
</body>
</html>