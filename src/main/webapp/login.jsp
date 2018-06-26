<%--
  Created by IntelliJ IDEA.
  User: Ani
  Date: 26.06.2018
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign UP!
    </div>
    <form method="post" action="/login">

        <label for="name">User Name
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input  type="submit"value="Sign Up">
    </form>
</div>
</body>
</html>
