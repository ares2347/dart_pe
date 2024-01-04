<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <title>Employee List</title>
</head>
<body>
<h1> Employee List</h1>
<a href="/employee/form">Create new employee</a>
<br/>
<table class="table">
    <tr>
        <th>No.</th>
        <th>ID</th>
        <th>Name</th>
        <th>Wage</th>
    </tr>
    <c:forEach var="employee" items="${employees}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.wage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>