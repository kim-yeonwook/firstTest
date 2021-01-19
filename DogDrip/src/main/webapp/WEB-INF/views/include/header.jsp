<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Custom CSS -->
<link rel="stylesheet" href="<c:url value='/css/agency.css'/>" >

</head>
<a href="<c:url value='/'/>">DOGDRIP</a>
<div class="menu">
<ul class="ulCss">
<li class="cummunity">
<span class="hoverEvent">커뮤니티</span>
<ul class="hide">
<li>주식 / 재테크 판</li>
<li>인터넷 방송 판</li>
<li>탈것 판</li>
<li>익명 판</li>
<li>컴퓨터 / IT 판</li>
<li>영상 판</li>
<li>고민 상담 판</li>
<li>스포츠 판</li>
<li>요리 판</li>
<li>덕후 판</li>
<li>창작 판</li>
<li>음악 판</li>
<li>정치 사회 판</li>
<li>젠더 이슈 판</li>
</ul>
</li>

</ul>
</div>
<a href="">놀이터</a>
<c:if test="${signin == null}">
<a href="<c:url value='/user/signin'/>">로그인</a>
</c:if>
<c:if test="${sign != null}">
<a href="<c:url value='/user/signin'/>">마이페이지</a>
<a href="<c:url value='/user/signin'/>">로그아웃</a>
</c:if>
<script>

//메뉴 드롭다운
$(function(){
	
	$(".menu ul span").hover(function(){
		$(".menu ul ul").css("display" , "");
		$(".menu ul ul li").css("display" , "");
	});
});

</script>
