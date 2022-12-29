<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Realized</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        table, th, td {
            border: 1px solid #070707;
            border-collapse: collapse;
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Trackiti</h1>
</div>
<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <table class="w3-table-all">
        <tr>
            <th>Type</th>
            <th>Name</th>
            <th>Executor</th>
            <th>Details</th>
        </tr>

        <c:forEach items="${realizedList}" var="realized">
            <tr>
                <td><c:out value="${realized.type}"/></td>
                <td><c:out value="${realized.name}"/></td>
                <td><c:out value="${realized.executor}"/></td>
                <td><c:out value="${realized.details}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-cell-bottom" onclick="location.href='/'">Back</button>
</div>

</body>
</html>
