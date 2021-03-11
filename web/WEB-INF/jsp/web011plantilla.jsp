<%-- 
    Document   : web011plantilla
    Created on : 11-mar-2021, 2:49:18
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
        <h1>Plantilla</h1>
        <table>
            <thead>
                <tr>
                    <th>Hcod</th>
                    <th>Scod</th>
                    <th>Empno</th>
                    <th>Ape</th>
                    <th>Func</th>
                    <th>T</th>
                    <th>Sal</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${PLANTILLA}" var="plant">
                    <tr>
                        <td><c:out value="${plant.hcod}"/></td>
                        <td><c:out value="${plant.scod}"/></td>
                        <td><c:out value="${plant.empno}"/></td>
                        <td><c:out value="${plant.ape}"/></td>
                        <td><c:out value="${plant.fun}"/></td>
                        <td><c:out value="${plant.t}"/></td>
                        <td><c:out value="${plant.sal}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
