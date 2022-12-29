<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send To Realized</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Trackiti</h1>
</div>
<div class="w3-container w3-padding">
    <%
        if (request.getAttribute("realized") != null) {
            out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                    "   <h5>Sent!</h5>\n" +
                    "</div>");
        }
    %>
    <div class="w3-card-4">
        <form method="post" class="w3-selection w3-light-grey w3-padding">
            <label>Feature number:
                <input type="number" name="number" class=" w3-input w3-animate-input w3-border w3-round-large"
                style="width: 30%"><br/>
            </label>
            <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Submit</button>
        </form>
    </div>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-cell-bottom" onclick="location.href='/features'">Back
    </button>
    <button class="w3-btn w3-hover-light-blue w3-round-large w3-cell-bottom" onclick="location.href='/realized'">Move to
        realized
    </button>
</div>
</body>
</html>
