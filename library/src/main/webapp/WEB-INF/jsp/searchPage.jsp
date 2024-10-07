<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>도서 검색 결과</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/searchPage.css">
</head>

<body>
    <div class="container">
        <!-- 검색어 표시 -->
        <h1>검색 결과: "${query}"</h1>
        
        <!-- 검색 결과 목록 -->
        <div class="search-results">
            <!-- 검색 결과가 있을 때 -->
            <c:if test="${not empty searchResults}">
                <table class="results-table">
                    <thead>
                        <tr>
                            <th>ISBN</th>
                            <th>제목</th>
                            <th>저자</th>
                            <th>카테고리</th>
                            <th>상태</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="${searchResults}">
                            <tr>
                                <td>${book.isbn}</td>
                                <td>${book.title}</td>
                                <td>${book.author}</td>
                                <td>${book.categoryType}</td>
                                <td>${book.stateType}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>

            <!-- 검색 결과가 없을 때 -->
            <c:if test="${empty searchResults}">
                <p class="no-results">입력하신 정보와 일치하는 도서가 존재하지 않습니다.</p>
            </c:if>
        </div>
    </div>
</body>
</html>