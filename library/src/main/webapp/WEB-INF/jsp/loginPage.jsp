<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginPage.css">
</head>
<body>

<div class="login_container">
    <h2>로그인</h2>

    <form action="/member/login" method="post" onsubmit="return validateForm();">
        <div class="form-group">
            <label for="userId">아이디</label>
            <input type="text" id="userId" name="userId" required>
        </div>

        <div class="form-group">
            <label for="password">비밀번호</label>
            <input type="password" id="password" name="password" required>
        </div>

        <input type="submit" value="로그인">
    </form>
</div>

</body>
</html>
