<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Resultado da media aritmética</h1>
   <%
      float media;
      media = (float)request.getAttribute("media");
      out.println("<h2>" + media + "</h2>");
   %>
</body>
</html>