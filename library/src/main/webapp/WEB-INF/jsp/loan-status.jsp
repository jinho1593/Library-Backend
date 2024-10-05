<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대출 현황</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loan-status.css"> 
</head>
<body>
    <%@ include file="/WEB-INF/jsp/header.jsp" %>

    <div class="loan-status-container">
        <h2>대출 현황</h2>
        <div class="current-loans">
            <h3>현재 대출 중인 도서</h3>
            <ul>
                <li>도서 제목 1</li>
                <li>도서 제목 2</li>
                <li>도서 제목 3</li>
            </ul>
        </div>

        <div class="previous-loans">
            <h3>이전 대출 내역</h3>
            <ul>
                <li>도서 제목 A - 대출일: YYYY-MM-DD</li>
                <li>도서 제목 B - 대출일: YYYY-MM-DD</li>
                <li>도서 제목 C - 대출일: YYYY-MM-DD</li>
            </ul>
        </div>
    </div>

    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
