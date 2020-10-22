<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#btn").click(function(){
			if($("#email").val()=="") {
				alert("이메일을 입력해주세요");
				return;
			} else if($("#password").val()=="") {
				alert("패스워드를 입력해주세요");
				return;
			}
			$("#loginAction").submit();
		});
	});
</script>
</head>
<body>
	<div>
		오늘 접속자 수 : ${stats.cnt} / 전체 접속자 수 : ${totalCount}
	</div>
	<form method="post" id="loginAction" action="${pageContext.request.contextPath}/">
		<div>
			<input type="text" placeholder="Email입력" name="email" id="email">
		</div>
		<div>
			<input type="password" placeholder="PW입력" name="password" id="password">
		</div>
		<div>
			<button type="button" id="btn">Log-in</button>
		</div>
	</form>
</body>
</html>