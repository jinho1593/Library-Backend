<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>	
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>문의 등록</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/inquiryRegister.css">
</head>

<body>
    <div class="register-container">
        <h2>문의 등록</h2>
        <form action="${pageContext.request.contextPath}/inquiry/register" method="post">
            <div class="form-group">
                <label for="categoryType">문의 유형:</label>
                <select id="categoryType" name="categoryType" required>
                    <option value="">선택하세요</option>
                    <option value="도서 신청">도서 신청</option>
                    <option value="문제 신고">문제 신고</option>
                    <option value="기타 문의">기타 문의</option>
                </select>
            </div>

            <div class="form-group">
                <label for="title">제목:</label>
                <input type="text" id="title" name="title" required placeholder="제목을 입력하세요">
            </div>

            <div class="form-group">
                <label for="content">내용:</label>
                <textarea id="content" name="content" rows="4" required placeholder="내용을 입력하세요"></textarea>
            </div>

            <div class="button-container">
                <button type="submit" class="submit-button">등록</button>
            </div>
        </form>
    </div>
</body>
</html>
