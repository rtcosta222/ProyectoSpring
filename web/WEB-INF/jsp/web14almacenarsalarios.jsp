<%-- 
    Document   : web14almacenarsalario
    Created on : 12-mar-2021, 16:44:13
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring</title>
    </head>
    <body>
        <h1>Session - Almacenar Salarios</h1>
        <a href="web14mostrarsumasalarial.htm">Mostrar suma salarial</a>
        <c:choose>
            <c:when test="${SALARIO != null}">
                <h1 style="color:red">Salario almacenado: <c:out value="${SALARIO}"/></h1>                
            </c:when>
            <c:otherwise>
                <h1 style="color:red">No existen salarios almacenados todavía.</h1>
            </c:otherwise>
        </c:choose>
                
        <ul>
            <c:forEach items="${EMPLEADOS}" var="emp">
                <li><c:out value="${emp.apellido}"/>
                <a href="web14almacenarsalarios.htm?salario=${emp.salario}">Almacenar</a></li>
            </c:forEach>
        </ul>
    </body>
</html>
