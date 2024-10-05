<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>예약 현황</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reservation-status.css"> <!-- 추가된 CSS 파일 -->
</head>
<body>
    <%@ include file="/WEB-INF/jsp/header.jsp" %>

    <div class="reservation-status-container">
        <h2>예약 현황</h2>
        
        <!-- 현재 예약 중인 항목 -->
        <div class="current-reservations">
            <h3>현재 예약 중인 항목</h3>
            <ul>
                <li>항목 1</li>
                <li>항목 2</li>
                <li>항목 3</li>
            </ul>
        </div>

        <!-- 예약 취소 내역 -->
        <div class="canceled-reservations">
            <h3>예약 취소 내역</h3>
            <ul>
                <li>항목 A - 취소일: YYYY-MM-DD</li>
                <li>항목 B - 취소일: YYYY-MM-DD</li>
                <li>항목 C - 취소일: YYYY-MM-DD</li>
            </ul>
        </div>
    </div>

    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
