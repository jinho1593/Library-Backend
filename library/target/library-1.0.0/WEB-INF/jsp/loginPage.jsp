<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginPage.css">

	<script>
        function validateForm() {
            // 폼 필드의 값을 가져옴
            var userId = document.getElementById("userId").value;
            var password = document.getElementById("password").value;

            // 입력 값 검증: 아이디와 비밀번호가 비어있는지 확인
            if (userId.trim() === "" || password.trim() === "") {
                alert("아이디와 비밀번호를 모두 입력해주세요.");
                return false; // 폼 제출 중지
            }

            return true; // 폼 제출 허용
        }
    </script>

</head>
<body>

<div class="login_container">
    <h2>로그인</h2>
    
    <!-- 에러 메시지 출력 영역 -->
    <c:if test="${not empty errorMessage}">
        <p style="color: red; text-align: center;">${errorMessage}</p>
    </c:if>

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
