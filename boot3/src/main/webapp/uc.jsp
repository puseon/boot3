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
<form action="${user==null?'save':'update' }" method="post">
uid
<select name="uid">
<c:forEach items="${user }" var="u">
<option value="${u.uid }">${u.name }</option>
</c:forEach>
</select>
<br>
cid
<select name="cid">
<c:forEach items="${cate }" var="c">
<option value="${c.cid }">${c.cname }</option>
</c:forEach>
</select>
<br>
<input type="submit" value="${user==null?'save':'update' }">

</form>

</body>
</html>