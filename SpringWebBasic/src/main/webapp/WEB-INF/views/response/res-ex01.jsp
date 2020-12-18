<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Model 객체에 대해서 알아보기! </h2>
	
	<%--
		<c:url value='/response/test' />
		- value 속성 안에 컨텍스트 루트 경로를 제외한 절대 경로를 작성.
		
	 --%>
	
	<a href="<c:url value='/response/test?age=30'/>">
		테스트 1페이지로~
	</a> <br>
	<a href="<c:url value='/response/test2'/>">
		테스트 2페이지로~
	</a>
	
</body>
</html>