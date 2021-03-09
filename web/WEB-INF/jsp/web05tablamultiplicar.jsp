<%-- 
    Document   : web05tablamultiplicar
    Created on : 08-mar-2021, 19:24:49
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
        <h1>Tabla Multiplicar</h1>
        <form method="post">
            <label> Multiplicando: </label>
            <input type="text" name="multi"/>
            <button type="submit">Generar tabla</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th>Multiplicando</th>
                    <th>Multiplicador</th>
                    <th>Resultado</th>
                </tr>
            </thead>
            <tbody>
                <!-- Versión 01 -->
                <c:if test="${TABLAMULTI != null}">
                    <c:out value="${TABLAMULTI}" escapeXml="false"/>
                </c:if>

                <br>
                <!-- Versión 02 -->
                <c:forEach items="${TABLAMULTIOBJ}" var="tablam">
                    <tr>
                        <td><c:out value="${tablam.multiplicando}"/></td>
                        <td><c:out value="${tablam.multiplicador}"/></td>
                        <td><c:out value="${tablam.resultado}"/></td>
                    </tr>
                </c:forEach>
            </tbody>              
        </table>
    </body>
</html>
