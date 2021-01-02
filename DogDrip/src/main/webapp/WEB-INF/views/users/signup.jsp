<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form>
이름<br>
<input type="text" name="name"><br>
아이디<br>
<input type="text" name="id"> <button></button><br>
비밀번호<br>
<input type="password" name="password"><br>
비밀번호 확인<br>
<input type="password" name="passwordCheck"><br>
이메일<br>
<input type="email" name="email"><br>
휴대전화<br>
<input type="text" name="phone"><br>

<input type="submit" value="회원가입">
</form>
<a href="<c:url value='/user/login'/>">취소</a>
</body>
</html>