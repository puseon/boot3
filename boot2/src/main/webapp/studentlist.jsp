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
<form action="" method="post">
<input type="hidden" name="_method" value="delete">
<table border="1" width="80%">
<tr>
	<td>stid</td>
	<td>stname</td>
	<td>score</td>
	<td>subjectid</td>
	<td>teacherid</td>
	<td>操作</td>
</tr>

<c:forEach items="${list }" var="li">
<tr>
	<td>${li.stid }</td>
	<td>${li.stname }</td>
	<td>${li.score }</td>
	<td>${li.subject.subjectname }</td>
	<td>${li.teacher.teachername }</td>
	<td>
	<a href="students/${li.stid }">修改</a>
	<a href="javascript:deleteItem(${li.stid })">刪除</a>
	</td>
</tr>
</c:forEach>
</table>
</form>

</body>
</html>
<a href="goInput">增加</a>

<script>
	function deleteItem(stid){
		document.forms[0].action="students/"+stid;
		document.forms[0].submit();

		}


</script>
