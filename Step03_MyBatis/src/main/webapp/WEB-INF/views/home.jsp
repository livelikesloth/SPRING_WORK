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
		<h1>인덱스 입니다.</h1>
		<ul>
			<li><a href="${pageContext.request.contextPath}/member/list.do">회원 목록 보기</a></li>
			<li><a href="${pageContext.request.contextPath}/todo/list.do">할일 목록 보기</a></li>
			<li><a href="${pageContext.request.contextPath}/send.do">json테스트</a></li>
			<li><a href="${pageContext.request.contextPath}/send2.do">json테스트2</a></li>
			<li><a href="${pageContext.request.contextPath}/send3.do">json테스트3</a></li>
			<li><a href="${pageContext.request.contextPath}/send4.co">json테스트4</a></li>
		</ul>
		<h2>공지사항</h2>
			<c:forEach var="tmp" items="${requestScope.noticeList}">
				<li>${tmp}</li>
			</c:forEach>
	</div>
</body>
</html>