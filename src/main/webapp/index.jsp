<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/24/2018
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <label for="name">User name

        <input type="text" id="name" name="name">
    </label>
    <label for="birthdate">BirthDate
        <input type="text" id="birthdate" name="birthdate">
    </label>

    <label for="password">Password
        <input type="password" id="password" name="password">
    </label>
    <input type="submit" value="SignUp">
</form>
</body>
</html>
