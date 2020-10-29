<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<body>
<div class="row">
<div class="jumbotron">
	<h1>Sakila Movie</h1>
	<form method="post" action="${pageContext.request.contextPath}/LoginServlet">
		<i class="material-icons" style="font-size:30px">person서울지점</i>
		<h4>Menu</h4>
		<table>
			<tr>
				<td><p>홈</p></td>
			</tr>
			<tr>
				<td>영화반납</td>
			</tr>
			<tr>
				<td><hr>회원목록 관리</hr></td>
			</tr>
			<tr>
				<td>영화목록 관리</td>
			</tr>
			<tr>
				<td>영화재고 관리</td>
			</tr>
			<tr>
				<td>영화배우 관리</td>
			</tr>
			<tr>
				<td>영화 출연배우 등록</td>
			</tr>
			<tr>
				<td><hr>매장 통계</hr></td>
			</tr>
			<tr>
				<td>MVP</td>
			</tr>
		</table>
	</form>
</div>  
</div>