<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getContextPath();
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${path }/emp/add" method="post" enctype="multipart/form-data">
		员工姓名:<input type="text" name="ename" /><br>
		员工工资:<input type="text" name="esal" /><br>
		员工奖金:<input type="text" name="comm" /><br>
		工作:<select name="job">
			<option>====选择工作=====</option>
			<c:forEach items="${all }" var="emp">
				<option >${emp.job }</option>
			</c:forEach>
		</select><br>
		上级:<select name="mrg">
			<option>====选择领导====</option>
			<c:forEach items="${set }" var="set">
				<option value="${set.empno}" >${set.ename}</option>
			</c:forEach>
		</select><br>
		所在部门:<select name="deptno">
			<option>====选择部门====</option>
			<c:forEach items="${list }" var="dept">
				<option value="${dept.deptno }">${dept.dname }</option>
			</c:forEach>
		</select><br>
		雇佣日期:<input type="date" name="hiredate" /><br>
		添加头像:<input type="file" name="tx" /><br>
		<input type="submit" value="提交" />
	</form>
</body>
</html>