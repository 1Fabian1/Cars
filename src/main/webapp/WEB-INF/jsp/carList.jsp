<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 31.07.2019
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car List</title>
</head>
<body>
<h1>Car List</h1>
<br/><br/>
<div>
    <table border = "1">
        <tr>
            <th>Brand</th>
            <th>Model</th>
            <th>Year</th>
        </tr>
        <c:forEach items="${cars}" var="xd">
            <tr>
                <td>${xd.brand}</td>
                <td>${xd.model}</td>
                <td>${xd.year}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
