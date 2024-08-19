<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h1>test main</h1>
	<form action="${pageContext.request.contextPath}/checkTest" method="post">
	<button type="submit">진유진 사랑해</button></form>
	<h2>전체회원 수 ${ message }</h2>
</body>
</html>
