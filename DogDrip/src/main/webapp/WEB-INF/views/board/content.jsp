<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../include/header.jsp"/>

<div>${article.boardNo}번 게시물</div><br>

<input type="text" name="writer" value="${article.writer}" readonly><br>
<input type="text" name="title" value="${article.title}" readonly><br>
<textarea rows="5" name="content" readonly>${article.content}</textarea><br>
<input type="submit" value="수정">
<a href="<c:url value='/board/delete'/>">삭제</a>

<form action="<c:url value='/board/delete'/>" method="get">

<input type="hidden" value="${article.boardNo}">

<c:if test="${login.name == article.writer}">
<input id="modBtn" type="button" value="수정">
<input type="submit" value="삭제" onclick="return confirm('정말로 삭제하겠습니까?')">
</c:if>

</form>

<script>
$(function(){
	
	var modifyBtn = $("#modBtn");
	
	modifyBtn.click(function(){
		formElement.attr("action","/board/modify");
		formElement.attr("method","post");
		formElement.submit();
	});
	
});
</script>

<jsp:include page="../include/footer.jsp"/>