<%-- 
    Document   : web171multiaccionesmates
    Created on : 16-mar-2021, 2:38:31
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SPRING - Multi-Acciones</title>
    </head>
    <body>
        <h1>Ejemplo de Multi Acciones</h1>
        <h1 style="color: red">Variante 02: Dos acciones resueltas en métodos distintos.</h1>
        <form method="post" action="web171multiaccionesmates.htm">
            <label>Intro número</label>
            <input type="text" name="cjnum"/>
            <button type="submit" name="accion" value="tablamulti">Tabla multi</button>
            <button type="submit" name="accion" value="pares">Pares</button>
        </form><br>
        <c:if test="${TABLAMULTI != null}">
            <c:forEach items="${TABLAMULTI}" var="row">
                <c:out value="${row}"/>
            </c:forEach>
        </c:if>
        <c:if test="${PARES != null}">
            <c:forEach items="${PARES}" var="row">
                <c:out value="${row}"/>
            </c:forEach>
        </c:if>
    </body>
</html>
