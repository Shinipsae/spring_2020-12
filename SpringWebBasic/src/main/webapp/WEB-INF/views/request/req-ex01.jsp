<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Request 컨트롤러를 이용한 요청 처리 작업!</h2>
	<p> Controller 테스트 중입니다~ </p>
	
	<form action="/web/request/basic01" method="get">
		<p>
			<input type="submit" value="get 요청!">
		</p>
	</form>
	
	<form action="/web/request/basic01" method="post">
		<p>
			<input type="submit" value="post 요청!">
		</p>
	</form>
	
</body>
</html>