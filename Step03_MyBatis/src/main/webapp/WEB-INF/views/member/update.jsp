<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/view/member/update.jsp</title>
</head>
<body>
	<div class="container">
		<h1>수정</h1>
		<p>	
			<strong>${param.name }</strong>님의 정보를 수정했습니다.
			<a href="${pageContext.request.contextPath}/member/list.do">목록보기</a>
		</p>
	</div>

</body>
</html>