<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/view/home.jsp</title>
</head>
<body>
	<div class="container">
		<h1>test02의 홈 입니다.</h1>
		<ul>
			<li><a href="dubu.do">두부네 집</a></li>
			<li><a href="yuki.do">유키네 집</a></li>
			<li><a href="soju.do">소주네 집</a></li>
		</ul>
		<h2>공지사항</h2>
		<c:forEach var="tmp" items="${requestScope.noticeList}">
			<li>${tmp}</li>
		</c:forEach>
	</div>
</body>
</html>