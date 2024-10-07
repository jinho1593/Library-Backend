<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MyPage</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/inquiry.css">
</head>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp" %>

    <div class="inquiry-container">
        <h2>1:1 문의 내역</h2>
        <table class="inquiry-table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>문의유형</th>
                    <th>제목</th>
                    <th>상태</th>
                    <th>등록일</th>
                </tr>
            </thead>
            <c:if test="${not empty inquiryList}">
            <tbody>
                <c:forEach var="inquiry" items="${inquiryList}">
                    <tr>
                        <td>${inquiry.inquiryId}</td>
                        <td>${inquiry.categoryType}</td>
                        <td>${inquiry.title}</td>
						<td>${inquiry.stateType}</td>
                        <td>${inquiry.createDate}</td>
                    </tr>
                </c:forEach>
            </tbody>
            </c:if>
        </table>
        
        <c:if test="${empty inquiryList}">
        	<p class="no-results">등록된 문의가 없습니다.</p>
        </c:if>
        
		<div class="button-container">
            <button class="inquiry-button" onclick="location.href='${pageContext.request.contextPath}/inquiry/register'">문의하기</button>
        </div>    
        
        </div>
    
    <%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
