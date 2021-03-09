<%-- 
    Document   : web04colecciones
    Created on : 08-mar-2021, 18:24:40
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Colecciones personas JSTL</h1>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${PERSONAS}" var="person">
                    <tr>
                        <td><c:out value="${person.nombre}"/></td>
                        <td><c:out value="${person.email}"/></td>
                        <td><c:out value="${person.edad}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
