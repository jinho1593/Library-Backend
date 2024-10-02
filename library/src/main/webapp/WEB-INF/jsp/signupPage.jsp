<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/signupPage.css">
    <script>
        // 비밀번호 일치 여부를 확인하는 함수
        function validateForm() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            if (password !== confirmPassword) {
                alert("비밀번호가 일치하지 않습니다.");
                return false; // 폼 제출을 막음
            }
            return true; // 폼 제출 허용
        }
    </script>
</head>
<body>

<div class="container">
    <h2>회원가입</h2>

    <!-- 비밀번호 확인을 위한 validateForm 함수 호출 -->
    <form action="/member/signup" method="post" onsubmit="return validateForm();">
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" required>
        </div>

        <div class="form-group">
            <label for="userId">아이디</label>
            <input type="text" id="userId" name="userId" required>
        </div>

        <div class="form-group">
            <label for="email">이메일</label>
            <input type="email" id="email" name="email" required>
        </div>

        <div class="form-group">
            <label for="password">비밀번호</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label for="confirmPassword">비밀번호 재입력</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>
        </div>

        <div class="form-group">
            <label for="phone">휴대전화</label>
            <input type="text" id="phone" name="phone" required>
        </div>

        <input type="submit" value="회원가입">
    </form>
</div>

</body>
</html>
