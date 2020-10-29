<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- // https://ovenapp.io/view/LUSGABWM441xZ7joC1clIEvOpqiYuHBK#K7XKt -->
<title>Index</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
	h1.a:after {
        content: "";
        display: block;
        width: 800px;
        border-bottom: 1px solid #bcbcbc;
        margin: 20px 0px;
      }
</style>
</head>
<body class="container">
	<h1>index</h1>
	<div>
		<span><hr>${loginStaff.email}</hr></span>
		<p><%=session.getAttribute("")%>관리자님 </p>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/auth/LogoutServlet">로그아웃</a>
	</div>
</body>
</html>