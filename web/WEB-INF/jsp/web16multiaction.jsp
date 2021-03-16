<%-- 
    Document   : web16multiaction
    Created on : 15-mar-2021, 19:09:01
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SPRING - Multi-Action</title>
    </head>
    <body>
        <h1>MultiActions</h1>
        <form method="get">
            <input type="hidden" name="accion" value="operar"/>
            <label>Num 01:</label>
            <input type="text" name="num01" required/>
            <label>Num 02:</label>
            <input type="text" name="num02" required/>
            <button type="submit" name="operacion" value="sumar">Suma</button>
            <button type="submit" name="operacion" value="multiplicar">Multiplicación</button>
        </form>
        
        <ul>
            <li><a href="web16multiaction.htm?accion=alta">Alta</a></li>
            <li><a href="web16multiaction.htm?accion=baja">Baja</a></li>
        </ul>
        <h2 style="color: red"><c:out value="${MSG}"/></h2>
    </body>
</html>
