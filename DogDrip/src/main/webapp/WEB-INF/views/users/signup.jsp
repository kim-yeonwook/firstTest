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
<input type="text" class="name" name="name"><br>
아이디<br>
<input type="text" class="id" name="userId"> <input type="button" class="checkId" value="중복체크"><br>
비밀번호<br>
<input type="password" class="password" name="password"><br>
비밀번호 확인<br>
<input type="password" class="passwordCheck" name="passwordCheck"><br>
이메일<br>
<input type="email" class="email" name="email"><br>
휴대전화<br>
<input type="text" class="phone" name="phone"><br>

<input type="button" class="userSignUp" value="가입">
<input type="button" class="userSignUpCancle" value="취소">
</form>
</body>

<script>

$(function(){
	
	//아이디 체크 버튼 클릭
	$("#checkId").click(function(){
		
		
		
	});
	
	//회원가입 버튼 클릭
	$("userSignUp").click(function(){
		
		const userId = $("userId").val();
		const password = $("password").val();
		const name = $("name").val();
		const email = $("email").val();
		const phone = $("phone").val();
		
		const user = {
				userId : userId,
				password : password,
				name : name,
				email : email,
				phone : phone
		}
		
		$.ajax({
			type: "POST",
			url: "/user/signup",
			headers: {"content-Type" : "application/json"},
			dataType: "text",
			data: JSON.Stringify(user),
			success: function(result){
				if(result == "joinSuccess"){
					loaction.href = "/";
				}else{
					alert("회원가입 실패!");
				}
			},
			error: function(){
				console.log("통신 실패!");
			}
		});
		
	});
	
	//취소 버튼 클릭
	$("userSignUpCancle").click(function(){
		
		
		
	});
	
});

</script>

</html>