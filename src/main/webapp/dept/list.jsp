<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>部门编号</td>
			<td>部门名字</td>
			<td>部门所在地</td>
		</tr>
		<c:forEach items="${list}" var="dept">
			<tr>
				<td>${dept.deptno }</td>
				<td>${dept.dname }</td>
				<td>${dept.loc }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>