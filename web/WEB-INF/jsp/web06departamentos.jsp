<%-- 
    Document   : web06departamentos
    Created on : 09-mar-2021, 16:46:11
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring - First Database Access</title>
    </head>
    <body>
        <h1>Departamentos</h1>
        <table>
            <thead>
                <tr>
                    <th>Num.</th>
                    <th>Nom.</th>
                    <th>Loc.</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${DEPARTAMENTOS}" var="dept">
                    <tr>
                        <td><c:out value="${dept.dnum}"/></td>
                        <td><c:out value="${dept.dnom}"/></td>
                        <td><c:out value="${dept.dloc}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
