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

<form action="${student==null?'students':student.stid }" method="post">
<input type="hidden" name="_method" value="${student==null?'post':'put' }">
<input type="hidden" name="stid" value="${student.stid }">
stname<input type="text" name="stname" value="${student.stname }"><br>
score<input type="text" name="score" value="${student.score }"><br>
subjectname<select name="subjectid">
<c:forEach items="${subjects }" var="sub">
<option value="${sub.subjectid }" ${sub.subjectid==student.subjectid?'selected':'' }>${sub.subjectname }</option>
</c:forEach>
</select><br>
teachername<select name="teacherid">
<c:forEach items="${teachers }" var="tea">
<option value="${tea.teacherid }" ${tea.teacherid==student.teacherid?'selected':'' }>${tea.teachername }</option>
</c:forEach>
</select>
<input type="submit" value="${student==null?'save':'update' }">
</form>


</body>
</html>