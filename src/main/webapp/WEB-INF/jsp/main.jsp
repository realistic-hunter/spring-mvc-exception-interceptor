<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
</head>
<body>
<c:if test="${sessionScope.username!=null}">
    <p>当前用户：${sessionScope.username}</p>
    <p><a href="tologout">注销</a></p>
    <p><a href="${pageContext.request.contextPath}/index.jsp">返回首页</a></p>
</c:if>
<p>欢迎进入系统管理端</p>
</body>
</html>
