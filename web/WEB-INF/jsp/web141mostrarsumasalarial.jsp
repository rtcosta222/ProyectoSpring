<%-- 
    Document   : web141mostrarsumasalarial
    Created on : 14-mar-2021, 20:30:56
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring - Salarios en Session - Repaso</title>
    </head>
    <body>
        <h1>Total almacenado de salários</h1>
        <a href="web141almacenarsalarios.htm">Volver a almacenar salarios</a>
        <c:choose>
            <c:when test="${sessionScope.SUMASAL != null}">
                <h1>Total de salarios almacenado: <c:out value="${sessionScope.SUMASAL}"/></h1>
            </c:when>
            <c:otherwise>
                <h1>Nohay salarios almacenados todavía.</h1>
            </c:otherwise>
        </c:choose>
    </body>
</html>
