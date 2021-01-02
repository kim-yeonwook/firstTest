<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp"/>

<form action="<c:url value='/board/write'/>" method="post">
	<input type="text" name="writer" value="${login.boardNo}" readonly><br>
	<input type="text" name="title"><br>
	<textarea rows="5" name="content"></textarea><br>
	<input type="submit" value="등록">
</form>

<jsp:include page="../include/footer.jsp"/>