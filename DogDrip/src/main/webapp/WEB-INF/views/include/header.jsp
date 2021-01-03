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
<table>
	<tr>
	<td><a href="">DOGDRIP</a></td>
	<td><a href="">커뮤니티</a></td>
	<td><a href="">놀이터</a></td>
	<c:if test="${signin == null}">
	<td><a href="<c:url value='/user/signin'/>">로그인</a></td>
	</c:if>
	<c:if test="${sign != null}">
	<td><a href="<c:url value='/user/signin'/>">마이페이지</a></td>
	<td><a href="<c:url value='/user/signin'/>">로그아웃</a></td>
	</c:if>
	</tr>
</table>
