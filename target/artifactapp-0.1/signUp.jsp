<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please SignUp !
    </div>
    <form method="post" action="signUp">
        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label><br>
        <label for="birthdate">BirthDate
            <input class="input-field" type="birthdate" id="birthdate" name="birthdate">
        </label><br>


        <label for="password">Password
            <input  class="input-field" type="password" id="password" name="password">
        </label><br>

        <input type="submit" value="SignUp">
    </form>
</div>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Already registered!
    </div>
    <table>
        <tr>
            <th>User name</th>
            <th>Birth Date</th>
        </tr>
        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.birthDaye}</td>
            </tr>

        </c:forEach>
    </table>


</div>

</body>
</html>
