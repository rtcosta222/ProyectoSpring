<%-- 
    Document   : web17multiaccionesmates
    Created on : 16-mar-2021, 0:33:11
    Author     : lscar
    Práctica   : Quiero un Controller MultiAction
	Caja pidiendo un número y botón para tabla multiplicar.
	Tendremos un botón para mostrar la tabla de multiplicar.
	Otro botón para mostrar los números pares hasta el número que 
	escribamos en la misma caja.
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
        <h1 style="color: red">Variante 01: Dos acciones resueltas en el mismo método.</h1>
        <form method="post" action="web17multiaccionesmates.htm">
            <input type="hidden" name="action" value="operar"/>
            <label>Intro número</label>
            <input type="text" name="cjnum"/>
            <button type="submit" name="tipooper" value="tablamulti">Tabla multi</button>
            <button type="submit" name="tipooper" value="pares">Pares</button>
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
