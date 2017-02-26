<%--
  Created by IntelliJ IDEA.
  User: fy
  Date: 2017/2/25
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <h1>this is the result of get all user</h1>
    <c:if test="${!empty userList}">
        <c:forEach var="user" items="${userList}">
            姓名：${user.username} &nbsp;&nbsp;手机号：${user.mobile} &nbsp;&nbsp;邮箱：${user.email} &nbsp;&nbsp;<br>
        </c:forEach>
    </c:if>

    <h1>this is the information of user whose id is 1</h1>
    <c:if test="${!empty user}">
        姓名：${user.username} &nbsp;&nbsp;手机号：${user.mobile} &nbsp;&nbsp;邮箱：${user.email} &nbsp;&nbsp;<br>
    </c:if>

</body>
</html>
