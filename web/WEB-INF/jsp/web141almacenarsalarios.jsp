<%-- 
    Document   : web141almacenarsalarios
    Created on : 14-mar-2021, 20:00:26
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring - Adicionar Salarios - Repaso</title>
    </head>
    <body>
        <h1>Session - Adicionar salarios</h1>
        <a href="web141mostrarsumasalarial.htm">Mostrar suma total</a>
        <c:choose>
            <c:when test="${SALARIO != null}">
                <h1 style="color: red">Salario almacenado: <c:out value="${SALARIO}"/></h1>
            </c:when>
            <c:otherwise>
                <h1 style="color:red">No existen salarios almacenados todavía.</h1>
            </c:otherwise>
        </c:choose>
            
        <ul>
            <c:forEach items="${EMPLEADOS}" var="emp">
                <li><c:out value="${emp.apellido}"/>
                    <a href="web141almacenarsalarios.htm?incrementar=${emp.salario}">almacenar</a></li>
            </c:forEach>
        </ul>
    </body>
</html>
