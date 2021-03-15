<%-- 
    Document   : web15mostrarempleados
    Created on : 15-mar-2021, 0:55:18
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session - Empleados</title>
    </head>
    <body>
        <h1>Lista de empleados en Session</h1>
        <a href="web15almacenarempleados.htm">Almacenar empleados en Session</a><hr/>
        <c:choose>
            <c:when test="${sessionScope.listaids != null}">       
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Apellido</th>
                            <th>Oficio</th>
                            <th>Salario</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${TABLAEMPINSESSION}" var="emp">
                            <tr>
                                <td><c:out value="${emp.id}"/></td>
                                <td><c:out value="${emp.apellido}"/></td>
                                <td><c:out value="${emp.oficio}"/></td>
                                <td><c:out value="${emp.salario}"/></td>
                                <td><a href="web15mostrarempleados.htm?BorrarIdEmp=${emp.id}">Borrar</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <h1 style="color: red">No hay empleados en Session</h1>
            </c:otherwise>
        </c:choose>
    </body>
</html>
