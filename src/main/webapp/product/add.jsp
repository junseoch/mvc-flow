<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>

	<form action="/flow/add-ok.product" method="get">
	
		<div>
			<p>상품 이름<input name="productName"/></p>
		</div>
		<div>
			<p>상품 가격<input name="productPrice"/></p>
		</div>
		<div>
			<p>상품 재고<input name="productStock"/></p>
		</div>
	
		<button>상품 등록</button>
	</form>
	

</body>
</html>