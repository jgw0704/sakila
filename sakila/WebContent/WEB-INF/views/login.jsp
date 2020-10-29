<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
	<form method="post" id="loginAction" action="${pageContext.request.contextPath}/LoginServlet">
		<table class="table table-borderless" style="margin: auto; text-align: center; width: 15%;">
		<tr>
		</tr>
			<tr>
				<td>
				<i class="material-icons" style="font-size:220px">person</i>
					<div class="container">
						<input type="text" style="width: 100%" placeholder="Email" name="email" id="email">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="container">
						<input type="password" style="width: 100%" placeholder="PW" name="password" id="password">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="container">
						<button type="button" class="btn btn-primary btn-block" id="btn">Log-in</button>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>