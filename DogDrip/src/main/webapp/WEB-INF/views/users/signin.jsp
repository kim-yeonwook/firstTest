<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action="<c:url='/user/login'/>" method="post">
	아이디 <input type="text" name="id"><br>
	패스워드<input type="password" name="password"><br>
	<input type="submit" name="로그인">
	<a href="">회원가입</a>
	<a href="">아이디 찾기</a>
	<a href="">비밀번호 찾기</a>
</form>
</body>
</html>