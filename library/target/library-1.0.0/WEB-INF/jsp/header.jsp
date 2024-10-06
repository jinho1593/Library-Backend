<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="header">
    <!-- 좌측의 로고 버튼 -->
    <div class="header-logo">
        <button onclick="location.href='${pageContext.request.contextPath}/main'">
            <img src="${pageContext.request.contextPath}/resources/images/librarylog.png" alt="로고" class="logo">
        </button>
    </div>

    <!-- 중앙의 통합 자료 검색 바 -->
    <div class="search-bar">
        <input type="text" placeholder="통합자료검색">
        <button>검색</button>
    </div>

    <!-- 우측의 버튼들 -->
	<div class="buttons">
	    <c:if test="${not empty sessionScope.userInfo}">
	        <button onclick="location.href='${pageContext.request.contextPath}/mypage/my'">마이페이지</button>
	        <button onclick="location.href='${pageContext.request.contextPath}/member/logout'">로그아웃</button>
	    </c:if>
	    <c:if test="${empty sessionScope.userInfo}">
	        <button onclick="location.href='${pageContext.request.contextPath}/member/login'">로그인</button>
	        <button onclick="location.href='${pageContext.request.contextPath}/member/signup'">회원가입</button>
	    </c:if>
	    <button>문의등록</button>
	</div>
</div>

</body>
</html>