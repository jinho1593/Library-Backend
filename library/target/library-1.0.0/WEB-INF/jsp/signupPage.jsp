<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/signupPage.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
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

    // 아이디 중복 체크
    function checkUserId() {
        var userId = $('#userId').val();

        // 아이디 입력이 없으면 메시지를 숨김
        if (userId.length === 0) {
            $('#userIdHelp').text("").css("color", "");
            return;
        }

        // 입력이 있을 때만 중복 체크를 수행
        $.ajax({
            url: "/member/checkUserId",
            type: "POST",
            data: { userId: userId },
            dataType: "text",
            success: function(response) {
                if (response === 'true') {
                    $('#userIdHelp').text("이미 사용 중인 아이디입니다.").css("color", "red");
                } else {
                    $('#userIdHelp').text("사용 가능한 아이디입니다.").css("color", "green");
                }
            },
            error: function() {
                $('#userIdHelp').text("아이디 중복 체크 중 오류가 발생했습니다.").css("color", "red");
            }
        });
    }

    // 이메일 중복 체크
    function checkEmail() {
        var email = $('#email').val();

        // 이메일 입력이 없으면 메시지를 숨김
        if (email.length === 0) {
            $('#emailHelp').text("").css("color", "");
            return;
        }

        // 입력이 있을 때만 중복 체크 수행
        $.ajax({
            url: "/member/checkEmail",
            type: "POST",
            data: { email: email },
            dataType: "text",
            success: function(response) {
                if (response === 'true') {
                    $('#emailHelp').text("이미 사용 중인 이메일입니다.").css("color", "red");
                } else {
                    $('#emailHelp').text("사용 가능한 이메일입니다.").css("color", "green");
                }
            },
            error: function() {
                $('#emailHelp').text("이메일 중복 체크 중 오류가 발생했습니다.").css("color", "red");
            }
        });
    }

    $(document).ready(function() {
        // 아이디와 이메일 입력 필드에서 입력이 변경될 때마다 중복 체크 함수 호출
        $('#userId').on('input', checkUserId);
        $('#email').on('input', checkEmail);
    });
</script>

</head>
<body>
<div class="container">
    <h2>회원가입</h2>

    <form action="/member/signup" method="post" onsubmit="return validateForm();">
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" required>
        </div>

        <div class="form-group">
            <label for="userId">아이디</label>
            <input type="text" id="userId" name="userId" required>
            <small id="userIdHelp" class="form-text"></small> <!-- 결과를 표시할 공간 -->
        </div>

        <div class="form-group">
            <label for="email">이메일</label>
            <input type="email" id="email" name="email" required>
            <small id="emailHelp" class="form-text"></small> <!-- 결과를 표시할 공간 -->
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
