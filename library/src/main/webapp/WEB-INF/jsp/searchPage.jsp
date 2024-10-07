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
        
        <div class="search-results">
            
                <table class="results-table">
                    <thead>
                        <tr>
                            <th>ISBN</th>
                            <th>제목</th>
                            <th>저자</th>
                            <th>카테고리</th>
                            <th>상태</th>
                            <th>대출 신청</th> <!-- 대출 신청 버튼을 위한 열 추가 -->
                        </tr>
                    </thead>
                    <c:if test="${not empty searchResults}">
                    <tbody>
                        <c:forEach var="book" items="${searchResults}">
                            <tr>
                                <td>${book.isbn}</td>
                                <td>${book.title}</td>
                                <td>${book.author}</td>
                                <td>${book.categoryType}</td>
                                <td>${book.stateType}</td>
                                <td>
                                    <form action="/loan/loanBook" method="post">
                                        <input type="hidden" name="isbn" value="${book.isbn}" />
                                        <button type="submit" class="loan-button">신청</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    </c:if>
                </table>
            

            <c:if test="${empty searchResults}">
                <p class="no-results">입력하신 정보와 일치하는 도서가 존재하지 않습니다.</p>
            </c:if>
        </div>
    </div>
</body>
</html>
