<%-- 
    Document   : web03infoviewcontroller
    Created on : 08-mar-2021, 17:50:32
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
        <h1>Sumar números</h1>
        <form method="post">
            <label>Num 01: </label>
            <input type="text" name="num01" required/>
            <label>Num 02: </label>
            <input type="text" name="num02" required/>
           <button type="submit">Mostrar suma</button>
        </form>
        <c:if test="${RESPUESTA != null}">
            <c:out value="${RESPUESTA}" escapeXml="false"/>
        </c:if>
        
    </body>
</html>
