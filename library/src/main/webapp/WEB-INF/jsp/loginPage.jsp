<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginPage.css">
</head>
<body>
    <h1>로그인 페이지</h1>
     <form action="${pageContext.request.contextPath}/checkTest" method="post">
        <button type="submit">테스트 데이터 확인</button>
    </form>
    
        <p>${message}</p> <!-- DB에서 가져온 값을 출력 -->
</body>
</html>
