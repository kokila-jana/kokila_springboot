<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1
{
color:red;
}
</style>
</head>
<body>
	<h1>Hello</h1>
	<% int a=10; %>
	<% out.println(a+"<br>"); %>
	<%! int b=20; %>
	<%=b %>
</body>
</html>
