
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
   <div class="container">
      <h1>인덱스 페이지 입니다.</h1>
      <ul>
      	<li><a href="study.do">공부하러 가기</a></li>
      	<li><a href="sub/play.do">놀러가기</a></li>
      </ul>
      <img src="${pageContext.request.contextPath}/images/yellowbird.png"/>
      <img src="images/yellowbird.png" alt="" />
      <h2>공지사항</h2>
      <ul>
         <c:forEach var="tmp" items="${requestScope.noticeList }">
            <li>${tmp }</li>
         </c:forEach>
      </ul>
   </div>
</body>
</html>