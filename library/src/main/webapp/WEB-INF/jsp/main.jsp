<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
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
            <button>로그인</button>
            <button>회원가입</button>
            <button>문의등록</button>
        </div>
    </div>
</body>
</html>
