<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Action的访问</h1>
<h3>通过method方式</h3>
<a href="${pageContext.request.contextPath}/userFind">查询用户</a>
<a href="${pageContext.request.contextPath}/userUpdate">修改用户</a>
<a href="${pageContext.request.contextPath}/userDlete">删除用户</a>
<a href="${pageContext.request.contextPath}/userSave">保存用户</a>

<h3>通过通配符方式</h3>
<a href="${pageContext.request.contextPath}/product_find.action">查询商品</a>
<a href="${pageContext.request.contextPath}/product_update.action">修改商品</a>
<a href="${pageContext.request.contextPath}/product_delete.action">删除商品</a>
<a href="${pageContext.request.contextPath}/product_save.action">保存商品</a>


<h3>通过动态方法访问</h3>
<a href="${pageContext.request.contextPath}/customer!find.action">查询商品</a>
<a href="${pageContext.request.contextPath}/customer!update.action">修改商品</a>
<a href="${pageContext.request.contextPath}/customer!delete.action">删除商品</a>
<a href="${pageContext.request.contextPath}/customer!save.action">保存商品</a>
</body>
</html>