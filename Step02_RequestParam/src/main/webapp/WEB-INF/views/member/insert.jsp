<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/member/insert.jsp</title>
</head>
<body>
	<p> 회원정보를 클라이언트에서 전송 받았습니다.</p>
	<p>${param.num } | ${param.name } | ${param.addr }</p>
	<a href="${pageContext.request.contextPath}/">인덱스로 가기</a>
</body>
</html>