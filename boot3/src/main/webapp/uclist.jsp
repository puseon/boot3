<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="60%">
<tr>
	<td>uid</td>
	<td>cid</td>
	<td>操作</td>
</tr>
<c:forEach items="${list }" var="li">
<tr>
	<td>${li.user.name }</td>
	<td>${li.category.cname }</td>
	<td>
	<a href="delete?uid=${li.uid }&cid=${li.cid}">删除</a>
	<a href="findByid?uid=${li.uid }&cid=${li.cid}">修改</a>
	</td>
</tr>
</c:forEach>
</table>

</body>
</html>
<a href="goInput">save</a>