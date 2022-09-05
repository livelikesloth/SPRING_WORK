<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/member/updateform.jsp</title>
</head>
<body>
<div class="container">
	<h1>회원 정보 수정 폼 입니다.</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num}"/>
		<div>
			<label for="num">번호</label>
			<input type="text" id="num" value="${requestScope.dto.num }" disabled/>
		</div>
		<div>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" value="${dto.name }"/>
		</div>
		<div>
			<label for="addr">주소</label>
			<input type="text" name="addr" id="addr" value="${dto.addr}"/>
		</div>
		<button type="submit">수정확인</button>
		<button type="reset">취소</button>
	</form>
</div>
</body>
</html>














