<%@ page import="java.util.ArrayList" %>
<%@ page import="am.aro.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //noinspection unchecked
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("usersFromServer"); %>

<table>
    <tr>
        <th>Username</th>
        <th>Birhdate</th>
    </tr>
    <% for (User user : users) {
    %>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getBirthDaye()%></td>
    </tr>
    <%}%>
</table>

</body>
</html>
