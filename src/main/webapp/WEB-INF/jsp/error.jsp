<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>异常提示页面</title>
</head>
<body>
<h3>系统出现异常</h3>
<p>${errorMsg}</p>
<a href="${pageContext.request.contextPath}/index.jsp">返回首页</a>
</body>
</html>