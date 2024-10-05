<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>책꽂이</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bookshelf.css">
</head>
<body>
    <%@ include file="/WEB-INF/jsp/header.jsp" %>

    <div class="bookshelf-container">
        <h2>내 책꽂이</h2>
        
        <!-- 책꽂이 예시 3개 -->
        <div class="bookshelf-examples">
            <ul>
                <li><a href="${pageContext.request.contextPath}/member/bookshelfDetail?bookshelfId=1">책꽂이 1</a></li>
                <li><a href="${pageContext.request.contextPath}/member/bookshelfDetail?bookshelfId=2">책꽂이 2</a></li>
                <li><a href="${pageContext.request.contextPath}/member/bookshelfDetail?bookshelfId=3">책꽂이 3</a></li>
            </ul>
        </div>

        <!-- 서재 추가 버튼 -->
        <button class="bookshelf-button" onclick="location.href='${pageContext.request.contextPath}/member/addBookshelf'">서재 추가</button>
    </div>

    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
