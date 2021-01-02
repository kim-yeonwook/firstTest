<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="../include/header.jsp"/>

<table>
	<tr>
	<td>번호</td>
	<td>작성자</td>
	<td>작성글</td>
	<td>작성날짜</td>
	<td>조회수</td>
	</tr>
	<!-- 계시글 -->
	<c:forEach var="article" items="${articles}">
	<tr>
	<td>${article.boardNo}</td>
	<td>${article.writer}</td>
	<td>${article.content}</td>
	<td>
	<fmt:formatDate value="${article.regDate}" pattern="yyyy년 MM월 dd일a hh:mm"/></td>
	<td>${article.viewCnt}</td>
	</tr>
	</c:forEach>
	
</table>

<jsp:include page="../include/footer.jsp"/>