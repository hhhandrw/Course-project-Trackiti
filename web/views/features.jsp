<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Features</title>
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
            <th></th>
            <th>Name</th>
            <th>Executor</th>
            <th>Details</th>
            <th>Priority</th>
            <th>Status</th>
        </tr>

        <c:forEach items="${features}" var="feature">
            <tr>
                <td><c:out value="${feature.number}"/></td>
                <td><c:out value="${feature.name}"/></td>
                <td><c:out value="${feature.executor}"/></td>
                <td><c:out value="${feature.details}"/></td>
                <td><c:out value="${feature.priority}"/></td>
                <td><c:out value="${feature.status}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-right w3-cell-bottom"
            onclick="location.href='/addFeature'">Add feature
    </button>
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-right w3-cell-bottom"
            onclick="location.href='/editFeature'">Edit feature
    </button>
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-cell-bottom" onclick="location.href='/'">Back
    </button>
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-right w3-cell-bottom"
            onclick="location.href='/sendFeatureToRealized'">Send to realized
    </button>
</div>

</body>
</html>
