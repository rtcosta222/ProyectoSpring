<%-- 
    Document   : web14mostrarsumasalarial
    Created on : 12-mar-2021, 17:38:04
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
        <h1>Session - Suma salarial</h1>
        <a href="web14almacenarsalarios.htm">Volver a Almacenar</a>
        <c:choose>
            <c:when test="${sessionScope.SUMASAL != null}">
                <h1 style="color:blue"><c:out value="${sessionScope.SUMASAL}"/></h1>
            </c:when>
            <c:otherwise>
                <h1 style="color:blue">No hay sueldos almacenados.</h1>
            </c:otherwise>
        </c:choose>
    </body>
</html>
