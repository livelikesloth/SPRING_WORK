<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/play.jsp</title>
</head>
<body>
	<div class="container">
		<h1>로그인된 회원 전용 공간 입니다.</h1>
		<p>
			<strong>${id }</strong>님 신나게 놀아요.
			<a href="${pageContext.request.contextPath}/">돌아가기</a>
		</p>
	</div>

</body>
</html>