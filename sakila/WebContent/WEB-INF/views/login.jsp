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
			if($("#ID").val()=="") {
				alert("아이디를 입력해주세요");
				return;
			} else if($("#PW").val()=="") {
				alert("패스워드를 입력해주세요");
				return;
			}
			$("#LoginAction").submit();
		});
	});
</script>
</head>
<body>
	<div>
		오늘 접속자 수 : ${stats.cnt} / 전체 접속자 수 : ${totalCount}
	</div>
	<form>
		<div>
			<input type="text" placeholder="ID" id="ID">
		</div>
		<div>
			<input type="password" placeholder="PW" id="PW">
		</div>
		<div>
			<button type="button" id="btn">Log-in</button>
		</div>
	</form>
</body>
</html>