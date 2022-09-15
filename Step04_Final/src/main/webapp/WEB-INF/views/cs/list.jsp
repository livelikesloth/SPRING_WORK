<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/cs/list.jsp</title>
<style>
	.card{
		width:250px;
		border:1px solid black;
		flex-direction:column;
	}
	.card-img{
		hetght:150px;
		display:flex;
	}
	.card-head{
		height:50px;
		background-color: thistle;
	}
	.card-main{
	height:100px;
	}
	.card-footer{
	height:50px;
	background-color:thistle;
	}
</style>
</head>
<body>
	<div class="card">
		<div class="card-img">
			<p>이미지</p>
		</div>
		<div class="card-head">
			<p>헤더</p>
		</div>
		<div class="main">
			<p>메인내용</p>
		</div>
		<div class="card-footer">
			<p>푸터</p>
		</div>
	</div>

</body>
</html>