<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더</title>
</head>
<body>
	<!-- 로그인 상태라면, 로그아웃 버튼이 나오도록 구현하기 jstl문법 사용해서 -->
	
	<c:if test="${not empty memberEmail}">
		<a href="/flow/add.product">상품등록</a>
		<a href="/flow/list.product">상품리스트</a>
		<a href="/flow/edit.product">상품수정</a>
		
		<button><a href="/flow/logout-ok.member">로그아웃</a></button>
	</c:if> 
	
	<c:if test="${empty memberEmail} ">
		<a href="/flow/join.member">회원가입</a>
		<a href="/flow/login.member">로그인</a>
	</c:if> 

</body>
</html>