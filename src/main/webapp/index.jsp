<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!-- 开启el表达式的功能，否则不会显示表达式实际的值，而是显示字面值 -->
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h2>Hello World!</h2>--%>
    ${name}
</body>
</html>
