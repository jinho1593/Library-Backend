<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginPage.css">
</head>
<body>
	<div class="header">
		<div class="header-logo">
		 	<button onclick="location.href='${pageContext.request.contextPath}/main'">
                <img src="${pageContext.request.contextPath}/resources/images/librarylog.png" alt="로고" class="logo">
            </button>
		</div>
	</div>
	
	<div class="login-form">
	    <div class="input-group">
	        <input type="text" placeholder="아이디" name="user_id" maxlength="20">
	    </div>
	    <div class="input-group">
	        <input type="password" placeholder="비밀번호" name="password" maxlength="20">
	        <input class="submit-login" type="submit" value="로그인"> 
	    </div>
	</div>
	
	<button>간편회원가입</button>
	
	<div class="sns-login-form">
	    <div>SNS 계정으로 로그인</div>
	    <button>네이버</button>
	    <button>카카오</button>
	    <button>구글</button>
	</div>

</body>
</html>